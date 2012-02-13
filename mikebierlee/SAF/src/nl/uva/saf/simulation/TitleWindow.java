/* Copyright (c) 2012 Mike Bierlee
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package nl.uva.saf.simulation;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.KeyEvent;

public class TitleWindow extends JFrame {
	private static final long serialVersionUID = -3819287376567286263L;

	public TitleWindow() {
		setTitle("Super Awesome Fighters");
		setSize(new Dimension(854, 480));
		setPreferredSize(new Dimension(854, 480));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TitleWindow.class.getResource("/nl/uva/saf/simulation/title.png")));
		getContentPane().add(label, BorderLayout.CENTER);
		
		JButton btnStart = new JButton("Start");
		btnStart.setMnemonic(KeyEvent.VK_S);
		getContentPane().add(btnStart, BorderLayout.SOUTH);
	}
}
