package com.example.vanh1200.recyclerviewex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AppAdapter.ItemClickListener {
    private CategoryAdapter mCategoryAdapter;
    private RecyclerView mCategoryRecycler;
    private ArrayList<Category> mCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initDumpData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        mCategoryRecycler.setLayoutManager(new LinearLayoutManager(this));
        mCategoryAdapter = new CategoryAdapter(mCategories);
        mCategoryAdapter.setListener(this);
        mCategoryRecycler.setAdapter(mCategoryAdapter);
    }

    private void initDumpData() {
        mCategories = new ArrayList<>();
        ArrayList<App> appList = new ArrayList<>();
        ArrayList<App> appList2 = new ArrayList<>();
        ArrayList<App> appList3 = new ArrayList<>();
        ArrayList<App> appList4 = new ArrayList<>();
        ArrayList<App> appList5 = new ArrayList<>();
        ArrayList<App> appList6 = new ArrayList<>();

        appList.add(new App("title 1", "facebook", "description 1"));
        appList.add(new App("title 2", "facebook", "description 2"));
        appList.add(new App("title 3", "facebook", "description 3"));
        appList.add(new App("title 4", "facebook", "description 4"));
        appList.add(new App("title 5", "facebook", "description 5"));
        appList.add(new App("title 6", "facebook", "description 6"));
        appList2.add(new App("title 1", "instagram", "description 1"));
        appList2.add(new App("title 2", "instagram", "description 2"));
        appList2.add(new App("title 3", "instagram", "description 3"));
        appList2.add(new App("title 4", "instagram", "description 4"));
        appList2.add(new App("title 5", "instagram", "description 5"));
        appList2.add(new App("title 6", "instagram", "description 6"));
        appList3.add(new App("title 1", "facebook", "description 1"));
        appList3.add(new App("title 2", "facebook", "description 2"));
        appList3.add(new App("title 3", "facebook", "description 3"));
        appList3.add(new App("title 4", "facebook", "description 4"));
        appList3.add(new App("title 5", "facebook", "description 5"));
        appList3.add(new App("title 6", "facebook", "description 6"));
        appList4.add(new App("title 1", "instagram", "description 1"));
        appList4.add(new App("title 2", "instagram", "description 2"));
        appList4.add(new App("title 3", "instagram", "description 3"));
        appList4.add(new App("title 4", "instagram", "description 4"));
        appList4.add(new App("title 5", "instagram", "description 5"));
        appList4.add(new App("title 6", "instagram", "description 6"));
        appList5.add(new App("title 1", "facebook", "description 1"));
        appList5.add(new App("title 2", "facebook", "description 2"));
        appList5.add(new App("title 3", "facebook", "description 3"));
        appList5.add(new App("title 4", "facebook", "description 4"));
        appList5.add(new App("title 5", "facebook", "description 5"));
        appList5.add(new App("title 6", "facebook", "description 6"));
        appList6.add(new App("title 1", "instagram", "description 1"));
        appList6.add(new App("title 2", "instagram", "description 2"));
        appList6.add(new App("title 3", "instagram", "description 3"));
        appList6.add(new App("title 4", "instagram", "description 4"));
        appList6.add(new App("title 5", "instagram", "description 5"));
        appList6.add(new App("title 6", "instagram", "description 6"));

        mCategories.add(new Category("Facebook", appList));
        mCategories.add(new Category("Instagram", appList2));
        mCategories.add(new Category("Facebook", appList3));
        mCategories.add(new Category("Instagram", appList4));
        mCategories.add(new Category("Facebook", appList5));
        mCategories.add(new Category("Instagram", appList6));
    }

    private void initViews() {
        mCategoryRecycler = findViewById(R.id.recycler_categories);
    }

    @Override
    public void onItemClick(App app) {
        startActivity(DetailActivity.getDetailIntent(this, app));
    }
}
