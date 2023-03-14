package com.example.myFirstTests.unittesting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testVowelsMethod() {
        assertEquals("aoo", StringUtils.vowels("aToto?"));
        assertEquals("eoo", StringUtils.vowels("C est Toto28"));
        assertEquals("", StringUtils.vowels(""));

    }

    @Test
    public void testUniqueVowelsMethod() {
        assertEquals("ao", StringUtils.uniqueVowels("aToto?"));
        assertEquals("ao", StringUtils.uniqueVowels("aToto28"));
        assertEquals("eo", StringUtils.uniqueVowels("C est Toto28"));
        assertEquals("ao", StringUtils.uniqueVowels("aboobcc"));
        assertEquals("", StringUtils.uniqueVowels("bbcc"));
    }

}

// https://www.baeldung.com/junit-5