package com.sm.example.util;

import com.google.common.base.Charsets;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SecureStringUtil {

	private static final String STRING_SEED = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	private static SecureRandom SECURE_RANDOM;

	static {
		try {
			SECURE_RANDOM = SecureRandom.getInstance("SHA1PRNG");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	public static String randomString(int length) {
		var sb = new StringBuilder();

		for (int i = 0; i < length; i++) {
			int secureRandomIndex = SECURE_RANDOM.nextInt(STRING_SEED.length());
			sb.append(STRING_SEED.charAt(secureRandomIndex));
		}

		return sb.toString();
	}

	public static boolean equals(String string, String otherString) {
		return MessageDigest.isEqual(string.getBytes(Charsets.UTF_8), otherString.getBytes(Charsets.UTF_8));
	}

}
