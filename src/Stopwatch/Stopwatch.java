package Stopwatch;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// implements ActionListener as buttons are used
public class Stopwatch implements ActionListener {

	JFrame frame = new JFrame();
	JButton startButton = new JButton("START");

	JButton resetButton = new JButton("RESET");
	JLabel timeLabel = new JLabel();

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
	String millisecondsString = String.format("%02d", milliseconds * 10);

	// constructor
	public Stopwatch() {

		// initialise JFrame
		frame.setTitle("Stopwatch");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null); // it will be created at the middle of the screen

		// label for the time
		timeLabel.setText(hoursString + ":" + minutesString + ":" + secondsString + ":" + millisecondsString);
		timeLabel.setBounds(80, 50, 220, 100);
		timeLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
		timeLabel.setBorder(BorderFactory.createBevelBorder(1));
		timeLabel.setOpaque(true);
		timeLabel.setHorizontalAlignment(JTextField.CENTER);

		// set buttons
		startButton.setBounds(80, 150, 100, 50);
		resetButton.setBounds(200, 150, 100, 50);

		// Add the components
		frame.add(timeLabel);
		frame.add(startButton);
		frame.add(resetButton);
		frame.setVisible(true);
	}

	void start() {
		started = true;
	}

	void stop() {
		started = false;
	}

	void reset() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
