import javax.swing.*;
import java.lang.*;
public class  Java10{
    public static void main(String[] args) {
        JFrame f;
        f = new JFrame();
        double half;
        String str1 = JOptionPane.showInputDialog(f,"Enter Input");
        double count = str1.length();
        half = Math.ceil(count/2);
        int half1 = (int)half;
        String substr1 = str1.substring(0, half1);
        String substr2 = str1.substring(half1);
        System.out.println(substr1.toUpperCase() + substr2.toLowerCase());
    }
}