package com.example.butterknife;


import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // bind the view using butterknife
        ButterKnife.bind(MainActivity.this);
    }

    @OnClick(R.id.btnclick)
    public void show() {
        Toast.makeText(MainActivity.this, "Hi", Toast.LENGTH_SHORT).show();

    }
}
