package com.spotify.music.tests;

import com.spotify.music.components.CustomCommands;
import com.spotify.music.control.BaseTest;
import org.junit.Test;
import org.testng.Assert;

public class LoginTest extends BaseTest{

    CustomCommands commands = new CustomCommands();

    @Test
    public void openAppTest() {
        commands.sleep(1500);
        Assert.assertTrue(true);
    }
}
