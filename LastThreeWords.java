
import javax.swing.JOptionPane;

public class LastThreeWords {
    public static void main(String[] args) {

        // Ask the user to enter the first word
        String word1 = JOptionPane.showInputDialog("Enter word 1:");

        // Ask the user to enter the second word
        String word2 = JOptionPane.showInputDialog("Enter word 2:");

        // Ask the user to enter the third word
        String word3 = JOptionPane.showInputDialog("Enter word 3:");

        // Display the three words
        JOptionPane.showMessageDialog(null,
                word1 + " " + word2 + " " + word3);
    }
}
