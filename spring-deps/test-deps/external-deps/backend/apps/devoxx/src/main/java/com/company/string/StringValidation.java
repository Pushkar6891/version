package com.company.string;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.Optional;

public class StringValidation {
    public static void main(String[] args) {
        StringValidation stringValidation = new StringValidation();
        stringValidation.checkString(null);// isEmpty isBlank isNull
        System.out.println();
        stringValidation.checkString("");// isEmpty isBlank isNotNUll
        System.out.println();
        stringValidation.checkString("         ");// isBlank isEmpty
        System.out.println();
        stringValidation.checkString("Pushkar");// isEmpty isBlank
        System.out.println("Null Checks 1");
        stringValidation.checkOptional1(null);
        stringValidation.checkOptional1("");
        stringValidation.checkOptional1(" ");
        stringValidation.checkOptional1("Test-T");
        System.out.println("Null Checks 2");
        stringValidation.checkOptional2(null);
    }

    private void checkString(String str){

        // System.out.println(Optional.ofNullable(str).orElse("Else"));


        if(StringUtils.isEmpty(str)){
            System.out.println("isEmpty");
        }
        if(StringUtils.isBlank(str)){
            System.out.println("isBlank");
        }
        if(Objects.isNull(str)){
            System.out.println("isNull");
        }
        if(!Objects.isNull(str)){
            System.out.println("isNotNull");
        }

        if(!Objects.isNull(str) && !StringUtils.isBlank(str)){
            System.out.println("Perfect");
        }

    }

    private void checkOptional1(String str) {
        Optional.ofNullable(str).ifPresent(new StringValidation()::print);
    }

    private void print(String s) {
        System.out.println(s.replaceAll("T","B"));
    }

    private void checkOptional2(String str) {
    }

}
