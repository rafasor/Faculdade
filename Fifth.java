import javax.swing.JOptionPane;

public class Fifth {
    public static void main(String[] args) {
        String inputDialog = JOptionPane.showInputDialog("Write a number: ");
        int number = Integer.parseInt(inputDialog); 
        
        String secondInputDialog = JOptionPane.showInputDialog("Write a number: ");
        int secondNumber = Integer.parseInt(secondInputDialog);       
        
        if(number > secondNumber){
            Math.pow(number, 2);
            System.out.println("Smaller number square : " + Math.pow(number, 2));
            System.out.println("Largest number square Root : " + Math.sqrt(secondNumber));
        }
        else{
            System.out.println("Smaller number square : " + Math.pow(secondNumber, 2));
            System.out.println("Largest number square Root : S" + Math.sqrt(number));
        }
    }
}
