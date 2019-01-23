package com.wonderingwall.baserecycler;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.wonderingwall.ui.baserecycler.base.BaseRecyclerViewAdapter;
import com.wonderingwall.ui.baserecycler.impl.adapter.DefaultRecyclerViewAdapter;
import com.wonderingwall.ui.baserecycler.impl.factory.DefaultRecyclerViewHolderFactory;
import com.wonderingwall.ui.baserecycler.impl.items.IconItem;
import com.wonderingwall.ui.baserecycler.impl.items.LabelItem;

public class MainActivity extends Activity implements View.OnClickListener, BaseRecyclerViewAdapter.OnItemClickListener {
    /***/
    private RecyclerView recyclerView;
    private DefaultRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        initView();
        initViewData();
    }

    private void initView()  {
        // Step 1  初始化
        recyclerView = (RecyclerView) findViewById(R.id.demo_main_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DefaultRecyclerViewAdapter(new DefaultRecyclerViewHolderFactory());
        adapter.setOnItemClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    private void initViewData() {
        // Step 2  添加数据
        adapter.add(0, new LabelItem("Label"));
        adapter.add(1, new IconItem(R.mipmap.ic_launcher, null));
        adapter.add(new IconItem(R.mipmap.ic_launcher, this));
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "all i :" + v.getClass().getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClicked(View v, int position) {
        Toast.makeText(this, "all :" + v.getClass().getName(), Toast.LENGTH_SHORT).show();
    }

    public void onClickAdd(View view) {
        int index = adapter.getItemCount();
//        adapter.add(index, new LabelItem("新添加的" + index));
        adapter.add(new LabelItem("New Label " + index));
    }

    public void onClickRemove(View view) {
        if (adapter.getItemCount() > 0) {
            adapter.remove(adapter.getItemCount() -1);
        }
    }
}
