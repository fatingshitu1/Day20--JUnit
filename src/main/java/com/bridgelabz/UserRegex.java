package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegex {
    public static boolean validatefirstName(String firstname) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(firstname);
        return matcher.matches();
    }
}

