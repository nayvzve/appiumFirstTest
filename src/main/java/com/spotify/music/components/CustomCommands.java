package com.spotify.music.components;

import com.spotify.music.control.BaseTest;

public class CustomCommands extends BaseTest{


    public void sleep(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException ignored) {
        }
    }

}
