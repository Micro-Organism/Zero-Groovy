package com.zero.groovy.common.component;

import groovy.lang.Script;

public class TestScript extends Script {

    @Override
    public Object run() {
        return null;
    }

    public Integer add (Integer first, Integer second) {
        return first + second;
    }

}
