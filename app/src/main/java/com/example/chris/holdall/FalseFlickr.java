package com.example.chris.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import com.squareup.picasso.Picasso;

public class FalseFlickr extends AppCompatActivity {

    List<item> listItem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flickr_list);

        generateList();

        ListView listView = (ListView) findViewById(R.id.flickr_list);

        FlickrListAdapter adapter = new FlickrListAdapter(this,listItem);

        listView.setAdapter(adapter);

        adapter.notifyDataSetChanged();

    }

    public void generateList(){
        listItem.add(new item("Chaton","https://leschatsdeoceane.files.wordpress.com/2012/09/3392-petit-chaton-mignon-wallfizz2.jpg"));
        listItem.add(new item("Autre chat","https://i.ytimg.com/vi/VwNzpAFT8t8/hqdefault.jpg"));
        listItem.add(new item("Titre 3","https://leschatsdeoceane.files.wordpress.com/2012/09/3392-petit-chaton-mignon-wallfizz2.jpg"));
        listItem.add(new item("Titre 4","https://i.ytimg.com/vi/VwNzpAFT8t8/hqdefault.jpg"));
        listItem.add(new item("Titre 5","https://i.ytimg.com/vi/VwNzpAFT8t8/hqdefault.jpg"));
        listItem.add(new item("Titre 6","https://i.ytimg.com/vi/VwNzpAFT8t8/hqdefault.jpg"));
    }
}
