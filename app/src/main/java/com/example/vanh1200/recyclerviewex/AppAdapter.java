package com.example.vanh1200.recyclerviewex;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.ViewHolder> {
    private static final String TEXT_FACEBOOK = "facebook";
    private ArrayList<App> mApps;
    private ItemClickListener mListener;

    public AppAdapter(ArrayList<App> apps) {
        mApps = apps;
    }

    public void setListener(ItemClickListener listener) {
        mListener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_item_layout,
                viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.bindData(mApps.get(i));
    }

    @Override
    public int getItemCount() {
        return mApps == null ? 0 : mApps.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mTextTitle;
        private ImageView mImageCover;
        private App mApp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            initViews(itemView);
        }

        private void initViews(View itemView) {
            mTextTitle = itemView.findViewById(R.id.text_title);
            mImageCover = itemView.findViewById(R.id.image_cover);
        }

        public void bindData(final App app) {
            mApp = app;
            mTextTitle.setText(app.getTitle());
            if (app.getImage().equalsIgnoreCase(TEXT_FACEBOOK)) {
                mImageCover.setImageResource(R.drawable.facebook);
            } else {
                mImageCover.setImageResource(R.drawable.instagram);
            }
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mListener.onItemClick(mApp);
        }
    }

    public interface ItemClickListener {
        void onItemClick(App app);
    }
}
