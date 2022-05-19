package Stopwatch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// implements ActionListener as buttons are used
public class Stopwatch implements ActionListener {

	JFrame frame = new JFrame();
	JButton startButton = new JButton("START");

	JButton resetButton = new JButton("RESET");
	JLabel timeLabe = new JLabel();

	int elapsedTime = 0;
	int milliseconds = 0;
	int seconds = 0;
	int minutes = 0;
	int hours = 0;

	// if the stopwatch is started, started is true, and false otherwise
	boolean started = false;

	// format time values
	String secondsString = String.format("%02d", seconds);
	String minutesString = String.format("%02d", minutes);
	String hoursString = String.format("%02d", hours);

	public Stopwatch() {
		frame.setTitle("Stopwatch");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null); // it will be created at the middle of the screen

		frame.setVisible(true);
	}

	void start() {

	}

	void stop() {

	}

	void reset() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
