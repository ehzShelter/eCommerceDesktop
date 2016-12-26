package view.client;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AdminPanel extends JFrame {

    private JLabel LabelAdminPanel;
    private JButton adminCancelBtn;
    private JButton adminOkBtn;
    private JLabel createLabel;
    private JLabel productCategory;
    private JComboBox<String> productCategoryCombo;
    private JLabel productName;
    private JTextField productNameField;
    private JLabel productPrice;
    private JTextField productPriceField;
    private JLabel quantity;
    private JTextField quantityField;

    public AdminPanel() {

        LabelAdminPanel = new JLabel();
        createLabel = new JLabel();
        productName = new JLabel();
        productCategory = new JLabel();
        productPrice = new JLabel();
        quantity = new JLabel();
        adminOkBtn = new JButton();
        adminCancelBtn = new JButton();
        productNameField = new JTextField();
        productPriceField = new JTextField();
        quantityField = new JTextField();
        productCategoryCombo = new JComboBox<String>();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        LabelAdminPanel.setText("Admin Panel");

        createLabel.setText("Create New Product");

        productName.setText("Product Name");

        productCategory.setText("Product Category");

        productPrice.setText("Product Price");

        quantity.setText("Quantity");

        adminOkBtn.setText("OK");

        adminCancelBtn.setText("Cancel");

        // productCategoryCombo.setModel(new DefaultComboBoxModel<>(new String[] { "--", "Electronics", "Books", "Cars" }));


        this.productCategoryCombo.addItem(" -- ");
        this.productCategoryCombo.addItem("Electronics");
        this.productCategoryCombo.addItem("Books");
        this.productCategoryCombo.addItem("Cars");
        this.productCategoryCombo.addItem("Fashion");
        this.productCategoryCombo.addItem("Sports");
        this.productCategoryCombo.addItem("Movies");
        this.productCategoryCombo.addItem("Music");


        GroupLayout layout = new GroupLayout(getContentPane());

        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(adminCancelBtn)
                                    .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adminOkBtn))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(productName)
                                        .addComponent(productPrice)
                                        .addComponent(quantity)
                                        .addComponent(productCategory))
                                    .addGap(93, 93, 93)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(productNameField)
                                        .addComponent(productPriceField)
                                        .addComponent(quantityField)
                                        .addComponent(productCategoryCombo, 0, 350, Short.MAX_VALUE))
                                    .addGap(0, 60, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(createLabel, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelAdminPanel, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))))
                                    .addGap(57, 57, 57))
                                    );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LabelAdminPanel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(createLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(productName)
                        .addComponent(productNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(productCategory)
                        .addComponent(productCategoryCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(productPrice)
                                .addComponent(productPriceField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34)
                            .addComponent(quantity))
                        .addComponent(quantityField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(adminOkBtn)
                            .addComponent(adminCancelBtn))
                    .addContainerGap(38, Short.MAX_VALUE))
                    );

        this.setVisible(true);
        pack();


    }

}

