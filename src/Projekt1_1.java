//Martyna Stencel 4AZI
import javax.swing.JOptionPane;

public class Projekt1_1 {
    public static void main(String[] args){
        String tekst;

        while (true){
            tekst = JOptionPane.showInputDialog("Wprowadź dowolny tekst:");

            //zamknięcie okna lub anulowanie
            if (tekst == null){
                System.exit(0);
            }

            //zostawienie pustego pola
            if (tekst.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Tekst nie został wprowadzony. Spróbuj ponownie", "Błąd wprowadzania", JOptionPane.WARNING_MESSAGE);
            }

            else {
                break;
            }
        }

        String wynik = tekst.toUpperCase();
        JOptionPane.showMessageDialog(null, wynik);

        System.exit(0);
    }
}