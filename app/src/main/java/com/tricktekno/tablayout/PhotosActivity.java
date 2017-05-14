package com.tricktekno.tablayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.HashMap;

public class PhotosActivity extends Activity {
    // List view
    private ListView lv;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;


    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photos_layout);

        // Listview Data
        String products[] = {"Android Development Tutorial", "Activity and Intent", "Android UI Widgets", "Android Fragments","Menus in Android", "Service in Android","Android AlarmManager",
                "Data Storage", "SQLite Database", "XML and JSON Parsing",
                "Android Multimedia", "Android Speech API", "Telephony API", "Device Connectivity", "Camera Tutorial","Android Sensor Tutorial", "Android Graphics","Web Service Tutorial","Android Animation","Android Interview"};

        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, products);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ADTActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ADT2Activity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 12) {
                    Intent myIntent = new Intent(view.getContext(), HelloActivity.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                PhotosActivity.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });
    }
}