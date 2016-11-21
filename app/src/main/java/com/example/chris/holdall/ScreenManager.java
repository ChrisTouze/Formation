package com.example.chris.holdall;

/**
 * Created by Chris on 17/11/2016.
 */

public class ScreenManager {
    private String screen;
    private String histo;

    public ScreenManager() {
        this.screen = "0";
        this.histo = "";
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
        histo+=newChar;
        if (screen.length()>10) {
            screen=screen.substring(0,10);

        }
        return screen;
    }

}
