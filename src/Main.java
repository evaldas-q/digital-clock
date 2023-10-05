import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a JFrame (window) to display the digital clock
        JFrame frame = new JFrame("Digital Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
        frame.setSize(300, 150); // Set the size of the window
        frame.setLayout(new BorderLayout()); // Use BorderLayout for arranging components

        // Create JLabels to display time, day, and date
        JLabel timeLabel = new JLabel("", SwingConstants.CENTER);
        JLabel dayLabel = new JLabel("", SwingConstants.CENTER);
        JLabel dateLabel = new JLabel("", SwingConstants.CENTER);

        // Add the labels to the JFrame
        frame.add(timeLabel, BorderLayout.NORTH);
        frame.add(dayLabel, BorderLayout.CENTER);
        frame.add(dateLabel, BorderLayout.SOUTH);

        frame.setVisible(true); // Make the window visible

        // Update the clock every second using a Timer
        Timer timer = new Timer(1000, e -> {
            // Create date formatters for time, day, and date
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
            SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");

            // Get the current date and time
            Date now = new Date();

            // Update the JLabels with the current time, day, and date
            timeLabel.setText(timeFormat.format(now));
            dayLabel.setText(dayFormat.format(now));
            dateLabel.setText(dateFormat.format(now));
        });

        timer.start(); // Start the timer to update the clock
    }
}
