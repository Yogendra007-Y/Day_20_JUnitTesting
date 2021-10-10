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
        String regexFirstName = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regexFirstName);
        matcher = pattern.matcher(FirstName);
        return matcher.matches();
    }
    /* method lastName to validate last name format
       @param LastName return boolean value
     */
    public boolean lastName(String LastName){
        String regexLastName = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regexLastName);
        matcher = pattern.matcher(LastName);
        return matcher.matches();
    }
    /* method emailValidation to validate email format0
       @param Email return boolean value
     */
    public boolean emailValidation(String Email){
        String regxEmail = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z][2,3]){0,1}$";
        pattern = Pattern.compile(regxEmail);
        matcher = pattern.matcher(Email);
        return matcher.matches();
    }
    /* method  numberValidation to validate phone no format
       @param PhoneNo return boolean value
     */
    public boolean numberValidation(String PhoneNo){
        String regxPhoneNo = "^[0-9]{2}\\s[0-9]{10}";
        pattern = Pattern.compile(regxPhoneNo);
        matcher = pattern.matcher(PhoneNo);
        return matcher.matches();
    }
    /* method loginValidation to validate password format 2
       @param Password return boolean value
     */
    public boolean loginValidation(String Password){
        String regexPassword = "^[A-Z]{1}[A-Za-z0-9]{8,}";
        pattern = Pattern.compile(regexPassword);
        matcher = pattern.matcher(Password);
        return matcher.matches();
    }
}