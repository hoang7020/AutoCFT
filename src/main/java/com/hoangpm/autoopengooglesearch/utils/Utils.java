/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangpm.autoopengooglesearch.utils;

/**
 *
 * @author ZeroX
 */
public class Utils {

    public static StringBuilder handleStringArray(String[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;
        for (String s : arr) {
            stringBuilder.append(s);
            if (i < arr.length) {
                stringBuilder.append("%20");
                i++;
            }
        }
        return stringBuilder;
    }
}
