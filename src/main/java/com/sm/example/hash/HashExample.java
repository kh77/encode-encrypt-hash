package com.sm.example.hash;

import com.sm.example.util.SecureStringUtil;

import java.security.NoSuchAlgorithmException;

public class HashExample {
    private static final int SALT_LENGTH = 16;

    public static void main(String[] args) throws NoSuchAlgorithmException {
        hashsha256Example();
        bcryptExample();
    }

    private static void bcryptExample() {
        String sentence = "Good Morning";
        System.out.println("Hash-Bcrypt Example - word: " + sentence);

        // save hash for bcrypt in db or cache and check the sentence next time, it is the same hashed
        String salt = SecureStringUtil.randomString(SALT_LENGTH);
        System.out.println("salt: " + salt);
        String hashed = HashUtil.bcrypt(sentence, salt);
        System.out.println("Hashed: " + hashed);
        System.out.println(HashUtil.isBcryptMatch(sentence, hashed) ? "match" : "not match");
    }

    private static void hashsha256Example() throws NoSuchAlgorithmException {
        String sentence = "Hello World";
        System.out.println("Hash-Sha256 Example - word: " + sentence);

        // save hash & salt in db or cache and check the sentence next time, it is the same hashed
        var salt = SecureStringUtil.randomString(SALT_LENGTH);
        System.out.println("salt: " + salt);
        var hashed = HashUtil.sha256(sentence, salt);
        System.out.println("Hashed: " + hashed);
        System.out.println(HashUtil.isSha256Match(sentence, salt, hashed) ? "match" : "not match");
    }

}
