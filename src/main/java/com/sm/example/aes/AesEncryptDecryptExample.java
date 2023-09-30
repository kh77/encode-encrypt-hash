package com.sm.example.aes;

public class AesEncryptDecryptExample {

    public static void main(String[] args) throws Exception {
        String sentence = "Hello World";
        String secretKey = "TheSecretKey2468";
        System.out.println("Aes Encrypt Decrypt Example word: " + sentence);
        String encryptAes = AesEncryptDecryptUtil.encryptAes(sentence, secretKey);
        System.out.println("Encrypt: " + encryptAes);
        System.out.println("Decode: " + AesEncryptDecryptUtil.decryptAes(encryptAes, secretKey));
    }
}
