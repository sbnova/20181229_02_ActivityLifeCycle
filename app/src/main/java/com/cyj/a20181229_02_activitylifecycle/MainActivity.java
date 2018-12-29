package com.cyj.a20181229_02_activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    private android.widget.Button moveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();

        Toast.makeText(mContext, "Main - onCreate", Toast.LENGTH_SHORT).show();
        Log.d("Main", "onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(mContext, "Main - onResume", Toast.LENGTH_SHORT).show();
        Log.d("Main", "onResume");
    }

    @Override
    public void setupEvents() {
        moveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, NextActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void setValues() {

    }


    @Override
    public void bindViews() {
        this.moveBtn = (Button) findViewById(R.id.moveBtn);

    }
}
