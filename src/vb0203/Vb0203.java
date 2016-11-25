package vb0203;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Vb0203 extends JFrame {

    public static void main(String[] args) {
// Maak een frame
        JFrame frame = new Vb0203();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Eerste applicatie");
        JPanel paneel = new Paneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);

    }
}

class Paneel extends JPanel {

    private JButton knopyes;
    private JButton knopno;
    private JButton knopmaybe;
    private JTextField tekstvak;

    class KnopHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("yes!");
        }
    }

    class KnopHandlerno implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("no!");
        }
    }

    class KnopHandlermaybe implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("maybe!");
        }
    }

    public Paneel() {
        knopyes = new JButton("yes");
        KnopHandler kh = new KnopHandler();
        knopyes.addActionListener((ActionListener) kh);
        knopno = new JButton("no");
        KnopHandlerno khno = new KnopHandlerno();
        knopno.addActionListener((ActionListener) khno);
        knopmaybe = new JButton("maybe");
        KnopHandlermaybe khmaybe = new KnopHandlermaybe();
        knopmaybe.addActionListener((ActionListener) khmaybe);

        tekstvak = new JTextField(10);
        add(knopyes);
        add(knopno);
        add(knopmaybe);
        add(tekstvak);
    }
}
