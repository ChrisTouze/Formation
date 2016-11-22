package com.example.chris.holdall;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;



/**
 * Created by Chris on 22/11/2016.
 */

public class CalcHistoAdapter extends BaseAdapter {

    private CalcManager calcManager = null;
    Context context = null;

    public CalcHistoAdapter(Context context,CalcManager calcManager) {
        this.calcManager = calcManager;
        this.context=context;
            }

    @Override
    public int getCount() {
        return calcManager.getOperationList().size();
    }

    @Override
    public Object getItem(int i) {
        return calcManager.getOperationList().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater
                    .from(context)
                    .inflate(R.layout.activity_calc_histo_inlist, viewGroup, false);
        }

        TextView textView = (TextView) view.findViewById(R.id.calc_histo_text);
        textView.setText(calcManager.getOperationList().get(i));
        Button delButton = (Button) view.findViewById(R.id.calc_histo_del);
        delButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcManager.getOperationList().remove(i);
                notifyDataSetChanged();
                Log.e("TEST",""+calcManager.getOperationList().size());
            }
        });

        return view;
    }
}
