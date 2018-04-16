package pl.edu.ur.oopl6.zad1;

public class SkladoweStatyczne {

    public static void main(String[] args) {
        Complex x1=new Complex(3,4);
        System.out.println(x1.zwrocStringAlebraiczna());
        System.out.println(x1.zwrocStringTrygonometryczna());
        System.out.println(x1.zwrocStringWykladnicza());
        Complex.zwrocZnakTest();
    }
    
}
