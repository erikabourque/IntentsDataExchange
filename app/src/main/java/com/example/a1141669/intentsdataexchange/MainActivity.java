package com.example.a1141669.intentsdataexchange;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    static final int COUNT_REQUEST = 1;
    static final int IMAGE_REQUEST = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int request, int resultCode, Intent data)
    {
        // Both do same thing, check for either one
        if ((request == COUNT_REQUEST) || (request == IMAGE_REQUEST))
        {
            // Make sure there is a result
            if (resultCode == RESULT_OK)
            {
                TextView tv = (TextView) findViewById(R.id.resultTxtView);
                tv.setText(data.getExtras().getString("result"));
            }
        }
    }

    public void launchCountActivity(View v)
    {
        Intent intent = new Intent(this, CountActivity.class);

        startActivityForResult(intent, COUNT_REQUEST);
    }

    public void launchImageActivity(View v)
    {
        Intent intent = new Intent(this, ImageActivity.class);

        startActivityForResult(intent, IMAGE_REQUEST);
    }

    public void launchWebActivity(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.url)));

        startActivity(intent);
    }

    public void launchGeoActivity(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + getResources().getString(R.string.geo)));

        startActivity(intent);
    }
}
