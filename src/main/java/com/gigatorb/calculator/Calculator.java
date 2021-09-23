package com.gigatorb.calculator;

public class Calculator {

    public double addMe(String str) throws Exception{
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
        String negativeStr = "";
        boolean isNegativeFound = false;
        for(String str1: strArr){
            if(str1.trim().length() > 0) {
                double myNewNum = Double.parseDouble(str1.trim());
                if(isNegativeNumber(myNewNum)){
                    isNegativeFound = true;
                    if(negativeStr.length() > 0) {
                        negativeStr = negativeStr + " " + myNewNum;
                    }else {
                        negativeStr = myNewNum + "";
                    }
                }
                output += myNewNum;
            }
        }

        if(isNegativeFound){
            throw new Exception("negatives not allowed "+negativeStr);
        }

        return output;

    }

    private boolean isNegativeNumber(double number){
        if(number < 0){
            return true;
        }
        return false;
    }
}
