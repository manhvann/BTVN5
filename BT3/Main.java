package BT3;

public class Main {
    public static void main(String[] args)
    {
        A a=new A();
        System.out.println(a.isPrime(2));
        System.out.println(a.isPrime(1.2));
        System.out.println(a.isPrime(1000000000));
        System.out.println(a.isPrime(54.12324));
    }
}
