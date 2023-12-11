import java.awt.*;
import java.awt.event.*;

public class vinay2 extends Frame implements ActionListener {
    Label nameLabel = new Label("Name: ");
    Label parentNameLabel = new Label("Parent Name: ");
    Label regNoLabel = new Label("Reg No: ");
    Label addressLabel = new Label("Address: ");
    Label resultLabel = new Label("");

    TextField nameTextField = new TextField();
    TextField parentNameTextField = new TextField();
    TextField regNoTextField = new TextField();
    TextField addressTextField = new TextField();

    Button submitButton = new Button("SUBMIT BUTTON");

    public vinay2() {
        setLayout(null);

        nameLabel.setBounds(50, 50, 80, 20);
        parentNameLabel.setBounds(50, 80, 80, 20);
        regNoLabel.setBounds(50, 110, 80, 20);
        addressLabel.setBounds(50, 140, 80, 20);
        resultLabel.setBounds(50, 170, 300, 20);

        nameTextField.setBounds(150, 50, 150, 20);
        parentNameTextField.setBounds(150, 80, 150, 20);
        regNoTextField.setBounds(150, 110, 150, 20);
        addressTextField.setBounds(150, 140, 150, 20);

        submitButton.setBounds(150, 200, 100, 30);
        submitButton.addActionListener(this);

        add(nameLabel);
        add(nameTextField);
        add(parentNameLabel);
        add(parentNameTextField);
        add(regNoLabel);
        add(regNoTextField);
        add(addressLabel);
        add(addressTextField);
        add(resultLabel);
        add(submitButton);

        setSize(350, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Add your submission logic here
        String name = nameTextField.getText();
        String parentName = parentNameTextField.getText();
        String regNo = regNoTextField.getText();
        String address = addressTextField.getText();

        // You can handle these values as needed (e.g., saving to a database)
        resultLabel.setText("Submitted: Name - " + name + ", Parent Name - " + parentName + ", Reg No - " + regNo + ", Address - " + address);
    }

    public static void main(String[] args) {
        new vinay2();
    }
}

