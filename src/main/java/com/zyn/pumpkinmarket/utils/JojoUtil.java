package com.zyn.pumpkinmarket.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.Base64;

@Slf4j
public class JojoUtil {

    private static final String KEY_Jojo = "Jojo";

    private static final int LENGTH = 16;

    public static String encrypt(String data) {
        StringBuilder stringBuilder = new StringBuilder();
        int gap = (data.length() - KEY_Jojo.length()) / 3;
        for (int i = 0; i < data.length(); i++) {
            if (i % gap == 0) {
                stringBuilder.append(KEY_Jojo);
            }
            stringBuilder.append(data.charAt(i));
        }
        byte[] encode = Base64.getEncoder().encode(stringBuilder.toString().getBytes());
        int length = encode.length / LENGTH * LENGTH;
        byte[] bytes = new byte[length];
        System.arraycopy(encode, 0, bytes, 0, encode.length);
        System.arraycopy(encode, 0, bytes, encode.length, length - encode.length);
        return new String(bytes);
    }
}
