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

	//todo There is a better way to describe this testcase
    @Test
    public void checkSuccessfullyFibonacciNumber() {

        //given
        int number = 2;

        //when
        int result = fibonacciSequenceService.computeFibonacciNumberIterative(number);

        //then
        assertThat(result).isEqualTo(1);
    }
	//todo There is a better way to describe this testcase
    @Test
    public void checkSuccessfullyFibonacciNumberRekursive() {
        //given
        int number = 9;

        //when
        int result2 = fibonacciSequenceService.computeFibonacciNumberRekursive(number);

        //then

        assertThat(result2).isEqualTo(34);
    }
}
