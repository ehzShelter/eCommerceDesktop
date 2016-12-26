/*
   This is the main frame of the client side application
   product selection will be done here
   */

package view.client;
import javax.swing.*;
import controller.*;
import view.signUpForm.SignUp;
import view.signInForm.SignIn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class MainFrame{
    JPanel adminPanel;
    JFrame frame;
    JComboBox<String> productCombo;
    JPanel categoryPanel;
    JLabel heading;
    JLabel label;
    JLabel selected;
    JButton login;
    JButton register;
    JButton adminBtn;

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
        this.adminBtn = new JButton("ADMIN");
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

        this.categoryPanel.setBounds(150,10,400,200);
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

        this.frame.add(categoryPanel);
        this.frame.setVisible(true);
    }

    private void registerBtnActionPerformed(ActionEvent evt) {

        SignUp sampleSignUp = new SignUp("Sign Up Form");
    }

    private void loginBtnActionPerformed(ActionEvent evt) {

        SignIn sampleSignIn = new SignIn("Sign In Form");
    }

    //method for admin panel entry (for test now)
    private void adminBtnActionPerformed(ActionEvent evt) {
        this.categoryPanel.setVisible(false);
        AdminPanel admin = new AdminPanel();
        this.adminPanel = admin.getAdminPanel();
        this.frame.add(this.adminPanel);
        this.frame.revalidate();
        this.frame.repaint();

    }


}
