package com.java.behavioralPattern.immutablePattern;

/**
 * Created by Intellij IDEA Author: lizhiyong E-mail: lizhiyong@xiaomi.com Time:
 * 17-3-3 上午10:31
 */

/**
 * 自定义复数
 */
public class Complex extends Number implements java.io.Serializable, Cloneable, Comparable {

    static final public Complex i = new Complex(0.0, 1.0);
    // 实部
    private double re;
    // 虚部
    private double im;

    public Complex(Complex z) {
        re = z.re;
        im = z.im;
    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex(double re) {
        this.re = re;
        this.im = 0.0;
    }
    public Complex() {
        re = 0.0;
        im = 0.0;
    }

    public boolean equals(Complex z) {
        return (re == z.re && im == z.im);
    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Complex) {
            return equals((Complex) obj);
        } else {
            return false;
        }
    }

    public int hashCode() {
        long re_bits = Double.doubleToLongBits(re);
        long im_bits = Double.doubleToLongBits(im);
        return (int) ((re_bits ^ im_bits) ^ ((re_bits ^ im_bits) >> 32));
    }

    public double real() {
        return re;
    }

    public double imag() {
        return im;
    }

    public static double real(Complex z) {
        return z.re;
    }

    public static double imag(Complex z) {
        return z.im;
    }

    /**
     * 返还复数的相反数
     */
    public static Complex negate(Complex z) {
        return new Complex(-z.re, -z.im);
    }

    /**
     * 返还复数的共轭复数
     */
    public static Complex conjugate(Complex z) {
        return new Complex(z.re, -z.im);
    }

    /**
     * 两个数的和ｘ＋ｙ
     * 
     * @param x
     * @param y
     * @return
     */
    public static Complex add(Complex x, Complex y) {
        return new Complex(x.re + y.re, x.im + y.im);
    }

    public static Complex add(Complex x, double y) {
        return new Complex(x.re + y, x.im);
    }

    public static Complex add(double x, Complex y) {
        return new Complex(x + y.re, y.im);
    }

    /**
     * 两个数的差，ｘ－ｙ
     */
    public static Complex subtract(Complex x, Complex y) {
        return new Complex(x.re - y.re, x.im - y.im);
    }

    public static Complex subtract(Complex x, double y) {
        return new Complex(x.re - y, x.im);
    }

    public static Complex subtract(double x, Complex y) {
        return new Complex(x - y.re, -y.im);
    }

    /**
     * 返还两个数的积 x*y
     */
    public static Complex multiply(Complex x, Complex y) {
        return new Complex(x.re * y.re - x.im * y.im, x.re * y.im + x.im * y.re);
    }

    public static Complex multiply(Complex x, double y) {
        return new Complex(x.re * y, x.im * y);
    }

    public static Complex multiply(double x, Complex y) {
        return new Complex(x * y.re, x * y.im);
    }

    public String toString() {
        if (im == 0.0) {
            return String.valueOf(re);
        }
        if (re == 0.0) {
            return String.valueOf(im) + "i";
        }
        String sign = ((im < 0.0) ? "-" : "+");
        return (String.valueOf(re) + sign + String.valueOf(im) + "i");
    }

    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public int intValue() {
        return 0;
    }
}
