package com.practice.functionalinterface;

import com.practice.functionalInterface.AddTwoValues;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AddTwoValuesTest {

    private AddTwoValues addTwoValues;

    @BeforeEach
    void setup(){
         addTwoValues = new AddTwoValues();
    }

    @ParameterizedTest
    @CsvSource( {
            "1,2,3",
            "23,2,25",
            "10,10,20"
    })
    void testApply(int a, int b, int expected){
        int actual = addTwoValues.addTwoVariables(a, b);
        Assertions.assertEquals(expected, actual);
    }
}
