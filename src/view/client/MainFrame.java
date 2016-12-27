/*
   This is the main frame of the client side application
   product selection will be done here
   */
package view.client;
<<<<<<< HEAD
import java.util.Vector;
=======
import view.admin.AdminPanel;
import view.admin.AdminPanelActionListener;
>>>>>>> 632eb2a29b93565d33d537bbe9bb4f272038dd18
import javax.swing.*;
import controller.*;
import view.signUpForm.SignUp;
import view.signInForm.SignIn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import db.DBDataProvider;

public class MainFrame{
<<<<<<< HEAD
    JFrame frame;
    JComboBox<String> productCombo;
    JPanel categoryPanel;

    JPanel productPanel;
    JTable productTable;
    
    JLabel heading;
    JLabel label;
    JLabel selected;
    JButton login;
    JButton register;
    JButton adminBtn;
=======
    public JFrame frame;
    private  JComboBox<String> productCombo;
    private JPanel categoryPanel;
    private JLabel heading;
    private JLabel label;
    private JLabel selected;
    private JButton login;
    private JButton register;
    private JButton adminBtn;
>>>>>>> 632eb2a29b93565d33d537bbe9bb4f272038dd18

    public MainFrame(){
        this.frame = new JFrame("E-Commerce Desktop Application");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setBounds(300, 100, 750, 500);
        this.frame.setLayout(null);

        //JPanel for product category
        this.categoryPanel = new JPanel();
        this.heading = new JLabel("  Choose any product category from below and start shopping  ",JLabel.CENTER);
        this.label = new JLabel("Product Category: ",JLabel.CENTER);
        this.selected = new JLabel("Selected Category: --  Available Products: -- ",JLabel.CENTER);
        this.productCombo = new JComboBox<String>();
        this.productCombo.setBounds(20,10,700,200);

        //login/signup buttons
        this.login = new JButton("Login");
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        this.register = new JButton("Sign Up");
        register.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        //admin panel entry point (for test now)
        this.adminBtn = new JButton("Admin");
        adminBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        //add category into combo box
        this.productCombo.addItem(" -- ");
        this.productCombo.addItem("Electronics");
        this.productCombo.addItem("Books");
        this.productCombo.addItem("Cars");
        this.productCombo.addItem("Fashion");
        this.productCombo.addItem("Sports");
        this.productCombo.addItem("Movies");
        this.productCombo.addItem("Music");

        this.categoryPanel.setBounds(150,10,400,100);
        this.categoryPanel.add(this.adminBtn);
        this.categoryPanel.add(this.login);
        this.categoryPanel.add(this.register);
        this.categoryPanel.add(heading);
        this.categoryPanel.add(label);
        this.categoryPanel.add(this.productCombo);
        this.categoryPanel.add(this.selected);

        //registering event handler of the JComboBox
        CategoryController categoryController = new CategoryController(this.productCombo,this.categoryPanel,this.selected);
        this.productCombo.addActionListener(categoryController);

        //show all product data------------------
        this.productPanel = new JPanel();
        this.productPanel.setBounds(10,150,700,300);
        this.productPanel.setLayout(null);

        // Vector<String> columnNames = new Vector<String>();
        // columnNames.add("Name");
        // columnNames.add("Category");
        // columnNames.add("Price");
        // columnNames.add("Quantity");
        // Vector<Vector<String>> data = new Vector<Vector<String>>();

        // for(int i=0;i<100;i++){
        //     Vector<String> row = new Vector<String>();
        //     row.add("iPhone");
        //     row.add("Electronics");
        //     row.add("100");
        //     row.add("1000");
        //     data.add(row);
        // }

        this.productTable = DBDataProvider.getAllProduct();
        JScrollPane sp = new JScrollPane(this.productTable);
        sp.setBounds(0, 0, 700, 300);

        this.productPanel.add(sp);

        this.frame.add(this.categoryPanel);
        this.frame.add(this.productPanel);
        this.frame.setVisible(true);
        this.frame.repaint();
    }

    private void registerBtnActionPerformed(ActionEvent evt) {
        SignUp sampleSignUp = new SignUp("Sign Up Form");
    }

    private void loginBtnActionPerformed(ActionEvent evt) {
        SignIn sampleSignIn = new SignIn("Sign In Form");
    }

    //method for admin panel entry (for test now)
    private void adminBtnActionPerformed(ActionEvent evt) {
        AdminPanel admin = new AdminPanel();
    }


}
