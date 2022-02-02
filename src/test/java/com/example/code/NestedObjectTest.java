package com.example.code;

import org.junit.Assert;
import org.junit.Test;

public class NestedObjectTest {

    private NestedObject nestedObject;

    @Test
    public void testNestedObject_success(){

        String valueD = nestedObject.getObjectValue("{\"a\":{\"b\":{\"c\":\"d\"}}}","a/b/c");
        String valueA = nestedObject.getObjectValue("{\"x\":{\"y\":{\"z\":\"a\"}}}","x/y/z");

        Assert.assertEquals(valueD, "d");
        Assert.assertEquals(valueA, "a");

    }

    @Test
    public void testNestedObject_fail(){

        String valueD = nestedObject.getObjectValue("{\"a\":{\"b\":{\"c\":\"d\"}}}","a/c");
        String valueA = nestedObject.getObjectValue("{\"x\":{\"y\":{\"z\":\"a\"}}}","x/y/z/za");

        Assert.assertEquals(valueD, "nil");
        Assert.assertEquals(valueA, "nil");

    }

}


