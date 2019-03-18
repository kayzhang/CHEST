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
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Strarted.");

        // Get TextView and setText()
        TextView theTextView = (TextView) findViewById(R.id.CHEST);
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
        ListView childListView = (ListView) findViewById(R.id.childListView);

        //Create the Person objects
        Child child0 = new Child("child0", "M", "2y 3m", "healthy", "healthy", "late", "03/31/2019");
        Child child1 = new Child("child1", "M", "2y 3m", "healthy", "healthy", "late", "03/31/2019");
        Child child2 = new Child("child2", "M", "2y 3m", "healthy", "healthy", "late", "03/31/2019");
        Child child3 = new Child("child3", "M", "2y 3m", "healthy", "healthy", "late", "03/31/2019");
        Child child4 = new Child("child4", "M", "2y 3m", "healthy", "healthy", "late", "03/31/2019");
        Child child5 = new Child("child5", "F", "2y 3m", "healthy", "healthy", "late", "03/31/2019");
        Child child6 = new Child("child6", "F", "2y 3m", "healthy", "healthy", "late", "03/31/2019");
        Child child7 = new Child("child7", "F", "2y 3m", "healthy", "healthy", "late", "03/31/2019");
        Child child8 = new Child("child8", "F", "2y 3m", "healthy", "healthy", "late", "03/31/2019");
        Child child9 = new Child("child9", "F", "2y 3m", "healthy", "healthy", "late", "03/31/2019");

        //Add the Child objects to an ArrayList
        List<Child> childList = new ArrayList<>();
        childList.add(child0);
        childList.add(child1);
        childList.add(child2);
        childList.add(child3);
        childList.add(child4);
        childList.add(child5);
        childList.add(child6);
        childList.add(child7);
        childList.add(child8);
        childList.add(child9);

        ChildListAdapter adapter = new ChildListAdapter(this, R.layout.adapter_view_layout, childList);
        childListView.setAdapter(adapter);
    }

    private void toastMessage(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
