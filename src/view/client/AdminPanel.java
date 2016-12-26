/*
	this is the admin panel
*/

	package view.client;
	import javax.swing.*;
	import java.awt.event.ActionEvent;
	import java.awt.*;
	import java.awt.event.ActionListener;

	public class AdminPanel{
		JPanel adminPanel;
		JLabel heading;
		JLabel sub_heading;
		JLabel username;
		JLabel name;
		JLabel category;
		JLabel price;
		JLabel quantity;
		JTextField nameField;
		JComboBox<String> productCategory;
		JTextField priceField;
		JTextField quantityField;

		public AdminPanel(){
			this.adminPanel = new JPanel();
			this.sub_heading = new JLabel("Create New Products",JLabel.CENTER);
			this.username = new JLabel("Abrar" + "'s ");
			this.heading = new JLabel("ADMIN PANEL",JLabel.CENTER);

			
			//labels for input
			this.name = new JLabel("Product Name: ");
			this.category = new JLabel("Category: ");
			this.price = new JLabel("Price: ");
			this.quantity = new JLabel("Quantity: ");
			//input fields
			this.nameField = new JTextField();
			this.priceField = new JTextField();
			this.quantityField = new JTextField();

			this.productCategory = new JComboBox<String>();
			//add category into combo box
        	this.productCategory.addItem(" -- ");
        	this.productCategory.addItem("Electronics");
        	this.productCategory.addItem("Books");
        	this.productCategory.addItem("Cars");
        	this.productCategory.addItem("Fashion");
        	this.productCategory.addItem("Sports");
        	this.productCategory.addItem("Movies");
        	this.productCategory.addItem("Music");

			this.adminPanel.setBounds(150,200,400,200);
			this.adminPanel.add(this.heading);
			this.adminPanel.add(this.sub_heading);

			this.adminPanel.add(this.name);
			this.adminPanel.add(this.nameField);
			this.adminPanel.add(this.category);
			this.adminPanel.add(this.productCategory);
			this.adminPanel.add(this.price);
			this.adminPanel.add(this.priceField);
			this.adminPanel.add(this.quantity);
			this.adminPanel.add(this.quantityField);			
		} 
		public JPanel getAdminPanel(){
			return this.adminPanel;
		}


	}