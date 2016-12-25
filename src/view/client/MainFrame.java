/*
	This is the main frame of the client side application
	All the 
*/

	package view.client;
	import javax.swing.*;
	import controller.*;


	public class MainFrame{
		JFrame frame;
		JComboBox<String> productCombo;
		JPanel categoryPanel;
		JLabel heading;
		JLabel label;
		JLabel selected;

		public MainFrame(){
			this.frame = new JFrame("E-Commerce Desktop Application");
			this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.frame.setBounds(300, 100, 800, 500);
			this.frame.setLayout(null);

			//JPanel for product category
			this.categoryPanel = new JPanel();
			this.heading = new JLabel("  Choose any product category from below and start shopping  ",JLabel.CENTER);
			this.label = new JLabel("Product Category: ",JLabel.CENTER); 
			this.selected = new JLabel("Selected Category: --  Available Products: -- ",JLabel.CENTER); 
			this.productCombo = new JComboBox<String>();
			this.productCombo.setBounds(20,10,700,200);

			//add category into combo box
			this.productCombo.addItem(" -- ");
			this.productCombo.addItem("Electronics");
			this.productCombo.addItem("Books");
			this.productCombo.addItem("Cars");
			this.productCombo.addItem("Fashion");
			this.productCombo.addItem("Sports");
			this.productCombo.addItem("Movies");
			this.productCombo.addItem("Music");

			this.categoryPanel.setBounds(150,10,400,200);
			this.categoryPanel.add(heading);
			this.categoryPanel.add(label);
			this.categoryPanel.add(this.productCombo);
			this.categoryPanel.add(this.selected);

			//registering event handler of the JComboBox
			CategoryController categoryController = new CategoryController(this.productCombo,this.categoryPanel,this.selected);
			this.productCombo.addActionListener(categoryController);

			this.frame.add(categoryPanel);
			this.frame.setVisible(true);
		}

		void setSelectedText(){

		}

	}