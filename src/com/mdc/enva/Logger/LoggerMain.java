package com.mdc.enva.Logger;

import java.util.logging.Logger;

/**
 * Created by cdragu on 20.06.2017.
 */
public class LoggerMain {

    private static final Logger myLogger = Logger.getLogger("com.mdc.enva.Logger");

    public static void main(String[] args) {
        // write your code here

        myLogger.warning("This is a warning");
        myLogger.fine("This is fine");
        myLogger.severe("This is a severe message");

        myLogger.entering("com.mdc.enva.Logger.LoggerMain", "main");
        myLogger.exiting("com.mdc.enva.Logger.LoggerMain", "main");
        Logger.getGlobal().info("Test debug here");
    }
}
