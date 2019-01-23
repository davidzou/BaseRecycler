package com.wonderingwall.ui.baserecycler.impl.holder;

import android.view.View;
import android.widget.TextView;

import com.wonderingwall.ui.baserecycler.R;
import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewAdapter;
import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewHolder;
import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewItem;
import com.wonderingwall.ui.baserecycler.impl.items.LabelItem;

/**
 * @author DavidZou -- wearecisco@gmail.com
 * @version 1.0.0
 * @date 2018-11-21
 */
public class SingleLabelHolder extends BaseRecyclerViewHolder {
    /**
     * 文字标签<br>
     */
    private TextView mLabel;

    public SingleLabelHolder(View itemView) {
        super(itemView);
        mLabel = itemView.findViewById(R.id.recyclerview_item_label_view);
    }


    @Override
    public void onBindViewHolder(BaseRecyclerViewItem data, BaseRecyclerViewAdapter.OnItemClickListener onClickListener) {
        if (data instanceof LabelItem) {
            mLabel.setText(((LabelItem) data).getLabel());
        }
    }
}
