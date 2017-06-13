package com.company.developersudhanshu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter adapter;
    ListView listView;
    ArrayList<String> items;
    String s = new String();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();

        listView = (ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,items);

        for(int i=0; i<10; i++){
            s = "Entry " + i;
            items.add(s);
        }
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this," Item Number "+position+" Clicked !!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
