package com.example.childlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NewChildActivity extends AppCompatActivity {

    private static final String TAG = "NewChildActivity";
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_new_child_layout);
        Log.d(TAG, "onCreate: Started.");

        // Get buttons and setText()
        Button btnGoChildList = (Button) findViewById(R.id.btnGoChildList);
        btnGoChildList.setText("Go to Child List");

        // Set click action for buttons
        btnGoChildList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked Button btnToChildList");

                Intent intent = new Intent(NewChildActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
