package createwindow;

import javax.swing.JFrame;

public class window {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setSize(300, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Examples Frame Windows");
        jFrame.setVisible(true);
    }
}
