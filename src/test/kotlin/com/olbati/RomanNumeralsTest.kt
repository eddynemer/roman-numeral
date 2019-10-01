package com.olbati

import org.junit.Assert
import org.junit.Test

class RomanNumeralsTest {

    @Test
    fun given_I_should_return_1() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(1, romanNumerals.reverseConvert("I"))
    }

    @Test
    fun given_II_should_return_2() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(2, romanNumerals.reverseConvert("II"))
    }

    @Test
    fun given_III_should_return_3() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(3, romanNumerals.reverseConvert("III"))
    }

    @Test
    fun given_IV_should_return_4() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(4, romanNumerals.reverseConvert("IV"))
    }

    @Test
    fun given_V_should_return_5() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(5, romanNumerals.reverseConvert("V"))
    }

    @Test
    fun given_VI_should_return_6() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(6, romanNumerals.reverseConvert("VI"))
    }

    @Test
    fun given_VII_should_return_7() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(7, romanNumerals.reverseConvert("VII"))
    }

    @Test
    fun given_VIII_should_return_8() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(8, romanNumerals.reverseConvert("VIII"))
    }

    @Test
    fun given_IX_should_return_9() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(9, romanNumerals.reverseConvert("IX"))
    }

    @Test
    fun given_X_should_return_10() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(10, romanNumerals.reverseConvert("X"))
    }

    @Test
    fun given_LX_should_return_60() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(60, romanNumerals.reverseConvert("LX"))
    }

    @Test
    fun given_LXX_should_return_70() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(70, romanNumerals.reverseConvert("LXX"))
    }

    @Test
    fun given_LXXX_should_return_80() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(80, romanNumerals.reverseConvert("LXXX"))
    }

    @Test
    fun given_XC_should_return_90() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(90, romanNumerals.reverseConvert("XC"))
    }

    @Test
    fun given_CCCLXIX_should_return_369() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(369, romanNumerals.reverseConvert("CCCLXIX"))
    }

    @Test
    fun given_CD_should_return_400() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(400, romanNumerals.reverseConvert("CD"))
    }

    @Test
    fun given_MMDCCLI_should_return_2751() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals(2751, romanNumerals.reverseConvert("MMDCCLI"))
    }

    @Test
    fun given_1_should_return_I() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("I", romanNumerals.convert(1))
    }

    @Test
    fun given_5_should_return_V() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("V", romanNumerals.convert(5))
    }

    @Test
    fun given_10_should_return_X() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("X", romanNumerals.convert(10))
    }

    @Test
    fun given_50_should_return_L() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("L", romanNumerals.convert(50))
    }

    @Test
    fun given_4_should_return_IV() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("IV", romanNumerals.convert(4))
    }

    @Test
    fun given_6_should_return_VI() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("VI", romanNumerals.convert(6))
    }

    @Test
    fun given_2_should_return_II() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("II", romanNumerals.convert(2))
    }

    @Test
    fun given_3_should_return_III() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("III", romanNumerals.convert(3))
    }

    @Test
    fun given_7_should_return_VII() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("VII", romanNumerals.convert(7))
    }

    @Test
    fun given_8_should_return_VIII() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("VIII", romanNumerals.convert(8))
    }

    @Test
    fun given_9_should_return_IX() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("IX", romanNumerals.convert(9))
    }

    @Test
    fun given_60_should_return_LX() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("LX", romanNumerals.convert(60))
    }

    @Test
    fun given_70_should_return_LXX() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("LXX", romanNumerals.convert(70))
    }

    @Test
    fun given_80_should_return_LXXX() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("LXXX", romanNumerals.convert(80))
    }

    @Test
    fun given_90_should_return_XC() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("XC", romanNumerals.convert(90))
    }

    @Test
    fun given_369_should_return_CCCLXIX() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("CCCLXIX", romanNumerals.convert(369))
    }

    @Test
    fun given_400_should_return_CD() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("CD", romanNumerals.convert(400))
    }

    @Test
    fun given_2751_should_return_MMDCCLI() {
        val romanNumerals = RomanNumerals()
        Assert.assertEquals("MMDCCLI", romanNumerals.convert(2751))
    }

}