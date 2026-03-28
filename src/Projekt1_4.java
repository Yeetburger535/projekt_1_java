//Martyna Stencel 4AZI
import java.util.Scanner;

public class Projekt1_4{
    public static void main(String[] args){

        Scanner wejscie = new Scanner(System.in);
        int liczba = 0;

        while (true){

            System.out.print("Podaj nieujemną liczbę całkowitą: ");

            if (wejscie.hasNextInt()){
                liczba = wejscie.nextInt();

                if(liczba >= 0){
                    break;
                }

                else {
                    System.out.println("Błąd! Liczba nie może być ujemna");
                }
            }

            else{
                System.out.println("Błąd! Wprowadzono niepoprawne dane");

                wejscie.next();
            }
        }

        System.out.println("System binarny:" + binarny(liczba));
        System.out.println("System ósemkowy: " + osemkowy(liczba));
        System.out.println("System szesnastkowy: " + szesnastkowy(liczba));

        wejscie.close();

    }

    public static String binarny (int n){
        if (n == 0) return "0";

        String wynik ="";

        while (n > 0){
            int reszta = n & 1;
            wynik = reszta + wynik;
            n = n >> 1;
        }
        return wynik;
    }

    public static String osemkowy(int n){
        if (n == 0) return "0";

        String wynik = "";

        while (n > 0){
            int reszta = n & 7;
            wynik = reszta + wynik;
            n = n >> 3;
        }
        return wynik;
    }

    public static String szesnastkowy(int n){
        if (n == 0) return "0";

        String wynik = "";

        char[] znaki = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (n > 0) {
            int reszta = n & 15;
            wynik = znaki[reszta] + wynik;
            n = n >> 4;
        }
        return wynik;
    }
}