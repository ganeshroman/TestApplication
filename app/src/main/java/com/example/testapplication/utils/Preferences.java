package com.example.testapplication.utils;

/**
 * Preferences actual implementation
 *
 * @author Ganesh Roman
 * Created on 8/2/22.
 */
public interface Preferences {

    /**
     * Shared Pref file name
     */
    interface PrefNames {
        /**
         * Application main preferences.
         */
        String PREFS_NAME_TAG = "project.session.preferences";
    }

    /**
     * Constants used as preference keys.
     */
    enum PrefKeys {

        /**
         * This key holds reference to the timer status
         */
        IS_TIMER_EXPIRED,

        /**
         * This key holds reference to the Registration Token
         */
        TOKEN,

        /**
         * This key holds a long timestamp value representing the time when the app has been first launched on the device
         */
        INSTALLATION_TIME
    }

}
