package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {

    // methodBeingTested_inputGiven_expectedOutcome
    // happy path: "Hello|World" -> 2 parts
    @Test
    void splitString_oneSeperator_expectedTwoParts() throws InvalidStringInputException {
        String inputString = "Hello|World";
        String separator = "\\|";
        StringParser sp = new StringParser();
        ArrayList<String> stringParts = sp.splitString(inputString, separator);
        assertEquals(2, stringParts.size());
    }

    // failure case to check how it is handled
    // on null, throw invalid string input exception
    @Test
    void splitString_nullInput_expectException() {
        String inputString = null;
        String separator = "\\|";
        StringParser sp = new StringParser();
        assertThrows(InvalidStringInputException.class, () -> sp.splitString(inputString, separator));
    }
}