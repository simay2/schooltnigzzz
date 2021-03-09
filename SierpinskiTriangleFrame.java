package eddu.smg;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255,orders=0;

	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern

	public SierpinskiTriangleFrame() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		
		JButton plusButton = new JButton("+");
		panel.add(plusButton);
		
		plusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				orders++;
				trianglePanel.setOrder(orders);
			}
		});
		JButton minusButton = new JButton("-");
		panel.add(minusButton);
		
		minusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				orders--;
				if(orders<0) {
					orders=0;
				}
				trianglePanel.setOrder(orders);
			}
		});
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);

	}

}