import javax.swing.JOptionPane;

public class Ninth {
    public static void main(String[] args) {
        String inputDialog = JOptionPane.showInputDialog("Write a largest side: ");
        int largestSide = Integer.parseInt(inputDialog);
        
        String secondInputDialog = JOptionPane.showInputDialog("Write a largest side: ");
        int smallerSide = Integer.parseInt(secondInputDialog);
        
        float area = (largestSide * smallerSide) / 2;
        
        System.out.println("The area is : " + area);
    }
}
