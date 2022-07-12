package org.example;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        Division division = new Division(4, 2);
        logger.info("printResult");
        System.out.println(division.getResult());
    }
}