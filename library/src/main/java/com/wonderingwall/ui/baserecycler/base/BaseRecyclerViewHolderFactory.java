package com.wonderingwall.ui.baserecycler.base;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * @author DavidZou -- wearecisco@gmail.com
 * @version 1.0.0
 * @date 2018-08-23
 */
public interface BaseRecyclerViewHolderFactory {

    /**
     * 创建ViewHolder，其中保存的是布局对象，可以做隐藏等操作
     * @param parent        <br>
     * @param viewType      {@linkplain com.wonderingwall.ui.baserecycler.impl.constant.ViewType CustomViewType}<br>
     * @param <VH>          {@link BaseRecyclerViewHolder}
     * @return              {@link RecyclerView.ViewHolder}
     */
    <VH extends BaseRecyclerViewHolder> VH createViewHolder(@NonNull ViewGroup parent, int viewType);

}
