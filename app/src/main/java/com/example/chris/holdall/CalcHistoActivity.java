package com.example.chris.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CalcHistoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_histo);

        TextView textView = (TextView) findViewById(R.id.calc_histo_text);
        CalcManager calcManager= (CalcManager) getIntent().getSerializableExtra("histo");

        for (String s : calcManager.getOperationList()) {
            textView.append(s+"\n");
        }
        }
}
