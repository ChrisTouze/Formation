package com.example.chris.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CalcHistoActivity extends AppCompatActivity {

    CalcManager calcManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_histo);

        TextView textView = (TextView) findViewById(R.id.calc_histo_text);
        ListView listView = (ListView) findViewById(R.id.calc_histo_list);
        calcManager= (CalcManager) getIntent().getSerializableExtra("histo");

        CalcHistoAdapter adapter = new CalcHistoAdapter(this,calcManager);
        listView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
        Log.e("TEST",""+calcManager.getOperationList().size());

        /*for (String s : calcManager.getOperationList()) {
            textView.append(s+"\n");
        }*/
        }

    @Override
    protected void onStart() {
        super.onStart();  // Always call the superclass method first


       //adapter.notifyDataSetChanged();
        Log.e("TEST",""+calcManager.getOperationList().size());
    }

}
