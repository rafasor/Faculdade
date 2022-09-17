import javax.swing.JOptionPane;

public class third {
    public static void main(String[] args) {
        String inputDialog = JOptionPane.showInputDialog("Write a number: ");
        int number = Integer.parseInt(inputDialog); 
       
        if(number > 0 && number % 2 == 0){
            System.out.println("square root:  " + Math.sqrt(number));
        }
        else{
            System.out.println("It is not a positive number or the square of a number");
        }
    }
}
