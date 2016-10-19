package com.chico.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton createBtn;
    private WeiBoPopWindow popWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createBtn = (ImageButton) findViewById(R.id.ib_create);

        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popWindow = new WeiBoPopWindow(MainActivity.this);
                popWindow.showMoreWindow(view);
            }
        });

    }
}
