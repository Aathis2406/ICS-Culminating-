import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class LevelPage {
    JFrame frame = new JFrame();
    Container con;
    JPanel levelPanel;
    JLabel titleLabel;
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
    JButton level1B, level2B, level3B;

    Color green = new Color(43, 220, 20);

    public LevelPage() {
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setTitle("Flappy Bird - Levels");
        frame.setResizable(false);

        con = frame.getContentPane();

        titleLabel = new JLabel("Select a Level:");
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 36));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        levelPanel = new JPanel();
        levelPanel.setLayout(new GridLayout(3, 1));

        level1B = new JButton("Level 1");
        level1B.setFocusable(false);
        level1B.setFont(new Font("Times New Roman", Font.PLAIN, 26));
        level1B.setBackground(green);
        level1B.setForeground(Color.white);
        level1B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        FlappyBird fb = new FlappyBird();
                        frame.dispose();
                        new Thread(() -> {
                            while (true) {
                                fb.birdVelocity += 1;
                                fb.birdY += fb.birdVelocity;
                                if(fb.birdY > 850) {
                                    fb.gameOver = true;
                                }
                                fb.repaint();
                                try {
                                    Thread.sleep(10);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }).start();
                    }
                });
            }
        });

        level2B = new JButton("Level 2");
        level2B.setFocusable(false);
        level2B.setFont(new Font("Times New Roman", Font.PLAIN, 26));
        level2B.setBackground(green);
        level2B.setForeground(Color.white);
        level2B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        FlappyBird fb = new FlappyBird();
                        frame.dispose();
                        new Thread(() -> {
                            while (true) {
                                fb.birdVelocity += 1;
                                fb.birdY += fb.birdVelocity;
                                if(fb.birdY > 850) {
                                    fb.gameOver = true;
                                }
                                fb.repaint();
                                try {
                                    Thread.sleep(10);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }).start();
                    }
                });
            }
        });
        
        level3B = new JButton("Level 3");
        level3B.setFocusable(false);
        level3B.setFont(new Font("Times New Roman", Font.PLAIN, 26));
        level3B.setBackground(green);
        level3B.setForeground(Color.white);
        level3B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        FlappyBird fb = new FlappyBird();
                        frame.dispose();
                        new Thread(() -> {
                            while (true) {
                                fb.birdVelocity += 1;
                                fb.birdY += fb.birdVelocity;
                                if(fb.birdY > 850) {
                                    fb.gameOver = true;
                                }
                                fb.repaint();
                                try {
                                    Thread.sleep(10);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }).start();
                    }
                });
            }
        });
        
        levelPanel.add(level1B);
        levelPanel.add(level2B);
        levelPanel.add(level3B);

        con.add(titleLabel, BorderLayout.NORTH);
        con.add(levelPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new LevelPage();
    }
}