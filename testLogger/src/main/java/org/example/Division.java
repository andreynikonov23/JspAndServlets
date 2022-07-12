package org.example;

import org.apache.log4j.Logger;

public class Division {
    private static final Logger logger = Logger.getLogger(Division.class);
    private int result;

    public Division(int count, int delim){
        try{
            result = count / delim;
            logger.debug("newDivisionObject=" + Division.class + "-Result=" + result);
        } catch (Exception e){
            logger.error(e);
        }
    }
    public int getResult(){
        return result;
    }

    @Override
    public String toString(){
        return "Result = " + result;
    }
}
