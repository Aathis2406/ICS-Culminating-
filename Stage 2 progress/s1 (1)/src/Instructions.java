import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Instructions {
		
		JFrame frame = new JFrame();
		Container con;
		JPanel textPanel, inputPanel;
		JLabel instructionsLabel;
		JButton game = new JButton("Begin Game");
		Color green = new Color(43, 220, 20);

		public Instructions() {

			frame.setSize(900,800);
			frame.setLayout(null);
			frame.setVisible(true);
			frame.setTitle("Flappy Bird "); 
			frame.setResizable(false);
			
			instructionsLabel = new JLabel("Instructions: Press the spacebar to jump.");
			instructionsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			instructionsLabel.setBounds(100,100,500,50);
			instructionsLabel.setForeground(Color.white);
			instructionsLabel.setHorizontalAlignment(JLabel.CENTER);
			frame.add(instructionsLabel);
		}

		public static void runInstructions() {
			// TODO Auto-generated method stub() {
			// TODO Auto-generated method stub
			
		}
	}

	
	
	
	
