package com.justyna.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jpokr on 2017-08-06.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataValidatorTest {
    @Autowired
    private DataValidator dataValidator;

    @Test
    public void shouldSuccessfullyValidateData() {
        //given
        String name = "Justyna";

        // when
        dataValidator.checkName(name);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNameIsNull() {

        //given
        String name = null;

        //when
        dataValidator.checkName(name);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNameIsEmpty() {

        //given
        String name = "";

        //when
        dataValidator.checkName(name);
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNameHasFirstLetterLowerCase() {
        //given
        String name = "justna";

        //when
        dataValidator.checkName(name);
    }
}
