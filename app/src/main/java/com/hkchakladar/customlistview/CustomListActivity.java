package com.hkchakladar.customlistview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomListActivity extends AppCompatActivity {

    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        mContext = this;

        ListView lv = findViewById(R.id.list);

        final ArrayList<Movies> listItems = new ArrayList<>();

        //Add data to arraylist

        listItems.add(new Movies("Iron Man", "7.9", "2008", R.drawable.iron_man));
        listItems.add(new Movies("The Incredible Hulk", "6.7", "2008", R.drawable.hulk));
        listItems.add(new Movies("Iron Man 2", "7.0", "2010", R.drawable.iron_man_2));
        listItems.add(new Movies("Thor", "7.0", "2011", R.drawable.thor));
        listItems.add(new Movies("Captain America: The First Avenger", "6.9", "2011", R.drawable.america));
        listItems.add(new Movies("The Avengers", "8.1", "2012", R.drawable.avengers));

        final CustomLVAdapter adapter = new CustomLVAdapter(CustomListActivity.this, listItems);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Movies mv= listItems.get(position);

                Toast.makeText(mContext, mv.getTitle() + " clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
