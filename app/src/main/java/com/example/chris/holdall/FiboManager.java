package com.example.chris.holdall;

/**
 * Created by Chris on 16/11/2016.
 */

public class FiboManager {
    static int fibo (int nb){
        if (nb == 0) return 0;
        if (nb <=2 ) return 1;
        int nextValue = fibo(nb-1)+fibo(nb-2);
        return nextValue;
    }

}
