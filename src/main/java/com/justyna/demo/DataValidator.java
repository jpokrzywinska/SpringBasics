package com.justyna.demo;

import org.springframework.stereotype.Component;

/**
 * Created by jpokr on 2017-07-30.
 */

@Component
public class DataValidator {

    public void checkName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException(name);
        } else if (name.charAt(0) != name.toUpperCase().charAt(0)) {
            throw new IllegalArgumentException(name);
        }
    }
}
