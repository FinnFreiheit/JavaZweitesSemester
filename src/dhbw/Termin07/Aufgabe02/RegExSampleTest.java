package dhbw.Termin07.Aufgabe02;

import org.junit.Assert;
import org.junit.Test;

public class RegExSampleTest
{


    @Test
    public void testIsIPAdresse() {
        Assert.assertTrue(RegExSample.isIPAdresse("4.4.4.9"));
        Assert.assertTrue(RegExSample.isIPAdresse("14.004.34.91"));
        Assert.assertFalse(RegExSample.isIPAdresse("014:255:199:099"));
        Assert.assertTrue(RegExSample.isIPAdresse("014.255.199.099"));
        Assert.assertFalse(RegExSample.isIPAdresse("256.255.199.099"));
        Assert.assertFalse(RegExSample.isIPAdresse("333.444.333.444"));
    }

    @Test
    public void testIsEmailAdresse() {
        Assert.assertTrue(RegExSample.isEmailAdresse("testuser@muster.de"));
        Assert.assertTrue(RegExSample.isEmailAdresse("Test.User@muster.de"));
        Assert.assertTrue(RegExSample.isEmailAdresse("Test.User@muster.DE"));
        Assert.assertTrue(RegExSample.isEmailAdresse("Test.User@muster.De"));
        Assert.assertFalse(RegExSample.isEmailAdresse("Test.user.muster.de"));
        Assert.assertFalse(RegExSample.isEmailAdresse("Test.user.muster.12"));
        Assert.assertFalse(RegExSample.isEmailAdresse("@muster.de"));
        Assert.assertFalse(RegExSample.isEmailAdresse("Test.user@"));
    }

    @Test
    public void testIsTelefonNummer() {
        Assert.assertTrue(RegExSample.isTelefonNummer("+49 1234 2334"));
        Assert.assertTrue(RegExSample.isTelefonNummer("+4912342334"));
        Assert.assertTrue(RegExSample.isTelefonNummer("(049)12342334"));
        Assert.assertTrue(RegExSample.isTelefonNummer("+49/12342334"));
        Assert.assertTrue(RegExSample.isTelefonNummer("+49/12342334"));
        Assert.assertTrue(RegExSample.isTelefonNummer("+49-1234-2334"));
        Assert.assertFalse(RegExSample.isTelefonNummer("+D-1234-2334"));
        Assert.assertFalse(RegExSample.isTelefonNummer("+49-12e4-2334"));
        Assert.assertFalse(RegExSample.isTelefonNummer("(0b9)12342334"));
        Assert.assertFalse(RegExSample.isTelefonNummer("(049)1234B334"));
        Assert.assertFalse(RegExSample.isTelefonNummer("+4b9/12342334"));
        Assert.assertFalse(RegExSample.isTelefonNummer("+49/12342b334"));
    }
}
