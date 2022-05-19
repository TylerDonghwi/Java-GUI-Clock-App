package Stopwatch;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

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

	// Timer every 10 milliseconds
	Timer timer = new Timer(10, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			elapsedTime += 10;
			// calculate time display
			hours = elapsedTime / 3_600_000;
			minutes = elapsedTime / 60_000 % 60;
			seconds = elapsedTime / 1_000 % 60;
			milliseconds = elapsedTime / 10 % 100;

			// format the time display and set it
			secondsString = String.format("%02d", seconds);
			minutesString = String.format("%02d", minutes);
			hoursString = String.format("%02d", hours);
			millisecondsString = String.format("%02d", milliseconds * 10);
			timeLabel.setText(hoursString + ":" + minutesString + ":" + secondsString + ":" + millisecondsString);

		}
	});

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
		startButton.setBounds(80, 150, 110, 50);
		startButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		startButton.setFocusable(false);
		startButton.addActionListener(this);
		resetButton.setBounds(190, 150, 110, 50);
		resetButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);

		// Add the components
		frame.add(timeLabel);
		frame.add(startButton);
		frame.add(resetButton);
		frame.setVisible(true);
	}

	void start() {
		started = true;
		timer.start();
	}

	void stop() {
		started = false;
	}

	void reset() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startButton) {
			start();
		}
	}
}
