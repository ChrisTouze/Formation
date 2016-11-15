package com.example.chris.holdall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button test1 = (Button) findViewById(R.id.test1);

        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"message",Toast.LENGTH_SHORT).show();

                //Intent intent = new Intent(this,???.class);
                //startActivity(intent);

            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
