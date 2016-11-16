package com.example.chris.holdall;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PalindromActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrom);

        Button okButton = (Button)findViewById(R.id.ok_button);
        final EditText intputText = (EditText)findViewById(R.id.textInput);
        final TextView resultText = (TextView)findViewById(R.id.result_label);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String returnText = intputText.getText().toString();
                resultText.setText(PalindromManager.invert(returnText));
                InputMethodManager manager=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                manager.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);
                intputText.setText("");

                String palindromMessage;

                if (PalindromManager.isPalindrom(returnText)) {
                     palindromMessage="C'est un palindrome";

                     fab.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(android.R.color.holo_green_light)));
                } else {
                    palindromMessage="Ce n'est pas un palindrome";
                }
                Toast.makeText(PalindromActivity.this,palindromMessage,Toast.LENGTH_SHORT).show();




            }
        });
    }
}
