import javax.swing.JOptionPane;

public class Sixth {
    public static void main(String[] args) {
        String inputDialog = JOptionPane.showInputDialog("Write your salary: ");
        int salary = Integer.parseInt(inputDialog);        
        
        
        String secondInputDialog = JOptionPane.showInputDialog("Write the value: ");
        int credit = Integer.parseInt(secondInputDialog);

        float calc = (salary * 30) / 100; 

        if(credit >= calc){
            System.out.println(" Is not aceptable ");
        }
        else{
            System.out.println("Congratulations you are the conditions");
        }        
    }
};