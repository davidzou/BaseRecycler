package com.wonderingwall.ui.baserecycler.impl.factory;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wonderingwall.ui.baserecycler.R;
import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewHolder;
import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewHolderFactory;
import com.wonderingwall.ui.baserecycler.impl.constant.ViewType;
import com.wonderingwall.ui.baserecycler.impl.holder.DefaultHolder;
import com.wonderingwall.ui.baserecycler.impl.holder.IconHolder;
import com.wonderingwall.ui.baserecycler.impl.holder.SingleLabelHolder;

/**
 * 预定义默认实现<br>
 * @author DavidZou -- wearecisco@gmail.com
 * @version 1.0.0
 * @date 2018-11-21
 */
public class DefaultRecyclerViewHolderFactory implements BaseRecyclerViewHolderFactory {

    @SuppressWarnings("unchecked")
    @Override
    public <T extends BaseRecyclerViewHolder> T createViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case ViewType.VIEW_TYPE_LABEL: {
                // LabelItem
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_label, parent, false);
                return (T) new SingleLabelHolder(view);
            }
            case ViewType.VIEW_TYPE_ICON: {
                // IconItem
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_icon, parent, false);
                return (T) new IconHolder(view);
            }
            default: {
                // emptyItem
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_empty, parent, false);
                return (T) new DefaultHolder(view);
            }
        }
    }
}
