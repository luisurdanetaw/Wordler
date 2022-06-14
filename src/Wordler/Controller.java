package Wordler;

import java.awt.EventQueue;

public class Controller {
	final static String DIRECTORY = System.getProperty("user.dir")+"/";
	static Wordler_GUI window = new Wordler_GUI();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window.frame.dispose();
					window = new Wordler_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
