package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    void string_with_multiple_number_should_return_number_as_int() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(21, stringCalculator.add("1,2,3,4,5,6"));
    	
    }
    @Test
    void string_with_multiple_number_newline_delimeter_return_number_as_int() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	
        assertEquals(21,stringCalculator.add("1,2\n3,4\n5,6"));
    	
    }
}
