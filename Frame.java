import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Frame {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Frame");
		frame.setSize(300,400);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}