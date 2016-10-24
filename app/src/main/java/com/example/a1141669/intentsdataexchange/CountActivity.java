package com.example.a1141669.intentsdataexchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
    }

    public void returnOne(View v)
    {
        Intent intent = new Intent();
        intent.putExtra("result", getResources().getString(R.string.oneStr));

        setResult(RESULT_OK, intent);
        finish();
    }

    public void returnTwo(View v)
    {
        Intent intent = new Intent();
        intent.putExtra("result", getResources().getString(R.string.twoStr));

        setResult(RESULT_OK, intent);
        finish();
    }
}
