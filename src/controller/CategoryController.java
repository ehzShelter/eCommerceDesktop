/*
	ActionListener for category choosing
*/

	package controller;
	import java.awt.event.*;
	import javax.swing.*;

	public class CategoryController implements ActionListener{
		JComboBox<String> categoryGUI;
		JPanel categoryPanel;
		JLabel selected;
		public CategoryController(JComboBox<String> categoryGUI,JPanel categoryPanel,JLabel selected){
			this.categoryGUI = categoryGUI;
			this.categoryPanel = categoryPanel;
			this.selected = selected;
		}

		public void actionPerformed(ActionEvent e){
			this.selected.setText("Selected Category: " +(String)this.categoryGUI.getSelectedItem() + "  Available Products: 0 ");
			this.categoryPanel.revalidate();
			this.categoryPanel.repaint();
		}
	} 
