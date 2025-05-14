package com.mytest.myappname;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView logText;
    private Button btn1;
    private Button btn2;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 初始化视图
        logText = findViewById(R.id.log_text);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        
        // 设置按钮点击事件
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendLog("按钮1被点击了");
            }
        });
        
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendLog("按钮2被点击了");
            }
        });
    }
    
    private void appendLog(String message) {
        String currentLog = logText.getText().toString();
        String newLog = currentLog + "\n" + message;
        logText.setText(newLog.trim());
    }
}