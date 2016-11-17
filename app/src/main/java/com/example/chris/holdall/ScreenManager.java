package com.example.chris.holdall;

/**
 * Created by Chris on 17/11/2016.
 */

public class ScreenManager {
    String screen;

    public ScreenManager() {
        this.screen = "0";
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String updateScreen(String newChar){

        if (screen.equals("0") && !newChar.equals(".")){
            screen = newChar;
        } else {
            screen += newChar;
        }
        return screen;
    }

}
