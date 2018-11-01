package com.example.diamond.thietkegdar2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private CheckBox cbmusic;
    private RadioButton ra;
    private Switch sw;
    private ToggleButton tb;
    private RadioButton ra1;
    private RadioGroup rag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbmusic = findViewById(R.id.cb1);
        ra = findViewById(R.id.ra);
        ra1 = findViewById(R.id.ra1);
        sw = findViewById(R.id.sw);
        tb = findViewById(R.id.tg);
        rag = findViewById(R.id.rag);
        cbmusic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Đã chọn", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Bỏ chọn", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ra.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Đã chọn", Toast.LENGTH_SHORT).show();
                }
            }
        });
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Đã chọn", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Bỏ chọn", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "đã bật", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "đã tắt", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ra1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    Toast.makeText(MainActivity.this, "Đã chọn", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rag.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.ra:
                        break;
                    case R.id.ra1:
                        break;
                }
            }
        });

    }
}
