package gof_patterns.observer;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 * Application that provides an observer to display a captured image.
 */
public class ObserverDemo {
	/**
	 * Display the image.
	 * @param imagePath file pat to the image
	 */
    public static void showImageAndWait(String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        JLabel label = new JLabel(icon);

        JDialog dialog = new JDialog();
        dialog.addWindowListener(new WindowAdapter() {
        	public void	windowClosing(WindowEvent e) {
        	    System.exit(0);			
            }
        });

        dialog.setTitle("Image Viewer");
        dialog.add(label);
        dialog.pack();
        dialog.setModal(true); // Blocks execution until closed
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    /**
     * Entry point.
     * 
     * @param args (not used)
     */
    public static void main(String[] args) {
        Camera c = new Camera();
        c.addObserver(u -> SwingUtilities.invokeLater(() -> showImageAndWait(u.getFile())));
        c.captureImage();
    }

}
