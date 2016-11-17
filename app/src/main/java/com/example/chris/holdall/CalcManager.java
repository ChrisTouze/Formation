package com.example.chris.holdall;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 17/11/2016.
 */

public class CalcManager implements java.io.Serializable  {

    private String currentOperator;
    private double firstValue;
    private String currentOperation;
    private boolean newOperation;
    private List<String> operationList = new ArrayList<>();

    public CalcManager() {
        this.currentOperator = "";
        this.firstValue = 0;
        this.currentOperation = "";
        this.newOperation=true;
    }

    public void init() {
        currentOperator = "";
        firstValue = 0;
        currentOperation = "";
        newOperation=true;
    }

    public String getCurrentOperation() {
        return currentOperation;
    }

    public List<String> getOperationList() {
        return operationList;
    }

    public String operation(String operator, String screenValue) {
        String result;
        if (newOperation) {
            newOperation=false;
            currentOperation="";
        }
        currentOperation += screenValue + " "+operator+" ";

        if (currentOperator.equals("")) {
            currentOperator = operator;
            firstValue = Double.valueOf(screenValue);
            result = screenValue;
        } else {
            switch (currentOperator) {
                case "+":
                    result = String.valueOf(firstValue + Double.valueOf(screenValue));
                    break;
                case "-":
                    result = String.valueOf(firstValue - Double.valueOf(screenValue));
                    break;
                case "*":
                    result = String.valueOf(firstValue * Double.valueOf(screenValue));
                    break;
                case "/":
                    result = String.valueOf(firstValue / Double.valueOf(screenValue));
                    break;
                default:
                    result = screenValue;
                    break;
            }
        }
        firstValue = Double.valueOf(result);
        if (result.endsWith(".0")) {
            result = result.replace(".0", "");
        }
        //currentOperation+=result;
        if (!operator.equals("=")) {
            currentOperator = operator;
        } else {
            currentOperator = "";
            currentOperation += " "+result;
            operationList.add(currentOperation);
            newOperation=true;

        }
        return result;

    }
}
