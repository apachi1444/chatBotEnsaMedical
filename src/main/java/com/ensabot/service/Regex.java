/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ensabot.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * EnsaBot
 *
 * @author equiê Ensa Gi4
 */
public class Regex {

    public static String match(String pattern, String keyword){
        Pattern p = Pattern.compile(pattern.toLowerCase());
        Matcher m = p.matcher(keyword.toLowerCase());
        if (m.matches()) {
            return m.group(1);
        }
        return "";
    }

    public static String clear(String text){
        Pattern pattern = Pattern.compile("\\[.*\\]");

        // Replace all occurrences of pattern in input
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll("");
    }
}
