import javax.swing.*;
public class MiJFrame {
		
		 public static void main(String[] args) {
		 JFrame frame = new JFrame("MiJFrame");
		
		 JButton jbtOK = new JButton("OK");

		 frame.add(jbtOK);
		 frame.setSize(400, 300);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		 frame.setLocationRelativeTo(null);

		 }
}

