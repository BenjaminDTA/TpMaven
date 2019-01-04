package org.commons;

public class MyStringUtils {
	public static boolean isNullOrEmpty(String s) {
		return s == null || s.trim().isEmpty();
	}
}
