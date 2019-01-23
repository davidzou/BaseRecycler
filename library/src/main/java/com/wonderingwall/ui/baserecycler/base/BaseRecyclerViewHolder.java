package com.wonderingwall.ui.baserecycler.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * @author DavidZou -- wearecisco@gmail.com
 * @version 1.0.0
 * @date 2018-08-23
 */
public abstract class BaseRecyclerViewHolder extends RecyclerView.ViewHolder {

    public BaseRecyclerViewHolder(View itemView) {
        super(itemView);
    }

    /**
     * @param data                  被绑定的数据
     * @param onClickListener       Item监听
     */
    protected abstract void onBindViewHolder(BaseRecyclerViewItem data, BaseRecyclerViewAdapter.OnItemClickListener onClickListener);

}
