package com.Bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistrationFormat {
    Pattern pattern;
    Matcher matcher;
    /* method firstName to validate first name format
       @param FirstName return boolean value
     */
    public boolean firstName(String FirstName){
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(FirstName);
        return matcher.matches();
    }
    /* method lastName to validate last name format
       @param LastName return boolean value
     */
    public boolean lastName(String LastName){
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(LastName);
        return matcher.matches();
    }
    /* method emailValidation to validate email format0
       @param Email return boolean value
     */
    public boolean emailValidation(String Email){
        String regx = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z][2,3]){0,1}$";
        pattern = Pattern.compile(regx);
        matcher = pattern.matcher(Email);
        return matcher.matches();
    }
    /* method  numberValidationto validate phone no format
     * @param PhoneNo return boolean value
     */
    public boolean numberValidation(String PhoneNo){
        String regx = "^[0-9]{2}\\s[0-9]{10}";
        pattern = Pattern.compile(regx);
        matcher = pattern.matcher(PhoneNo);
        return matcher.matches();
    }
}