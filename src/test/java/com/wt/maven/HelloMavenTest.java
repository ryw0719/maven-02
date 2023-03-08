package com.wt.maven;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloMavenTest {

    @Test
    public void m1() {
        HelloMaven hm = new HelloMaven();//Ctrl+Alt+V
        String actual = hm.m1();//实际值
        String expected = "HelloMaven!!";//期望值
        assertEquals(expected,actual);//断言
    }
}