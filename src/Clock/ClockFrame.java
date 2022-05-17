package Clock;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockFrame extends JFrame {

	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	String time;
	String day;

	ClockFrame() {

		// basic JFrame initialisation
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Java GUI Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		// Formatting for time
		timeFormat = new SimpleDateFormat("hh:mm:ss a");

		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		// Background color set to look cool
		timeLabel.setForeground(Color.green);
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);

		dayFormat = new SimpleDateFormat("EEEE, MM/dd, yyyy");

		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));

		// Add all the components together
		this.add(timeLabel);
		this.add(dayLabel);
		this.setVisible(true);
		setTime();
	}

	public void setTime() {
		while (true) {
			// update every 1000ms
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);

			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
