package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegex {
    public static boolean validatefirstName(String firstname) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(firstname);
        return matcher.matches();
    }

    public static boolean validatelastName(String lastname) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(lastname);
        return matcher.matches();
    }

    public static boolean validateemail(String email) {
        Pattern pattern = Pattern.compile("^[A-Za-z]{0,}+@[a-z]{5}[.]*[co][a-z]*$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validateMobileNumber(String mobilenumber) {
        Pattern pattern = Pattern.compile("^[0-9]{2}[ ][0-9]{0,}$");
        Matcher matcher = pattern.matcher(mobilenumber);
        return matcher.matches();
    }

   public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile("^[a-z]{0,}+@[1-9]{3}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
   }
}

