package com.example.chris.holdall;

import android.util.Log;

/**
 * Created by Chris on 17/11/2016.
 */

public class CalcManager {

    String currentOperator;
    double firstValue;

    public CalcManager() {
        this.currentOperator = "";
        this.firstValue=0;
    }

    public String operation(String operator, String screenValue){
        String result;
        if (currentOperator.equals("")){
            currentOperator=operator;
            firstValue = Double.valueOf(screenValue);
            result= screenValue;
        } else {
             switch (currentOperator){
                case "+":
                    result=String.valueOf(firstValue + Double.valueOf(screenValue));
                    break;
                 case "-":
                     result=String.valueOf(firstValue - Double.valueOf(screenValue));
                     break;
                 case "*":
                     result=String.valueOf(firstValue * Double.valueOf(screenValue));
                     break;
                 case "/":
                     result=String.valueOf(firstValue / Double.valueOf(screenValue));
                     break;
                default:
                    result=screenValue;
                    break;
            }
            if (!operator.equals("=")){
                currentOperator=operator;
            } else {
                currentOperator="";
            }
        }
        firstValue=Double.valueOf(result);
        return result;

    }
}
