package com.wust.mmall;

import org.junit.Test;

import java.math.BigDecimal;

public class BigDecimalTest {
    @Test
    public void test1(){
        BigDecimal bigDecimal = new BigDecimal("12.3E+7");
        BigDecimal bigDecima2 = new BigDecimal("0.010");

        System.out.println(bigDecimal.add(bigDecima2));
    }
}
