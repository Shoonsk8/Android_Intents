package com.lambda.imageviewer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_detail extends AppCompatActivity {
    private View mContentView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ActivityLifecycle", getLocalClassName() + " - onCreate");
        setContentView(R.layout.activity_detail);
        TextView tv=findViewById(R.id.text_detail);
        tv.setText("test");
        ImageData id=(ImageData) getIntent().getSerializableExtra("DATA_I_NEED");
        tv.setText(id.getStringUri());

        mContentView = findViewById(R.id.activity_detail);
        // Set up the user interaction to manually show or hide the system UI.
        mContentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Intent のインスタンスを取得する
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                // 渡したいデータとキーを指定する
                intent.putExtra("COMING_BACK","I am back");
                // 遷移先の画面を呼び出す
                startActivity(intent);

            }
        });




    }

}
