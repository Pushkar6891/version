package com.company.javafullcourse;

public class Eg15SwitchStatement {
    public static void main(String[] args) {
        String gender = "FEMALE";
        if ("FEMALE".equals(gender)) {
            System.out.println("FEMALE");
        } else if ("MALE".equals(gender)) {
            System.out.println("MALE");
        } else if ("PREFER_NOT_TO_SAY".equals(gender)) {
            System.out.println("PREFER_NOT_TO_SAY");
        } else {
            System.out.println("ELSE");
        }

        switch (gender) {
            case "FEMALE":
                System.out.println("FEMALE");
                break;
            case "MALE":
                System.out.println("MALE");
                break;
            case "PREFER_NOT_TO_SAY":
                System.out.println("PREFER_NOT_TO_SAY");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
