package com.company.eg002.printwriter;

import java.io.PrintWriter;

public class PrintWriterTester {
    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out, true);
        String name = "Pushkar";
        printWriter.write("Hello " + name);
    }
}
