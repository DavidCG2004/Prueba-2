package Examen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{

    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton accesoButton;
    private JButton limpiarButton;



    public Login() {
        inicializar();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        pack();
        setSize(500, 500);
        setLocationRelativeTo(null);


        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });


        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Iniciarsecion();
            }
        });


        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });
    }

    private void inicializar(){

        textField1 = new JTextField(20);
        textField2 = new JTextField(20);

        accesoButton = new JButton();
        limpiarButton = new JButton();


        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 5; gbc.anchor = GridBagConstraints.CENTER;
        add(new JLabel("Login"), gbc);

        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 1; gbc.anchor = GridBagConstraints.WEST;
        add(new JLabel("Usuario:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 4; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField1, gbc);


        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 1; gbc.fill = GridBagConstraints.NONE;
        add(new JLabel("Contraseña:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 4; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField2, gbc);



        accesoButton.setText("Acceder al sistema");
        limpiarButton.setText("Limpiar");


        gbc.gridy = 12;
        gbc.gridx = 1;
        add(accesoButton, gbc);
        gbc.gridx = 12;
        gbc.gridy = 12;
        add(limpiarButton, gbc);
    }

    private void Iniciarsecion(){
        if (validarCampos()){
            Menu menu= new Menu();
            menu.setVisible(true);
            setVisible(false);
        }
    }


    private boolean validarCampos() {
        if (textField1.equals("admin") && textField2.equals("123")){
            JOptionPane.showMessageDialog(this, "Inicio de sesion exitoso");
            return true;
        }

        if (textField1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese el usuario",
                    "Campo requerido", JOptionPane.WARNING_MESSAGE);
            textField2.requestFocus();
            return false;
        }

        if (textField2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese la contraseña",
                    "Campo requerido", JOptionPane.WARNING_MESSAGE);
            textField2.requestFocus();
            return false;
        }
        return true;
    }


    private void limpiarCampos() {
        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Esta seguro que desea limpiar todos los campos",
                "Confirmar limpieza",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (opcion == JOptionPane.YES_OPTION) {
            textField1.setText("");
            textField2.setText("");

        }
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }




}

