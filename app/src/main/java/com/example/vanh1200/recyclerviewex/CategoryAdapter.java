package com.example.vanh1200.recyclerviewex;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private ArrayList<Category> mCategories;
    private AppAdapter.ItemClickListener mListener;

    public CategoryAdapter(ArrayList<Category> categories) {
        mCategories = categories;
    }

    public void setListener(AppAdapter.ItemClickListener listener) {
        mListener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.category_item_layout,
                viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bindData(mCategories.get(i));
    }

    @Override
    public int getItemCount() {
        return mCategories == null ? 0 : mCategories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextCategory;
        private RecyclerView mAppsRecycler;
        private ArrayList<App> mApps;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            initViews(itemView);
        }

        private void initViews(View itemView) {
            mTextCategory = itemView.findViewById(R.id.text_category);
            mAppsRecycler = itemView.findViewById(R.id.recycler_apps);
        }

        public void bindData(Category category) {
            mTextCategory.setText(category.getName());
            mApps = category.getApps();
            AppAdapter appAdapter = new AppAdapter(mApps);
            appAdapter.setListener(mListener);
            mAppsRecycler.setAdapter(appAdapter);
        }
    }
}
