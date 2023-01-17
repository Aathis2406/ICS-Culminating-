import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlappyBird extends JPanel implements KeyListener {
    int birdY = 250;
    int birdVelocity = 0;
    boolean gameStarted = false;
    boolean gameOver = false;
    JButton replayButton;

    public FlappyBird() {
        JFrame frame = new JFrame();
        frame.setSize(1920, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.addKeyListener((KeyListener) this);
        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (gameOver) {
                    gameStarted = false;
                    gameOver = false;
                    birdY = 250;
                    birdVelocity = 0;
                }
            }
        });

        replayButton = new JButton("Replay");
        replayButton.setBounds(840, 600, 200, 50);
        replayButton.setVisible(false);
        replayButton.addActionListener(e -> {
            gameStarted = false;
            gameOver = false;
            birdY = 250;
            birdVelocity = 0;
            replayButton.setVisible(false);
        });
        replayButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (replayButton.isVisible()) {
                    gameStarted = false;
                    gameOver = false;
                    birdY = 250;
                    birdVelocity = 0;
                    replayButton.setVisible(false);
                }
            }
        });
        this.add(replayButton);


    }


    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 1920, 1080);
        g.setColor(Color.red);
        g.fillRect(0, 890, 1920, 150);
        g.setColor(Color.green);
        g.fillRect(50, birdY, 50, 50);
        g.setColor(Color.black);
        g.fillRect(200, 0, 50, 300);
        g.fillRect(200, 500, 50, 300);
        
        //Pipe 2
        g.setColor(Color.black);
        g.fillRect(400, 200, 50, 300);
        g.fillRect(400, 700, 50, 300);
        
        if (gameOver) {
            g.setColor(Color.red);
            Font arcadeFont = new Font("Arcade", Font.BOLD, 72);
            g.setFont(arcadeFont);
            g.drawString("Game Over", 690, 350);
            g.drawString("Click To Replay", 620, 750);
            

        }
    }


    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE && !gameOver) {
            if (!gameStarted) {
                gameStarted = true;
            }
            birdVelocity = -10;
        }
    }
    

    


    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        FlappyBird fb = new FlappyBird();
        while (true) {
            fb.birdVelocity += 1;
            fb.birdY += fb.birdVelocity;
        if(fb.birdY > 850) {
            fb.gameOver = true;
        }
        
        fb.repaint();
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {}
         
        
    }
}
}
