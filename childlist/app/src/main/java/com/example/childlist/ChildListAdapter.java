package com.example.childlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ChildListAdapter extends ArrayAdapter<Child> {

    private static final String TAG = "ChildListAdapter";

    private Context mContext;
    private int mResource;

    /**
     * Default constructor for the ChildListAdapter
     * @param context
     * @param resource
     * @param objects
     */
    public ChildListAdapter(Context context, int resource, List<Child> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get the children information
        String name = getItem(position).getName();
        String sex = getItem(position).getSex();
        String age = getItem(position).getAge();
        String anemiaStatus = getItem(position).getAnemiaStatus();
        String malnutritionStatus = getItem(position).getMalnutritionStatus();
        String nextCredVisitDate = getItem(position).getNextCredVisitDate();
        String homeVisitDue = getItem(position).getHomeVisitDue();

        // Create the child object with the information
        Child child = new Child(name, sex, age, anemiaStatus, malnutritionStatus, nextCredVisitDate, homeVisitDue);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvSex = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvAge = (TextView) convertView.findViewById(R.id.textView3);
        TextView tvAnemiaStatus = (TextView) convertView.findViewById(R.id.textView4);
        TextView tvMalnutritionStstus = (TextView) convertView.findViewById(R.id.textView5);
        TextView tvNextCredVisitDate = (TextView) convertView.findViewById(R.id.textView6);
        TextView tvHomeVisitDue = (TextView) convertView.findViewById(R.id.textView7);

        tvName.setText(name);
        tvSex.setText(sex);
        tvAge.setText(age);
        tvAnemiaStatus.setText(anemiaStatus);
        tvMalnutritionStstus.setText(malnutritionStatus);
        tvNextCredVisitDate.setText(nextCredVisitDate);
        tvHomeVisitDue.setText(homeVisitDue);

        return convertView;
    }
}
