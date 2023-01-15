package com.Shubhankar;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String b = "TONY STARK";
        System.out.println(Arrays.toString(b.toCharArray()));
        System.out.println("   TONY   ".strip());
        System.out.println("   TONY".stripIndent());
        System.out.println(Arrays.toString(b.split(" ")));
    }
}
