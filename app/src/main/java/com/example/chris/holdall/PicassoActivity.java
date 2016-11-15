package com.example.chris.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);

        String url="http://www.snut.fr/wp-content/uploads/2015/08/image-de-paysage-4.jpg";
        ImageView imageView =(ImageView)findViewById(R.id.my_image_view);
        Picasso.with(this).load(url).into(imageView);
    }
}
