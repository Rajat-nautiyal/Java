import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("enter your name");
        // JOptionPane.showMessageDialog(null,name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        // JOptionPane.showMessageDialog(null,age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
        // JOptionPane.showMessageDialog(null,height);

        if(age<=10){
            JOptionPane.showMessageDialog(null,name + ", your height is "+ height);
        }else if(10<age && age<=30){ // 10<age<30 doesn't work in java
            JOptionPane.showMessageDialog(null,name + "  ,men your height is "+ height);
        }else if (age>30){
            JOptionPane.showMessageDialog(null,name + "you're too old now" + height);
        }
    }
}
