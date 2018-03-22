package com.spotify.music.control;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.*;
import java.net.URL;

public abstract class BaseTest {

    public static AndroidDriver<AndroidElement> driver;
    private DesiredCapabilities capabilities;
    private File app;
    private File appDir = new File(System.getProperty("user.home").concat("/output-dir"));
    private String apkName = "spotify.apk";

    @Before
    public void setUp() throws Exception {
        System.out.println("SetUp");
        app = new File(appDir, apkName);
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY223BKCHN");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.spotify.music");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.spotify.music.MainActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
