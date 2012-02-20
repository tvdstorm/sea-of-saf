package nl.tamasja.uva.saf;

import javax.swing.JFrame;

public class SAFMain extends JFrame {

	private static final long serialVersionUID = 1L;

	public SAFMain() {

        add(new Game());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1300, 500);
        setResizable(true);
        setLocationRelativeTo(null);
        setTitle("Super Awesome Fighters");
        setVisible(true);
    }

    public static void main(String[] args) {
        new SAFMain();
    }
}