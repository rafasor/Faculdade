import javax.swing.JOptionPane;

public class Fourth {
    public static void main(String[] args) {
        String inputDialog = JOptionPane.showInputDialog("Write a number: ");
        int number = Integer.parseInt(inputDialog);        
        
        if(number % 5 == 0 ){
            System.out.println("Can be divisible");
        }
        else{
            System.out.println("Is not divisible by five");
        }
    }
}
