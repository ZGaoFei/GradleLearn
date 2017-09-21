package com.example.onelibrary;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OneLibraryMainActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, OneLibraryMainActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one_library);
    }
}
