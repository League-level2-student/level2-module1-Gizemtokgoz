package intro_to_array_lists;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	Frame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> names = new ArrayList<String>();

	public void run() {
		// Create a GUI with two buttons. One button reads "Add Name" and the other
		// button reads "View Names".
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("add name");
		button2.setText("view names");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button1.setPreferredSize(new Dimension(200, 50));
		button2.setPreferredSize(new Dimension(200, 50));
		frame.pack();
		// When the add name button is clicked, display an input dialog that asks the
		// user to enter a name. Add
		// that name to an ArrayList. When the "View Names" button is clicked, display a
		// message dialog that displays
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		String name;

		if (button1 == buttonPressed) {
			name = JOptionPane.showInputDialog("enter a name");
			names.add(name);
		}
		
		if (button2 == buttonPressed) {
			String guests = "";
			for (int j = 1; j < names.size(); j++) {
				guests += "guest # " + j + " " + names.get(j) + "\n";
			}
			JOptionPane.showMessageDialog(null, guests);
		}
	}
}
