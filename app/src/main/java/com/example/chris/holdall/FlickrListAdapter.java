package com.example.chris.holdall;

import com.squareup.picasso.Picasso;

import android.content.Context;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;



/**
 * Created by Chris on 22/11/2016.
 */

public class FlickrListAdapter extends BaseAdapter {
    Context context;
    List<item> list;

    public FlickrListAdapter(Context context,List list) {
        this.context=context;
        this.list=list;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        if(convertView == null){
            convertView = LayoutInflater
                    .from(context)
                    .inflate(R.layout.embed_flickr_list, viewGroup, false);
            TextView titleTextView = (TextView) convertView.findViewById(R.id.flickr_list_title);
            TextView urlTextView = (TextView) convertView.findViewById(R.id.flickr_list_url);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.test);
            titleTextView.setText(list.get(i).getTitle());
            urlTextView.setText(list.get(i).getUrl());


            Picasso.with(context).load(list.get(i).getUrl()).fit().centerCrop().into(imageView);
            //Log.e("TEST",test);

           /* Button goButton = (Button) convertView.findViewById(R.id.flickr_list_go_details);
            goButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.e("TEST","TEST");
                    Intent intent = new Intent(context, FlickrDetails.class);
                    context.startActivity(intent);


                }
            });*/

        }
        return convertView;
    }
}
