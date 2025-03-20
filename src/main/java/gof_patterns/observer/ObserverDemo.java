/*
 * MIT License
 *
 * Copyright (c) 2025 Symbiont Software
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
