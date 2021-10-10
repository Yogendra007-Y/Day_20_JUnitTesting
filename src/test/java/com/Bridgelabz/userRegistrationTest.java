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
}
