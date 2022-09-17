import javax.swing.JOptionPane;

public class Tenth {
    public static void main(String[] args) {
        String inputDialog = JOptionPane.showInputDialog("Write the  inch: ");
        int number = Integer.parseInt(inputDialog);
        double centimeter = 2.54 * number;

        System.out.println(centimeter);
    }
}
