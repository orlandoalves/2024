package com.test.uitests;

import static com.google.common.truth.Truth.assertThat;

import static org.junit.Assert.assertTrue;

import android.os.RemoteException;

import androidx.test.filters.SdkSuppress;
import androidx.test.platform.app.InstrumentationRegistry;
//import androidx.test.runner.AndroidJUnit4;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.Until;

import org.junit.Before;
import org.junit.Test;
//import org.junit.runner.RunWith;

//@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)

public class ChangeTextBehaviorTest {

    private static final String BASIC_SAMPLE_PACKAGE
            = "com.whatsapp";
    private static final int LAUNCH_TIMEOUT = 5000;
    private static final String STRING_TO_BE_TYPED = "UiAutomator";
    private UiDevice device;

    @Test
    @Before
    public void startMainActivityFromHomeScreen() throws RemoteException {
        // Initialize UiDevice instance
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        if (!device.isScreenOn()) {
            device.wakeUp();
        } else {
            device.pressHome();
        }


        // Start from the home screen
        device.pressHome();

        // Wait for launcher
        
    }
@Test
    public void accessGmail() throws RemoteException {

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiObject2 gmail = device.findObject(By.descContains("Pasta: Google, 4 ou mais itens"));
        // Perform a click and wait until the app is opened.
        Boolean opened = gmail.clickAndWait(Until.newWindow(), 3000);
        assertTrue(opened);

    }

}