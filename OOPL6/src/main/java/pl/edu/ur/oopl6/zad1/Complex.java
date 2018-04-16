/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad1;

/**
 *
 * @author Emek
 */
public class Complex {
    double re,im,mod,arg;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    private Complex(double re, double im, double mod, double arg) {
        this.re = re;
        this.im = im;
        this.mod = mod;
        this.arg = arg;
    }


    
    public static double modul(Complex x){
        double wynik=Math.sqrt((x.re*x.re + x.im*x.im));
        return wynik;
    }
    public static Complex sprz(Complex x){
        Complex wynik=new Complex(x.re,-1*x.im);
        return wynik;
    }
    public static double argument(Complex x){
        double wynik=Math.atan2(x.im,x.re);
        return wynik;
    }

    //ZAMIANA START
    public static Complex algebraToWykladnicza(Complex x){
        Complex wynik = new Complex(x.re,x.im,Complex.modul(x),Complex.argument(x));
        return wynik;
    }
    //ZAMIANA STOP
    
    //DZIALANIA ALGEBRAICZNE START
    
    public static Complex sumaAlg(Complex x1, Complex x2) {
        Complex wynik=new Complex(x1.re+x2.re, x1.im+x2.im);
        return wynik;
    }

    public static Complex roznicaAlg(Complex x1, Complex x2) {
        Complex wynik=new Complex(x1.re-x2.re, x1.im-x2.im);
        return wynik;
    }

    public static Complex iloczynAlg(Complex x1, Complex x2) {
        Complex wynik=new Complex((x1.re*x2.re) - (x1.im*x2.im), (x1.re*x2.im) + (x1.im*x2.re));
        return wynik;
    }

    public static Complex ilorazAlg(Complex x1, Complex x2) {
        Complex wynik=new Complex((x1.re * x2.re + x1.im * x2.im) / (x2.re * x2.re + x2.im * x2.im), (x1.im * x2.re - x1.re * x2.im) / (x2.re * x2.re + x2.im * x2.im));
        return wynik;
    }
    
    //DZIALANIA AGLEBRAICZNE KONIEC
    
    //WYPISYWANIE START
    private String zwrocZnak(){
        if (this.im>=0){
            return "+";
        }
        return "";
    }
    public static String zwrocZnakTest(){
        return "-";
    }
    public String zwrocStringAlebraiczna() {
        String wynik=this.re +zwrocZnak()+this.im+"i";
        return wynik;
    }
    public String zwrocStringWykladnicza() {
        Complex x = Complex.algebraToWykladnicza(this);
        String wynik=x.mod+"*e^(("+x.arg+")i)";
        return wynik;
    }
    public String zwrocStringTrygonometryczna() {
        Complex x = Complex.algebraToWykladnicza(this);
        String wynik=x.mod+"("+x.arg+"+i*"+x.arg+")";
        return wynik;
    }
    //WYPISYWANIE STOP
    
}
