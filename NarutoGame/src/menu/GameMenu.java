package menu;
import java.awt.*;
import javax.swing.*;

public class GameMenu {

	
	public static void main(String[] args) {
		
		System.out.println("test");
		JFrame frame = new JFrame("Simple GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER); 
		textLabel.setPreferredSize(new Dimension(300, 100));
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		
		
	}

}
