package com.wonderingwall.ui.baserecycler.base;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author DavidZou -- wearecisco@gmail.com
 * @version 1.0.0
 * @date 2018-08-23
 */
public abstract class BaseRecyclerViewAdapter<T extends BaseRecyclerViewItem> extends RecyclerView.Adapter<BaseRecyclerViewHolder> {
    /***/
    private List<T> dataList;
    /***/
    private BaseRecyclerViewHolderFactory baseRecyclerViewHolderFactory;

    /**
     * 全局的监听，即整个Item点击事件。
     */
    private OnItemClickListener onClickListener;


    /**
     * @param baseRecyclerViewHolderFactory  <br>
     * @param <H>   {@linkplain BaseRecyclerViewHolder ViewHolder}
     */
    public <H extends BaseRecyclerViewHolderFactory > BaseRecyclerViewAdapter(H baseRecyclerViewHolderFactory) {
        this(new ArrayList<T>(16), baseRecyclerViewHolderFactory);
    }

    /**
     * @param dataList                          数据队列
     * @param baseRecyclerViewHolderFactory     Holder工厂
     * @param <H>                               {@link BaseRecyclerViewHolderFactory}
     */
    public <H extends BaseRecyclerViewHolderFactory > BaseRecyclerViewAdapter(List<T> dataList, H baseRecyclerViewHolderFactory) {
        this(dataList, baseRecyclerViewHolderFactory, null);
    }

    /**
     * @param dataList                          数据队列
     * @param baseRecyclerViewHolderFactory     Holder工厂
     * @param clickListener                     点击事件回调
     * @param <H>                               {@link BaseRecyclerViewHolderFactory}
     */
    public <H extends BaseRecyclerViewHolderFactory > BaseRecyclerViewAdapter(List<T> dataList, H baseRecyclerViewHolderFactory, OnItemClickListener clickListener) {
        this.dataList = dataList;
        this.baseRecyclerViewHolderFactory = baseRecyclerViewHolderFactory;
        this.onClickListener = clickListener;
    }


    @NonNull
    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return baseRecyclerViewHolderFactory.createViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseRecyclerViewHolder holder, int position) {
        if (dataList != null && dataList.size() > 0) {
            holder.onBindViewHolder( dataList.get(position), onClickListener);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (dataList != null && dataList.size() > 0) {
            return dataList.get(position).getViewType();
        }
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size();
    }

    public OnItemClickListener getOnItemClickListener() {
        return onClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    // 增

    protected void add(T item) {
        this.dataList.add(item);
        notifyItemInserted(this.dataList.size() - 1 );
        notifyDataSetChanged();
    }

    protected void add(int index, T item) {
        if (index < 0) {
            throw new IllegalArgumentException("Not support index is '" + index + "', it must be grate than zero.");
        }
        this.dataList.add(index, item);
        notifyItemChanged(index);
        notifyDataSetChanged();
    }

    protected void addAll(Collection<T> dataList) {
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }


    // 删

    protected T delete(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Not support index is '" + index + "', it must be grate than zero.");
        }
        if (this.dataList.size() <= index) {
            return null;
        }
        T data = this.dataList.remove(index);
        if (data != null) {
            notifyItemRemoved(index);
            notifyDataSetChanged();
        }
        return data;
    }

    protected T remove(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Not support index is '" + index + "', it must be grate than zero.");
        }
        if (this.dataList.size() <= index) {
            return null;
        }
        T data = this.dataList.remove(index);
        if (data != null) {
            notifyItemRemoved(index);
            notifyDataSetChanged();
        }
        return data;
    }

    protected boolean delete(T item) {
        if (!this.dataList.contains(item)) {
            return false;
        }
        int index = this.dataList.indexOf(item);
        boolean success = this.dataList.remove(item);
        if (success) {
            notifyItemRemoved(index);
            notifyDataSetChanged();
        } else {
            notifyDataSetChanged();
        }
        return success;
    }

    // 改

    protected T update(int index, T item) {
        if (index < 0) {
            throw new IllegalArgumentException("Not support index is '" + index + "', it must be grate than zero.");
        }
        T data = this.dataList.set(index, item);
        notifyItemChanged(index);
        notifyDataSetChanged();
        if (data == item) {
            return item;
        }
        return (T) data;
    }

    // 查

    protected T get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Not support index is '" + index + "', it must be grate than zero.");
        }
        return this.dataList.get(index);
    }


    protected void setDataList(List<T> dataList) {
        this.dataList = dataList;
        notifyDataSetChanged();
    }

    /**
     * Item点击事件监听<br>
     */
    public interface OnItemClickListener {
        /**
         * 被点击的view
         * @param v             Clicked View
         * @param position      Position in list
         */
        void onClicked(View v, int position);
    }


}
