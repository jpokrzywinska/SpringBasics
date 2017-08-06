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
    public void checkSuccessfullyFibonacciNumber (){

        //given
        int number =4;

        //when
        int result = fibonacciSequenceService.computeFibonacciNumber(number);

        //then
        assertThat(result).isEqualTo(3);
    }
}
