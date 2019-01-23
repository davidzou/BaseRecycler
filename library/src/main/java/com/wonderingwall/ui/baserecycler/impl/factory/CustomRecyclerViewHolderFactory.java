package com.wonderingwall.ui.baserecycler.impl.factory;

import android.support.annotation.NonNull;
import android.view.ViewGroup;

import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewHolder;
import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewHolderFactory;
import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewItem;

/**
 * 自定义Holder实现<br>
 *
 *     <pre>
 *         recyclerView = (RecyclerView) findViewById(R.id.demo_main_recycler_view);
 *         recyclerView.setHasFixedSize(true);
 *         recyclerView.setLayoutManager(new LinearLayoutManager(this));
 *         CustomRecyclerViewHolderFactory factory = new CustomRecyclerViewHolderFactory();
 *         factory.addSupport(holder, item);
 *         adapter = new DefaultRecyclerViewAdapter(factory);
 *         adapter.setOnItemClickListener(this);
 *         recyclerView.setAdapter(adapter);
 *     </pre>
 * @author DavidZou -- wearecisco@gmail.com
 * @version 1.0.0
 * @date 2019/1/23
 */
public class CustomRecyclerViewHolderFactory implements BaseRecyclerViewHolderFactory {

    @Override
    public <VH extends BaseRecyclerViewHolder> VH createViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }


    /**
     * 添加自定义支持<br>
     * @param holder
     * @param item
     */
    public void addSupport(BaseRecyclerViewHolder holder, BaseRecyclerViewItem item) {

    }
}
