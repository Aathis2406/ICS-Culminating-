import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Title implements ActionListener {
    JFrame frame = new JFrame();
    JButton next = new JButton("Start");
    Color white = new Color(255,255,255);
    JLabel title = new JLabel("Flappy Bird");
    Color green = new Color(0, 0, 255);
    Image image;

    public Title() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setTitle("Flappy Bird");
        frame.setResizable(false);

        try {
            URL url = new URL("https://wallpapercave.com/wp/wp6957163.png");
            image = ImageIO.read(url);
            JLabel label = new JLabel(new ImageIcon(image));
            frame.add(label, BorderLayout.CENTER);
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.setSize(image.getWidth(null), image.getHeight(null));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        next.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        next.addActionListener(this);
        next.setBackground(green);

        title.setFont(new Font("Times New Roman", Font.BOLD, 80));
        title.setForeground(green);

        frame.add(next, BorderLayout.SOUTH);
        frame.add(title, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            Menu menuPage = new Menu();
            frame.dispose();
        }
    }

	public void runTitlePage() {
		// TODO Auto-generated method stub
		
	}
}
