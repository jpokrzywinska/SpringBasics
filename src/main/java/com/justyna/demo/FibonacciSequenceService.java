package com.justyna.demo;

import org.springframework.stereotype.Service;

/**
 * Created by jpokr on 2017-08-06.
 */
@Service
public class FibonacciSequenceService {

	//todo jpokrzywinskacode listing missing	
	//todo jpokrzywinska adjust this name so it describes the method used to compute Fibonacci Number 
	public int computeFibonacciNumber(int number) {

        int beforeLast = 0;
        int last =0;
        int result=0 ;
        for (int i = 0; i < number; i++) {

            if (i == 0) {
                result = 0;
            } else if (i == 1) {
                result = 1;
            }
	//todo jpokrzywinska are you sure about execution order?
                beforeLast = last;
                last = result;
                result = beforeLast+last ;

            }

        return result;
    }
	
	//todo jpokzywinska Missing second computing method (recursive)
}




