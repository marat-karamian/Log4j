package com.journaldev.log4j.main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.journaldev.log4j.*;

public class Log4jExample {

    static{
        init();
    }

    private final static Logger logger = Logger.getLogger(Log4jExample.class);

    public static void main(String[] args) {

        logger.debug("My Debug Log");
        logger.info("My Info Log");
        logger.warn("My Warn Log");
        logger.error("My error log");
        logger.fatal("My fatal log");

    }

    /**
     * method to init log4j configurations
     */
    private static void init() {
        PropertyConfigurator.configure("log4j.xml");
    }

}