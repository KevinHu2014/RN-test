package com.test;

import com.robinpowered.react.ScreenBrightness.ScreenBrightnessPackage;
import com.sensormanager.SensorManagerPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import com.mapbox.reactnativemapboxgl.ReactNativeMapboxGLPackage;
import com.zmxv.RNSound.RNSoundPackage;
import com.lwansbrough.RCTCamera.*;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "test";
    }

    /**
     * Returns whether dev mode should be enabled.
     * This enables e.g. the dev menu.
     */
    @Override
    protected boolean getUseDeveloperSupport() {
        return BuildConfig.DEBUG;
    }

    /**
     * A list of packages used by the app. If the app uses additional views
     * or modules besides the default ones, add more packages here.
     */
    @Override
    protected List<ReactPackage> getPackages() {
        return Arrays.<ReactPackage>asList(
            new MainReactPackage(),
            new RCTCameraPackage(),
            new RNSoundPackage(),
            new ReactNativeMapboxGLPackage(),
            new LinearGradientPackage(),
            new SensorManagerPackage(),
            new ScreenBrightnessPackage(this)
        );
    }
}
