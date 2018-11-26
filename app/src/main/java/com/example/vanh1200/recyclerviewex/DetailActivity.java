package com.example.vanh1200.recyclerviewex;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView mTextDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_detail);
        initViews();
        getIncomingIntent();
    }

    private void initViews() {
        mTextDescription = findViewById(R.id.text_description);
    }

    private void getIncomingIntent() {
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra(Key.KEY_APP)) {
                App app = (App) intent.getExtras().getSerializable(Key.KEY_APP);
                mTextDescription.setText(app.getDescription());
            }
        }
    }

    public static Intent getDetailIntent(Context context, App app) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(Key.KEY_APP, app);
        return intent;
    }
}
