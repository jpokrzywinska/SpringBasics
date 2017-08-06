package com.justyna.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by jpokr on 2017-08-06.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FibonacciSequenceTest {
    @Autowired
    FibonacciSequenceService fibonacciSequenceService;


    @Test
    public void shouldSuccessfullyComputeFibonacciNumberIterative() {

        //given
        int number = 2;

        //when
        int result = fibonacciSequenceService.computeFibonacciNumberIterative(number);

        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldSuccessfullyComputeFibonacciNumberRecursive() {
        //given
        int number = 9;

        //when
        int result2 = fibonacciSequenceService.computeFibonacciNumberRecursive(number);

        //then

        assertThat(result2).isEqualTo(34);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNumberIsNegativeValue() {

        //given
        int number = -4;

        //when
        int result = fibonacciSequenceService.computeFibonacciNumberRecursive(number);


    }
}
