package com.example.chris.holdall;

/**
 * Created by Chris on 16/11/2016.
 */

public class PalindromManager {



    public static String invert(String myString) {
        String result = "";
        for (int i = myString.length() - 1; i >= 0; i--) {

            result += myString.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrom(String myString) {
        for (int i = 0; i < myString.length() / 2; i++) {
            if (myString.charAt(i) != myString.charAt(myString.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}


