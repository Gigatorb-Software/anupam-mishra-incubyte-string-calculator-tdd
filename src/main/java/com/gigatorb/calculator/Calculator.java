package com.gigatorb.calculator;

public class Calculator {

    public double addMe(String str){
        double output = 0;
        if(str == null || str.trim().length() == 0){
            return output;
        }
        String strArr[] = null;

        if(str.trim().startsWith("//")){
            String newStr = str.trim().replaceAll("//","");
            String delimiter = newStr.charAt(0)+"";
            String subStr = newStr.substring(1);
            subStr = subStr.replaceAll("\n",delimiter);
            strArr = subStr.split(delimiter);
        }else{
            strArr = str.trim().replaceAll("\n",",")
                    .split(",");
        }

        for(String str1: strArr){
            if(str1.trim().length() > 0) {
                output += Double.parseDouble(str1.trim());
            }
        }

        return output;

    }
}
