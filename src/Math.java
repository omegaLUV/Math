import javax.swing.*;
import java.awt.*;

public class Math {
    public static void main(String[] args) {
        JFrame okno = new JFrame("HlavniOkno");
        okno.setSize(640,520);
        JTextField tf = new JTextField();
        okno.setDefaultCloseOperation(3);
        okno.add(tf, BorderLayout.NORTH);
        okno.setVisible(true);
    }
}