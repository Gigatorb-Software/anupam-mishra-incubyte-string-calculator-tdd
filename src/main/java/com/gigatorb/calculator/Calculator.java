package com.gigatorb.calculator;

public class Calculator {

    public double addMe(String str){
        double output = 0;
        if(str == null || str.length() == 0){
            return output;
        }

        String strArr[] = str.trim().split(",");

        for(String str1: strArr){
            output += Double.parseDouble(str1.trim());
        }

        return output;

    }
}
