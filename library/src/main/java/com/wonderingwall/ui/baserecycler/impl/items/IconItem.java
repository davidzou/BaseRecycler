package com.wonderingwall.ui.baserecycler.impl.items;

import android.support.annotation.DrawableRes;
import android.view.View;

import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewItem;
import com.wonderingwall.ui.baserecycler.impl.constant.ViewType;

/**
 * 单条图片显示。<br>
 *     +---------------------+
 *     |   Icon              |
 *     +---------------------+
 * @author DavidZou -- wearecisco@gmail.com
 * @version 1.0.0
 * @date 2018-11-20
 */
public class IconItem implements BaseRecyclerViewItem {
    private int resId;

    private View.OnClickListener onClickListener;

    public IconItem(@DrawableRes int id) {
        this.resId = id;
    }

    public IconItem(@DrawableRes int id, View.OnClickListener onClickListener) {
        this.resId = id;
        this.onClickListener = onClickListener;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int getViewType() {
        return ViewType.VIEW_TYPE_ICON;
    }

    @Override
    public boolean getEnable() {
        return false;
    }

    @Override
    public Options getOptions() {
        return null;
    }

    public int getResId() {
        return resId;
    }

    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }
}
