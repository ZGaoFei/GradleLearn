package com.example.zhaogaofei.firsttestapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.onelibrary.OneLibraryMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        final TextView textView = (TextView) findViewById(R.id.tv_main);
        final EditText editText = (EditText) findViewById(R.id.et_main);
        Button button = (Button) findViewById(R.id.bt_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString().trim();
                if (!TextUtils.isEmpty(string)) {
                    textView.setText(string);
                }

                OneLibraryMainActivity.start(MainActivity.this);
            }
        });

        final TextView textPackage = (TextView) findViewById(R.id.text_package);
        Button btGet = (Button) findViewById(R.id.bt_get_package_main);
        btGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = MainActivity.this.getPackageName();
                Log.e("====", "====" + name);
                textPackage.setText(name);
            }
        });
    }

    private void start() {
        Intent intent = new Intent(MainActivity.this, OneLibraryMainActivity.class);
        startActivity(intent);
    }

    private static int a = 0;
    private int b = 1;
    private static Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            a ++;
        }
    };

    private static class InternalHandler extends Handler {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

        }
    }

}
