import java.awt.*;
import java.awt.event.*;

public class vinay extends Frame implements ActionListener {
    Label nameLabel, fatherNameLabel, addressLabel, dobLabel, phoneLabel;
    TextField nameField, fatherNameField, addressField, dobField, phoneField;
    Button submitButton;

    public vinay() {
        nameLabel = new Label("Name:");
        nameLabel.setBounds(50,50,150,20);  

        fatherNameLabel = new Label("Father's Name:");
        fatherNameLabel.setBounds(50,50,150,20);  

        addressLabel = new Label("Address:");
        addressLabel.setBounds(50,50,150,20);  

        dobLabel = new Label("Date of Birth:");
        dobLabel.setBounds(50,50,150,20);  

        phoneLabel = new Label("REG. NO:-");
        phoneLabel.setBounds(50,50,150,20);  


        nameField = new TextField();
        fatherNameField = new TextField();
        addressField = new TextField();
        dobField = new TextField();
        phoneField = new TextField();

        submitButton = new Button("Submit");

        submitButton.addActionListener(this);

        setLayout(new GridLayout(6, 2));
        add(nameLabel);
        add(nameField);
        add(fatherNameLabel);
        add(fatherNameField);
        add(addressLabel);
        add(addressField);
        add(dobLabel);
        add(dobField);
        add(phoneLabel);
        add(phoneField);
        add(new Label());
        add(submitButton);

        setTitle("Personal Information Form : Mithra");
        setSize(400, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String fatherName = fatherNameField.getText();
        String address = addressField.getText();
        String dob = dobField.getText();
        String phoneNumber = phoneField.getText();

        System.out.println("Name: " + name);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Address: " + address);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        new vinay();
    }
}
