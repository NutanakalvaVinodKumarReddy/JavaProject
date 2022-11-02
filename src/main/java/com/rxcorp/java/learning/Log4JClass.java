package com.rxcorp.java.learning;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JClass {
    static Logger logger = LogManager.getLogger(Log4JClass.class);

    public static void main(String[] args) {
        logger.trace("Step0 ->trace");
        logger.info("Step1 ->info");
        logger.error("Step2 -> error");
        logger.warn("Step3 ->warn");



    }
}

