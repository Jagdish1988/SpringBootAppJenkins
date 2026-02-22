/**
 * 
 */
package com.jp.kumaawat.SpringBootApp.util;

public class IdentifierValidator {

    private static final String IDENTIFIER_REGEX = "^[A-Za-z_$][A-Za-z0-9_$]{2,49}$";

    public static boolean isValidIdentifier(String identifierName) {
        if (identifierName == null) {
            return false;
        }
        return identifierName.matches(IDENTIFIER_REGEX);
    }

	/*
	 * // quick test public static void main(String[] args) {
	 * System.out.println(isValidIdentifier("abc")); // true
	 * System.out.println(isValidIdentifier("_var123")); // true
	 * System.out.println(isValidIdentifier("$money")); // true
	 * System.out.println(isValidIdentifier("1wrong")); // false
	 * System.out.println(isValidIdentifier("ab")); // false (too short) }
	 */
}
