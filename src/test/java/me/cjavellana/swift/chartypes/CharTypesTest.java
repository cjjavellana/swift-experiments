package me.cjavellana.swift.chartypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CharTypesTest {

    @Test
    public void isCanRecognizeDigits(){
        String pattern = CharTypes.patternFor("n");
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher("1");
        assertTrue(m.matches());
    }

    @Test
    public void itCanRecognizeDigitsWithCommaSeparator(){
        String pattern = CharTypes.patternFor("d");
        Pattern p = Pattern.compile(pattern + "{1,15}");
        Matcher m = p.matcher("100,000,000");
        assertTrue(m.matches());
    }

}