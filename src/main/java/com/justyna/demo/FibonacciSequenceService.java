package com.justyna.demo;

import org.springframework.stereotype.Service;

/**
 * Created by jpokr on 2017-08-06.
 */
@Service
public class FibonacciSequenceService {

    public int computeFibonacciNumberIterative(int number) {

        int beforeLast = 0;
        int last = 0;
        int result = 0;
        for (int i = 0; i < number; i++) {

            if (i == 0) {
                result = 0;
            } else if (i == 1) {
                result = 1;
            }
            beforeLast = last;
            last = result;
            result = beforeLast + last;

        }

        return result;
    }

    public int computeFibonacciNumberRecursive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        } else if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }
        return computeFibonacciNumberRecursive(number - 1) + computeFibonacciNumberRecursive(number - 2);

    }
}




