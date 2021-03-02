import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.io.*;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

import java.awt.GridLayout;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Output extends JFrame {

	private JPanel contentPane;
	public PrintStream standardOut;
	public JTextArea textArea = new JTextArea();
	
	
	/**
	 * Create the frame.
	 */

		 
	
	public Output() {
		super("Hospitalisation and Death results");
		
		textArea = new JTextArea(50, 10);
		textArea.setEditable(false);
		PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		
		//reference to standard output stream
		standardOut = System.out;
		
		//reassigns standard output stream and error output stream
		System.setOut(printStream);
		System.setErr(printStream);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		

		contentPane.add(textArea);
		
		
	}
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Output frame = new Output();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

}
