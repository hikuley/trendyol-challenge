package com.trendyol.challenge;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;

class NumberConvertToTextTest {

    private NumberConvertToText numberConverter;

    @BeforeEach
    void setUp() {
        numberConverter = NumberConvertToText.getInstance();
    }

    @Test
    void testConvert1() {
        for (int i = 0; i < 1000; i++) {
            String converted = numberConverter.convert(i);
            Assert.checkNonNull(converted);
            System.out.println(NumberFormat.getInstance().format(i) + " = " + converted);
        }
    }

    @Test
    void testConvert2() {
        for (int i = 1000; i < 10000; i++) {
            String converted = numberConverter.convert(i);
            Assert.checkNonNull(converted);
            System.out.println(NumberFormat.getInstance().format(i) + " = " + converted);
        }
    }

    @AfterEach
    void tearDown() {
        //
    }
}