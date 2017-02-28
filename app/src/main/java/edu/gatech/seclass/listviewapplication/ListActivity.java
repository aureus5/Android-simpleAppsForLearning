package edu.gatech.seclass.listviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView listview;
    String[] mobileArray = {"Android", "Iphone", "WindowsMobile", "Blackberry", "WebOS",
        "Ubuntu", "Windows 7", "Mac OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, mobileArray);
        listview = (ListView) findViewById(R.id.mobile_list);
        listview.setAdapter(adapter);
    }
}