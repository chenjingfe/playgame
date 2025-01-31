package Window;

import javax.swing.*;
import java.awt.event.*;

public class MyJframe extends JFrame implements KeyListener {
    JButton jtb1 = new JButton();

    public MyJframe() {
        this.setTitle("MyJframe");
        this.setSize(680, 680);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);


        this.addKeyListener(this);

        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //System.out.println("keyTyped");

    }

    @Override
    public void keyPressed(KeyEvent e) {
       int key = e.getKeyCode();
       if (key=='A'){
           System.out.println("keyPressed");
       }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //System.out.println("keyReleased");

    }
}