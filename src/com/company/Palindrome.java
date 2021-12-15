package com.company;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        //using scanner to get the palindrome as user input
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        String result = printPalindrome(str);
        System.out.println(result);
    }
    public static String printPalindrome(String s) {
        //use dynamic programming to reuse single letter substrings and double letter substrings
        // in substrings that are greater than or equal to 3 in length

        int n = s.length();
        String result = "";
        boolean[][] dp = new boolean[n][n];

        // single letter substrings
        //check for single letters and and reuse it in palindromes that have length greater than or equal to 3
        for (int i = 0; i < n; ++i)
            dp[i][i] = true; //single letters are not palindromes so don't print

        // double letter substrings
        //check for repeating letters and reuse it in palindromes that have length greater than or equal to 3
        for (int i = 0; i < n - 1; ++i) {
            dp[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
            if (dp[i][i+1])
            {
                result += (s.substring(i, i+2)+", "+i+", 2\n");
            }
        }
        // substrings of length 3 to n
        for (int len = 3; len <= n; ++len)
            for (int i = 0, j = i + len - 1; j < n; ++i, ++j) {
                dp[i][j] = dp[i + 1][j - 1] && (s.charAt(i) == s.charAt(j));
                 if (dp[i][j])
                 {
                    int l = j - i + 1;
                    result += (s.substring(i, j + 1) + ", " + i + ", " + l+"\n");
                 }
            }
        return result;
    }
}
