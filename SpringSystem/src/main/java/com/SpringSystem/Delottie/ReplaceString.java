package com.SpringSystem.Delottie;

import java.io.IOException;

public class ReplaceString {
    public static String getSmallestString(String word, String substr) {
        int wLen = word.length();
        int sLen = substr.length();
        String minResult = null;

        for (int i = 0; i <= wLen - sLen; i++) {
            StringBuilder temp = new StringBuilder(word);
            boolean canInsert = true;

            // Check if substr can be placed at position i
            for (int j = 0; j < sLen; j++) {
                char wChar = word.charAt(i + j);
                char sChar = substr.charAt(j);
                if (wChar != '?' && wChar != sChar) {
                    canInsert = false;
                    break;
                }
                temp.setCharAt(i + j, sChar);
            }

            if (!canInsert) continue;

            // Replace remaining '?' with 'a'
            for (int k = 0; k < wLen; k++) {
                if (temp.charAt(k) == '?') {
                    temp.setCharAt(k, 'a');
                }
            }

            String candidate = temp.toString();
            if (minResult == null || candidate.compareTo(minResult) < 0) {
                minResult = candidate;
            }
        }

        return minResult != null ? minResult : "-1";
    }

    public static void main(String[] args) throws IOException {
            String word = "as?b?e?gf";
            String substr = "dbk";
            System.out.println(getSmallestString(word, substr));
        }
    }
