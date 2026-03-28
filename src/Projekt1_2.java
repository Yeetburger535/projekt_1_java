import java.math.BigInteger;
import java.util.Scanner;

public class Projekt1_2{
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        int n = 0;

       while (true){
           System.out.println("Podaj liczbę całkowitą (0 lub większą) do obliczenia silni: ");

           if (wejscie.hasNextInt()){
               n = wejscie.nextInt();

               if(n >= 0){
                   break;
               }

               else {
                   System.out.println("Błąd! Wprowadzono liczbę ujemną");
               }
           }

           else{
               System.out.println("Błąd! Wprowadzono niepoprawne dane");

               wejscie.next();
           }
       }

       //liczenie silni
        BigInteger silnia = BigInteger.ONE;

       for (int i = 2; i <= n; i++){
           silnia = silnia.multiply(BigInteger.valueOf(i));
       }

       System.out.println("Silnia z " + n + " wynosi:");
       System.out.println(silnia);

       wejscie.close();

    }

}