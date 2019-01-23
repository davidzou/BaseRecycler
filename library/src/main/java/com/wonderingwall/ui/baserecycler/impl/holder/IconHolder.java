package com.wonderingwall.ui.baserecycler.impl.holder;

import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;

import com.wonderingwall.ui.baserecycler.R;
import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewAdapter;
import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewHolder;
import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewItem;
import com.wonderingwall.ui.baserecycler.impl.items.IconItem;

/**
 * 当中图片ICON显示<br>
 */
public class IconHolder extends BaseRecyclerViewHolder {

    private ImageView imageView;

    public IconHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.recyclerview_item_icon_view);
    }

    public IconHolder(View itemView, View.OnClickListener listener) {
        super(itemView);
    }

    @Override
    protected void onBindViewHolder(BaseRecyclerViewItem data, final BaseRecyclerViewAdapter.OnItemClickListener clickListener) {
        if (data instanceof IconItem) {
            imageView.setImageResource(((IconItem) data).getResId());
            if (data.getEnable()) {
                return;
            }
            // 点击事件回调
            if (((IconItem) data).getOnClickListener() != null) {
                imageView.setOnClickListener(((IconItem) data).getOnClickListener());
            } else {
                ((View) imageView.getParent()).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clickListener.onClicked(((View) imageView.getParent()).getRootView(), getOldPosition());
                    }
                });
            }
        }
    }
}
