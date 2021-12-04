package com.pratise.githubcopilot.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {

    @Test
    void isPalindrome() {
        assertTrue(StringManipulation.isPalindrome("racecar"));
    }
}
