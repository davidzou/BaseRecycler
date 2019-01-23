package com.wonderingwall.ui.baserecycler.impl.adapter;

import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewAdapter;
import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewHolderFactory;
import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewItem;

import java.util.Collection;
import java.util.List;

/**
 * @author DavidZou -- wearecisco@gmail.com
 * @version 1.0.0
 * @date 2018-11-15
 */
public class DefaultRecyclerViewAdapter extends BaseRecyclerViewAdapter<BaseRecyclerViewItem> {

    public <H extends BaseRecyclerViewHolderFactory> DefaultRecyclerViewAdapter(H baseRecyclerViewHolderFactory) {
        super(baseRecyclerViewHolderFactory);
    }

    public <H extends BaseRecyclerViewHolderFactory> DefaultRecyclerViewAdapter(List<BaseRecyclerViewItem> dataList, H baseRecyclerViewHolderFactory) {
        super(dataList, baseRecyclerViewHolderFactory);
    }

    public <H extends BaseRecyclerViewHolderFactory> DefaultRecyclerViewAdapter(List<BaseRecyclerViewItem> dataList, H baseRecyclerViewHolderFactory, OnItemClickListener clickListener) {
        super(dataList, baseRecyclerViewHolderFactory, clickListener);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public void add(BaseRecyclerViewItem item) {
        super.add(item);
    }

    @Override
    public void add(int index, BaseRecyclerViewItem item) {
        super.add(index, item);
    }

    @Override
    public void addAll(Collection<BaseRecyclerViewItem> dataList) {
        super.addAll(dataList);
    }

    @Override
    public BaseRecyclerViewItem delete(int index) {
        return super.delete(index);
    }

    @Override
    public BaseRecyclerViewItem remove(int index) {
        return super.remove(index);
    }

    @Override
    public boolean delete(BaseRecyclerViewItem item) {
        return super.delete(item);
    }

    @Override
    public BaseRecyclerViewItem update(int index, BaseRecyclerViewItem item) {
        return super.update(index, item);
    }

    @Override
    public BaseRecyclerViewItem get(int index) {
        return super.get(index);
    }

    @Override
    protected void setDataList(List<BaseRecyclerViewItem> dataList) {
        super.setDataList(dataList);
    }
}
