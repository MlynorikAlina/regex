package com.bsu;

import static org.junit.jupiter.api.Assertions.*;

class isPhoneNumberTest {

    @org.junit.jupiter.api.Test
    void isPhoneNumberTestNumber() {
        assertTrue(Main.isPhoneNumber("+375441234567"));
        assertTrue(Main.isPhoneNumber("80441234567"));

        assertTrue(Main.isPhoneNumber("+375-(44)-123-45-67"));
        assertTrue(Main.isPhoneNumber("+375(44)123-45-67"));
    }
    @org.junit.jupiter.api.Test
    void isPhoneNumberTestLength() {
        assertFalse(Main.isPhoneNumber("804412345677"));
        assertFalse(Main.isPhoneNumber("8044123456"));
    }
    @org.junit.jupiter.api.Test
    void isPhoneNumberTestSign() {
        assertFalse(Main.isPhoneNumber("+37544)123-45-67"));
        assertFalse(Main.isPhoneNumber("375441234567"));
    }
}