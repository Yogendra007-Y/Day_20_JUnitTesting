package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class userRegistrationTest {
    userRegistrationFormat userRegistration = new userRegistrationFormat();
    @Test
    public void givenName_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.firstName("Yogendra");
        Assert.assertTrue(result);
    }
    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.lastName("Sharma");
        Assert.assertTrue(result);
    }
    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.emailValidation("abc@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void giveEmailValues_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.emailValidation("abc..@yahoo.com");
        Assert.assertFalse(result);
    }
        @Test
        public void giveNumberValue_WhenProper_ShouldReturnTrue(){
            boolean result = userRegistration.numberValidation("10 1234567890");
            Assert.assertTrue(result);
        }
        @Test
        public void givenNumberValues_WhenNotProper_ShouldReturnFalse(){
            boolean result = userRegistration.numberValidation("11 08450911888");
            Assert.assertFalse(result);
        }
    @Test
    public void giveLoginRule1Value_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginRule1Validation("agnnfwqopn");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLoginRule1Values_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.loginRule1Validation("aqropnm");
        Assert.assertFalse(result);
    }
    @Test
    public void givenRule2Value_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginRule2Validation("Logaqaaopnm");
        Assert.assertTrue(result);
    }
    @Test
    public void givenRule2Values_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.loginRule2Validation("addqeghopnm");
    }
    @Test
    public void givenRule3Value_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginRule3Validation("Laoqo1rpnm");
        Assert.assertTrue(result);
    }
    @Test
    public void givenRule3Values_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.loginRule3Validation("aqLawhrpnm");
        Assert.assertFalse(result);
    }
}
