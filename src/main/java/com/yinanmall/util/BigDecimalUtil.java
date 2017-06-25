package com.yinanmall.util;

import java.math.BigDecimal;

/**
 * Created by yinan on 2017/6/25.
 */
public class BigDecimalUtil {

    private BigDecimalUtil() {
    }

    public static BigDecimal add(double num1, double num2) {

        BigDecimal b1 = new BigDecimal(Double.toString(num1));
        BigDecimal b2 = new BigDecimal(Double.toString(num2));

        return b1.add(b2);
    }

    public static BigDecimal sub(double num1, double num2) {

        BigDecimal b1 = new BigDecimal(Double.toString(num1));
        BigDecimal b2 = new BigDecimal(Double.toString(num2));

        return b1.subtract(b2);
    }

    public static BigDecimal mul(double num1, double num2) {

        BigDecimal b1 = new BigDecimal(Double.toString(num1));
        BigDecimal b2 = new BigDecimal(Double.toString(num2));

        return b1.multiply(b2);
    }


    public static BigDecimal div(double num1, double num2) {

        BigDecimal b1 = new BigDecimal(Double.toString(num1));
        BigDecimal b2 = new BigDecimal(Double.toString(num2));

        return b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);//四舍五入，保留2位小数

        //除不尽的情况下
    }
}
