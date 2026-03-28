//Martyna Stencel 4AZI
import java.util.Scanner;

public class Projekt1_3{
    public static void main(String[] args){

        Scanner wejscie = new Scanner(System.in);
        int n = 0;

        while (true){

            System.out.print("Podaj liczbę całkowitą większą od 0: ");

            if (wejscie.hasNextInt()){
                n = wejscie.nextInt();

                if(n > 0){
                    break;
                }

                else {
                    System.out.println("Błąd! podaj liczbę dodatnią");
                }
            }

            else{
                System.out.println("Błąd! Wprowadzono niepoprawne dane");

                wejscie.next();
            }
        }

        int suma = 0;

        for (int i = 1; i <=n; i+=2){
            suma += i;
        }

        System.out.println("Suma liczb nieparzystych wynosi: " + suma);

        wejscie.close();

    }
}