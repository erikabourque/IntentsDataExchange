package com.example.a1141669.intentsdataexchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ImageActivity extends AppCompatActivity {
    static final int INPUT_REQUEST = 1;
    static final int DAVE_REQUEST = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
    }

    public void launchInputActivity(View v)
    {
        Intent intent = new Intent(this, InputActivity.class);

        startActivityForResult(intent, INPUT_REQUEST);
    }

    public void launchDaveActivity(View v)
    {
        Intent intent = new Intent(this, DaveActivity.class);

        startActivityForResult(intent, DAVE_REQUEST);
    }

    protected void onActivityResult(int request, int resultCode, Intent data)
    {
        // Both do same thing, check for either one
        if ((request == INPUT_REQUEST) || (request == DAVE_REQUEST))
        {
            // Make sure there is a result
            if (resultCode == RESULT_OK)
            {
                // Send result back to calling activity
                setResult(RESULT_OK, data);
                finish();
            }
        }
    }
}
