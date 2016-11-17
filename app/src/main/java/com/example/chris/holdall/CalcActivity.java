package com.example.chris.holdall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        final ScreenManager screen = new ScreenManager();
        final CalcManager calcManager = new CalcManager();

        final TextView board = (TextView)findViewById(R.id.calc_screen);
        final TextView operation = (TextView)findViewById(R.id.calc_operation);
        Button histButton = (Button)findViewById(R.id.calc_histo_button);
        Button cButton = (Button)findViewById(R.id.calc_c_button);
        Button posButton = (Button)findViewById(R.id.calc_pos_button);
        Button negButton = (Button)findViewById(R.id.calc_neg_button);
        Button divButton = (Button)findViewById(R.id.calc_div_button);
        Button mulButton = (Button)findViewById(R.id.calc_mul_button);
        Button pointButton = (Button)findViewById(R.id.calc_point_button);
        Button equalButton = (Button)findViewById(R.id.calc_equal_button);
        Button button0 = (Button)findViewById(R.id.calc_0_button);
        Button button1 = (Button)findViewById(R.id.calc_1_button);
        Button button2 = (Button)findViewById(R.id.calc_2_button);
        Button button3 = (Button)findViewById(R.id.calc_3_button);
        Button button4 = (Button)findViewById(R.id.calc_4_button);
        Button button5 = (Button)findViewById(R.id.calc_5_button);
        Button button6 = (Button)findViewById(R.id.calc_6_button);
        Button button7 = (Button)findViewById(R.id.calc_7_button);
        Button button8 = (Button)findViewById(R.id.calc_8_button);
        Button button9 = (Button)findViewById(R.id.calc_9_button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(screen.updateScreen("1"));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(screen.updateScreen("2"));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(screen.updateScreen("3"));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(screen.updateScreen("4"));
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(screen.updateScreen("5"));
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(screen.updateScreen("6"));
            }

        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(screen.updateScreen("7"));
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(screen.updateScreen("8"));
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(screen.updateScreen("9"));
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(screen.updateScreen("0"));
            }
        });
        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setScreen("0");
                board.setText(screen.getScreen());
                calcManager.init();
            }
        });
        pointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!screen.getScreen().contains(".")) {
                    board.setText(screen.updateScreen("."));
                }
            }
        });
        posButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(calcManager.operation("+",board.getText().toString()));
                screen.setScreen("0");
                operation.setText(calcManager.getCurrentOperation());

            }
        });
        negButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(calcManager.operation("-",board.getText().toString()));
                screen.setScreen("0");
                operation.setText(calcManager.getCurrentOperation());
            }
        });
        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(calcManager.operation("*",board.getText().toString()));
                screen.setScreen("0");
                operation.setText(calcManager.getCurrentOperation());
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(calcManager.operation("/",board.getText().toString()));
                screen.setScreen("0");
                operation.setText(calcManager.getCurrentOperation());
            }
        });
        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board.setText(calcManager.operation("=",board.getText().toString()));
                screen.setScreen("0");
                operation.setText(calcManager.getCurrentOperation());
            }
        });

        histButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalcActivity.this,CalcHistoActivity.class);
                intent.putExtra("histo", calcManager);
                startActivity(intent);

            }
        });

    }

}
