import javax.swing.JOptionPane;

public class second {
    public static void main(String[] args) {
        
        String inputDialog = JOptionPane.showInputDialog("Write a number: ");
        int number = Integer.parseInt(inputDialog);        
        
        if(number % 2 == 0){
            System.out.println(" This is a odd number  ");
        }
        else{
            System.out.println("This is a even number");
        }
    }
}
