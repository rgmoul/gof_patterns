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

package gof_patterns.proxy;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;

import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * A window for viewing cartoon characters, demonstrates the use of a
 * proxy. - Client in the Proxy pattern.
 * <p>
 *  The contents of this list are proxies to the cartoon characters, when selected,
 * a real cartoon character is created and associated with the proxy.
 */
public class ProxyDemoApp extends JFrame {
    @Serial
    private static final long serialVersionUID = -2857698500954380844L;

    /**
     * A window for viewing cartoon characters.
     */
    public ProxyDemoApp() {
        super("Cartoon Characters");
        Container content = getContentPane();

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        content.setLayout(gbl);
        final DefaultListModel<CartoonCharacter> listModel = new DefaultListModel<>();
        final JList<CartoonCharacter> list = new JList<>(listModel);
        JButton btn = new JButton("Get Characters");
        final JLabel  imageLbl = new JLabel("[image]", SwingConstants.CENTER);
        imageLbl.setSize(300, 320);

        // add the list
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(2, 2, 2, 2);
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        content.add(new JScrollPane(list), gbc);

        // add the button
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weightx = 0.0;
        gbc.weighty = 0.0;
        content.add(btn, gbc);

        // add the image label
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        content.add(imageLbl, gbc);

        // fix the width of the image area
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.0;
        gbc.weighty = 0.0;
        content.add(Box.createHorizontalStrut(395) , gbc);

        // fix the size of the window
        setSize(450, 320);
        setResizable(false);

        // add a listener to the button
        btn.addActionListener(new ActionListener() {
            /**
             * Retrieves the list of characters.
             *
             * @param event the action event
             */
            @Override
            public void actionPerformed(ActionEvent event) {
                CartoonCharacterDb db = CartoonCharacterDb.getDb();
                CartoonCharacter[] characters = db.getCharacters();
                listModel.clear();
                for (CartoonCharacter character : characters) {
                    listModel.addElement(character) ;
                }
            }
        });

        // add a listener for list selections
        list.addListSelectionListener(new ListSelectionListener(){
            /**
             * Display the selected characters image in the image label.
             *
             * @param event the selection event - not used
             */
            @Override
            public void valueChanged(ListSelectionEvent event) {
                CartoonCharacter cc = list.getSelectedValue();

                if (cc == null) {
                    imageLbl.setIcon(null);
                    imageLbl.setText("[image]");
                } else {
                    Image img = cc.image();
                    ImageIcon icon = new ImageIcon(img);
                    imageLbl.setIcon(icon);
                    imageLbl.setText(null);
                }
            }
        });
    }

    /**
     * Creates the ProxyDemo window and makes it visible.
     *
     * @param args (not used)
     */
    public static void main(String[] args) {
        ProxyDemoApp demo = new ProxyDemoApp();
        demo.setVisible(true);
    }
}
