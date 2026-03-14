import javax.swing.JOptionPane;
import java.util.Scanner;

public class Projekt1 {
    public static void main(String[] args){
        Scanner wejscie = new Scanner(System.in);
        System.out.println("Twoja stara");
        JOptionPane.showMessageDialog(null, "Twoja stara", "Tytuł", JOptionPane.WARNING_MESSAGE);
    }
}