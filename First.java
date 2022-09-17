import javax.swing.JOptionPane;

public class First {
    public static void main(String[] args) {
        
        String inputDialog = JOptionPane.showInputDialog("Write a number: ");
        int number = Integer.parseInt(inputDialog);        
        
        if(number > 0){
            System.out.println(" This number is positive ");
        }
        else if(number < 0){
            System.out.println("This Number is negativa");
        }
        else{
            System.out.println("This Number is Null");
        }
    }
}