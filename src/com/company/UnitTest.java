package com.company;

import org.junit.jupiter.api.Test;

import static com.company.Palindrome.printPalindrome;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {

    //test for single characters
    @Test
    public void test_printPalindrome_1() {
        assertEquals("", printPalindrome("a"));
    }

    //test for string containing repeated characters
    @Test
    public void test_printPalindrome_2() {
        assertEquals("aa, 0, 2\n", printPalindrome("aa"));
    }

    //test for string with 3 characters
    @Test
    public void test_printPalindrome_3() {
        assertEquals("aba, 0, 3\n", printPalindrome("aba"));
    }

    //test for string given in question
    @Test
    public void test_printPalindrome_4() {
        assertEquals("LL, 7, 2\nII, 36, 2\nGG, 46, 2\nOO, 48, 2\nBCB, 1, 3\nOHO, 9, 3\nCEC, 15, 3\n" +
                     "ARA, 18, 3\nRAR, 19, 3\nEUE, 30, 3\nAMA, 38, 3\nABCBA, 0, 5\nACECA, 14, 5\n" +
                     "VEUEV, 29, 5\nIAMAI, 37, 5\nRACECAR, 13, 7\nOVEUEVO, 28, 7\n" +
                     "LOVEUEVOL, 27, 9\nILOVEUEVOLI, 26, 11\n", printPalindrome("ABCBAHELLOHOWRACECARAREYOU"+
                     "ILOVEUEVOLIIAMAIDOINGGOOD"));
    }

}
