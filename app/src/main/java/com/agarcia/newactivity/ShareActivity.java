package com.agarcia.newactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share2);
        mText=findViewById(R.id.tv_shared_text);
        Intent mIntent=getIntent();
        if (mIntent != null) {
            mText.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
