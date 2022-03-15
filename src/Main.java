import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner pobieranie = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Podaj piewrszą liczbę: ");
        a=pobieranie.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        b=pobieranie.nextInt();
        c=a+b;
        System.out.println("Suma wynosi: " +c);
    }
}