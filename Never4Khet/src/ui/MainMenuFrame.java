package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;

public class MainMenuFrame extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuFrame frame = new MainMenuFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainMenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel WelcomePanel = new JPanel();
		WelcomePanel.setBorder(null);
		WelcomePanel.setBounds(264, 11, 350, 67);
		contentPane.add(WelcomePanel);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setFont(new Font("Comic Sans MS", Font.PLAIN, 38));
		WelcomePanel.add(lblWelcome);
		
		JPanel InstructionPanel = new JPanel();
		InstructionPanel.setBounds(73, 140, 731, 81);
		contentPane.add(InstructionPanel);
		InstructionPanel.setLayout(null);
		
		JLabel lblInstructions = new JLabel("Welcome to my game. I will be challenging you to a game of Khet. ");
		lblInstructions.setBounds(64, 5, 602, 28);
		lblInstructions.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		InstructionPanel.add(lblInstructions);
		
		JLabel lblAreYouReady = new JLabel("Are you ready for the Challenge?????");
		lblAreYouReady.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblAreYouReady.setBounds(226, 38, 284, 32);
		InstructionPanel.add(lblAreYouReady);
		
		JPanel ButtonPanel = new JPanel();
		ButtonPanel.setBounds(73, 294, 731, 155);
		contentPane.add(ButtonPanel);
		ButtonPanel.setLayout(null);
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("FUCK YEAH!!!");
			}
		});
		btnPlay.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnPlay.setBounds(56, 38, 144, 81);
		ButtonPanel.add(btnPlay);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UIMain.getInstace().terminate();
			}
		});
		btnQuit.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnQuit.setBounds(536, 38, 144, 81);
		ButtonPanel.add(btnQuit);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
