package com.wonderingwall.ui.baserecycler.base;


/**
 * 基础RecyclerView控件，包含在Recycler中List的数据类型超类。
 * @author DavidZou -- wearecisco@gmail.com
 * @version 1.0.0
 * @date 2018-08-23
 */
public interface BaseRecyclerViewItem {
    /**
     * 自定义ID，Item的。
     * 用以区分相同的实现。
     * @return  {@link Integer#intValue()}
     */
    int getId();

    /**
     * 界面类型，对应不同Holder。
     * @return  {@link Integer#intValue()}
     */
    int getViewType();

    /**
     * 是否可用，比如登录和注册按钮，登录后，注册按钮为不可用状态。
     */
    boolean getEnable();


    /**
     * 当前Item布局相关参数设置。<br>
     * @return {@link Options}
     */
    Options getOptions();

    /**
     * 自定义参数<br>
     *     包含了颜色，大小，边距，背景的设置。
     */
    interface Options {

    }
}
