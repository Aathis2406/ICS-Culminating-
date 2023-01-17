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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Menu {
	
	JFrame frame = new JFrame();
	Container con;
	JPanel textPanel, inputPanel;
	JLabel textLabel, mainTitle1;
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
	JTextField jtf;
	JButton scoresB, instructionsB, levelsB, PlayB;
	
	
	JButton game = new JButton("Begin Game");
	
	Color green = new Color(43, 220, 20);

	
	public Menu() {

		frame.setSize(900,800);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Flappy Bird "); 
		frame.setResizable(false);
		
		ImageIcon Backg = new ImageIcon("logo.jpg");
		frame.setIconImage(Backg.getImage());
		
		frame.getContentPane().setBackground(Color.black);
		con = frame.getContentPane();
		
		frame.setTitle("Flappy Bird "); 
		
		mainTitle1 = new JLabel();
		mainTitle1.setText("Main Menu");
		mainTitle1.setFont(new Font("Times New Roman", Font.BOLD, 80));
		mainTitle1.setBounds(235,-190,650,650);
		mainTitle1.setForeground(green);
		
		inputPanel = new JPanel();
		inputPanel.setBounds(190, 550, 500, 50);
		inputPanel.setBackground(Color.black);
		inputPanel.setLayout(new GridLayout(1,2));
		
		scoresB = new JButton("Scores");
		scoresB.setBounds(280, 488, 300, 75);
		scoresB.setFocusable(false);
		scoresB.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		scoresB.setBackground(green);
		scoresB.setForeground(Color.white);
		
		levelsB = new JButton("Levels");
		levelsB.setBounds(280, 388, 300, 75);
		levelsB.setFocusable(false);
		levelsB.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		levelsB.setBackground(green);
		levelsB.setForeground(Color.white);
		levelsB.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        //open level selection page
		        SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		                new LevelPage();
		                frame.dispose();
		            }
		        });
		    }
		});


		
		PlayB = new JButton("Play");
		PlayB.setBounds(280, 193, 300, 75);
		PlayB.setFocusable(false);
		PlayB.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		PlayB.setBackground(green);
		PlayB.setForeground(Color.white);
		PlayB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        //open level selection page
		        SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		                new LevelPage();
		                frame.dispose();
		            }
		        });
		    }
		});


		
		instructionsB = new JButton("Instructions");
		instructionsB.setBounds(280, 290, 300, 75);
		instructionsB.setFocusable(false);
		instructionsB.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		instructionsB.setBackground(green);
		instructionsB.setForeground(Color.white);
	
		instructionsB.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // create new JFrame
		        JFrame instructionsFrame = new JFrame("Instructions");
		        instructionsFrame.setSize(1920, 1080 );
		        instructionsFrame.setVisible(true);
		        instructionsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        // center the frame
		        instructionsFrame.setLocationRelativeTo(null); 
		        JLabel instructionsLabel = new JLabel("How to Play");
		        instructionsLabel.setBounds(10, 10, 380, 50);
		        instructionsLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		        instructionsFrame.add(instructionsLabel);
		        JTextArea instructionsText = new JTextArea();
		        instructionsText.setBounds(10, 70, 380, 500);
		        instructionsText.setEditable(false);
		        instructionsText.setFont(new Font("Courier New ", Font.PLAIN, 18));
		        instructionsText.setText(""
		        		+ "\r\n"
		        		+ "\r\n"
		        		+"\r\n"
		        		+ "Flappy Bird is a simple but challenging game where you control a bird and try to navigate through a series of obstacles. "
		        		+ "\r\n"
		        		+ "The goal is to get the highest score possible by going as far as possible without hitting an obstacle. Here is how to play:\r\n"
		        		+ "\r\n"
		        		+ "1. Press the spacebar or click the screen to make the bird jump.\r\n"
		        		+ "2. Avoid hitting the obstacles by jumping over them. The obstacles will come in pairs with a gap in between, try to make the bird fly through the gap.\r\n"
		        		+ "3. Each time the bird passes through the gaps between the obstacles, the score increases by one point.\r\n"
		        		+ "4. The game gets progressively harder as you play.\r\n"
		        		+ "5. The game is over when the bird hits an obstacle, and you can start again by clicking the screen or pressing the spacebar.\r\n"
		        		+ "6. Remember that the key to success in this game is quick reaction and good timing. Keep practicing and you'll be soaring through the obstacles in no time!");
		        instructionsFrame.add(instructionsText);
		    }
		});

				

			
		frame.add(levelsB);
		frame.add(scoresB);
		frame.add(instructionsB);
		frame.add(PlayB);
		frame.add(mainTitle1);
		
	}
		
	
	private void dispose() {
			// TODO Auto-generated method stub
			
		}


		

			


	    

		public void runTitlePage() {
			// TODO Auto-generated method stub
			
		}
	

		
		
	}




