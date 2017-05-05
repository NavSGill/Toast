package com.example.a1691713.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void showtoast(View view) {
        Toast.makeText(MainActivity.this, "Here's your Toast", Toast.LENGTH_LONG).show();
        }


    }



