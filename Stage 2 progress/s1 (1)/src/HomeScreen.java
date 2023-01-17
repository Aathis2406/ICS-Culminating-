import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * A class to display the home screen
 * Resources used:
 *  	https://chortle.ccsu.edu/java5/Notes/chap60/ch60_1.html (CHAPTER 60 � Swing JTextFields and JLabels)
 *
 */
public class HomeScreen {
	public static void main(String[] args) {
		initialization();
		
		MyFrame frame = new MyFrame();
		frame.setVisible(true);

	}

	/**
	 * This method checks if the user name and password files are already created, 
	 * if they aren't, then create them
	 *
	 */
	public static void initialization() {
		try {
			File users = new File("User Names.txt");
			File passes = new File("Passwords.txt");
			String classDir = "classroom";
			File file = new File(classDir);

			if (users.createNewFile()) {
				System.out.println("File Created");
			} else {
				System.out.println("File Already Created");

			}

			if (passes.createNewFile()) {
				System.out.println("File Created");
			} else {
				System.out.println("File Already Created");

			}

			if (!file.exists()) {
				file.mkdirs();
				System.out.println("Directory classroom created");
			} else {
				System.out.println("Directory already exists");

			}

		}

		catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}



/**
 * A parallel class MyFrame
 * 
 */
class MyFrame extends JFrame implements ActionListener // adds JLabels to home screen + buttons
{
	private JPanel contentPane;
	private JLabel schoolTitle;
	private JLabel txtAuthor;
	private JLabel txtCourse;
	private JLabel txtTeacher;
	private JLabel lblVersion;
	private JButton btnLogin;

/**
 * Constructor
 */
	public MyFrame() {
		setBackground(Color.BLACK);
		setForeground(Color.BLACK);
		setTitle("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 500);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		schoolTitle = new JLabel("WELCOME");
		schoolTitle.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 37));
		schoolTitle.setBounds(350, 100, 1190, 60);
		contentPane.add(schoolTitle);

		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Rockwell", Font.PLAIN, 17));
		btnLogin.setBounds(350, 170, 185, 75);
		contentPane.add(btnLogin);


		





		lblVersion = new JLabel("Flappy Bird ");
		lblVersion.setBounds(440, 10, 900, 15);
		contentPane.add(lblVersion);
		
		btnLogin.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLogin) {
			LoginPage loginPage = new LoginPage();
			loginPage.loadLoginPage();
			this.dispose();
			
		}
		
	}

}

