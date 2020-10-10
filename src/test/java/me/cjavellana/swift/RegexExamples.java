package me.cjavellana.swift;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("((\r\n)?([A-Za-z0-9]{1,35})){1,6}");
        String singleLine35Chars = "12345678901234567890123456789012345";
        String twoLines35Chars = "12345678901234567890123456789012345\r\n12345678901234567890123456789012345544444";

        Matcher m1 = p.matcher(singleLine35Chars);
        System.out.println(m1.matches());

        Matcher m2 = p.matcher(twoLines35Chars);
        System.out.println(m2.matches());
    }

}
