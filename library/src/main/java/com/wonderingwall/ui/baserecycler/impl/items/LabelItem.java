package com.wonderingwall.ui.baserecycler.impl.items;


import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewItem;
import com.wonderingwall.ui.baserecycler.impl.constant.ViewType;

/**
 * 单条文字显示，没有事件。<br>
 *     +---------------------+
 *     |   Label             |
 *     +---------------------+
 * @author DavidZou -- wearecisco@gmail.com
 * @version 1.0.0
 * @date 2018-11-20
 */
public class LabelItem implements BaseRecyclerViewItem {
    /***/
    private int id;
    /***/
    private String label;

    public LabelItem(String label) {
        this.label = label;
    }

    public LabelItem(int id, String label) {
        this.id = id;
        this.label = label;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getViewType() {
        return ViewType.VIEW_TYPE_LABEL;
    }

    @Override
    public boolean getEnable() {
        return false;
    }

    @Override
    public Options getOptions() {
        return null;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
