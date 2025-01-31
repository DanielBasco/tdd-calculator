package tdd;

import org.junit.jupiter.api.AfterEach;
import  org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("String as an input")
    void testSomething(){
      int actual = calculator.add("1,2,3");
      int expected = 6;
      assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Array of numbers as an input")
            void testSomething2() {
        int actual = calculator.add(new int[]{1, 2, 3});
        int expected = 6;
        assertEquals(actual, expected);
    }
}