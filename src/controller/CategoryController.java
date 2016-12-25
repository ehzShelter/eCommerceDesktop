/*
	ActionListener for category choosing
*/

	package controller;
	import java.awt.event.*;
	import javax.swing.*;
	import db.DBDataProvider;

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

			String selectedCategory = (String)this.categoryGUI.getSelectedItem();
			int total_items = DBDataProvider.getCategoryItem(selectedCategory);

			this.selected.setText("Selected Category: " + selectedCategory + "  Available Products: " + total_items);
			this.categoryPanel.revalidate();
			this.categoryPanel.repaint();
		}
	} 
