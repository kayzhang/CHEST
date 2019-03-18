package com.example.childlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Strarted.");

        // Get TextView and setText()
        TextView theTextView = (TextView) findViewById(R.id.textView1);
        theTextView.setText("CHEST");

        // Get Button and setText()
        Button btnNewChild = (Button) findViewById(R.id.btnNewChild);
        Button btnUploadData = (Button) findViewById(R.id.btnUploadData);
        btnNewChild.setText("Register New Child");
        btnUploadData.setText("Upload Data to Health Post");

        // Set click action for buttons
        btnNewChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked Button btnNewChild!");
                // toastMessage("Clicked Button New_CHild");

                Intent intent = new Intent(MainActivity.this, NewChildActivity.class);
                startActivity(intent);
            }
        });

        btnUploadData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked Button btnUploadData!");
                // toastMessage("Clicked Button Upload_Data");

                Intent intent = new Intent(MainActivity.this, DataUploadActivity.class);
                startActivity(intent);
            }
        });

        // Get ListView
        ListView childList = (ListView) findViewById(R.id.childList);

        // Set click action for ListView
        ArrayList<String> childNames = new ArrayList<>();
        childNames.add("child0");
        childNames.add("child1");
        childNames.add("child2");
        childNames.add("child3");
        childNames.add("child4");
        childNames.add("child5");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, childNames);
        childList.setAdapter(adapter);
    }

    private void toastMessage(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
