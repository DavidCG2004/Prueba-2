package Examen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factura  extends JFrame {


    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton calcularButton;
    private JButton regresarAlMenuButton;


    public Factura() {
        inicializar();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Factura");
        setResizable(false);
        pack();
        setSize(500, 500);
        setLocationRelativeTo(null);


        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        regresarAlMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                menu.setVisible(true);
                setVisible(false);
            }
        });
    }


    private void inicializar(){

        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        textField3 = new JTextField(20);
        textField4 = new JTextField(20);
        textField5 = new JTextField(20);
        textField6 = new JTextField(20);

        calcularButton= new JButton();
        regresarAlMenuButton= new JButton();


        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 5; gbc.anchor = GridBagConstraints.CENTER;
        add(new JLabel("Factura"), gbc);

        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 1; gbc.anchor = GridBagConstraints.WEST;
        add(new JLabel("Codigo:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 4; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField1, gbc);


        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 1; gbc.fill = GridBagConstraints.NONE;
        add(new JLabel("Producto:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 4; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField2, gbc);


        gbc.gridx = 0; gbc.gridy = 6; gbc.gridwidth = 1; gbc.fill = GridBagConstraints.NONE;
        add(new JLabel("Precio:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 4; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField3, gbc);

        gbc.gridx = 0; gbc.gridy = 8; gbc.gridwidth = 1; gbc.fill = GridBagConstraints.NONE;
        add(new JLabel("Cantidad:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 4; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField4, gbc);

        gbc.gridx = 0; gbc.gridy = 10; gbc.gridwidth = 1; gbc.fill = GridBagConstraints.NONE;
        add(new JLabel("Subtotal:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 4; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField5, gbc);

        gbc.gridx = 0; gbc.gridy = 12; gbc.gridwidth = 1; gbc.fill = GridBagConstraints.NONE;
        add(new JLabel("Total a pagar:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 4; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField6, gbc);


        calcularButton.setText("Calcular ");
        regresarAlMenuButton.setText("Regresar al menu");

        gbc.gridy = 13;
        gbc.gridx = 11;
        add(calcularButton, gbc);
        gbc.gridx = 1;
        gbc.gridy = 13;
        add(regresarAlMenuButton, gbc);

    }





    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Factura().setVisible(true);
        });
    }



}
