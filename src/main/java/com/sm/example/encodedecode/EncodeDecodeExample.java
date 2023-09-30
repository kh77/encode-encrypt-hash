package com.sm.example.encodedecode;

public class EncodeDecodeExample {

    public static void main(String[] args) {
        encodeDecodeText();
        encodeDecodeUrl();
    }

    private static void encodeDecodeText() {
        String sentence = "Hello World";
        System.out.println("Base 64 Encode/Decode TExt Example word: " + sentence);
        String encodeBase64 = EncodeDecodeUtil.encodeBase64(sentence);
        System.out.println("Encode: " + encodeBase64);
        System.out.println("Decode: " + EncodeDecodeUtil.decodeBase64(encodeBase64));
    }

    private static void encodeDecodeUrl() {
        String sentence = "Hello World";
        System.out.println("Base 64 Encode/Decode Url Example word: " + sentence);
        String encodeBase64 = EncodeDecodeUtil.encodeUrl(sentence);
        System.out.println("Encode: " + encodeBase64);
        System.out.println("Decode: " + EncodeDecodeUtil.decodeUrl(encodeBase64));
    }
}
