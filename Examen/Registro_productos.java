package Examen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Registro_productos extends JFrame{


    public  String codigo;
    public  String nombre;
    public  String detalle;
    public  double precio_unitario;
    public int Stock;



    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton regresarAlMenuButton;


    public Registro_productos() {
        inicializar();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registro Productos");
        setResizable(false);
        pack();
        setSize(500, 500);
        setLocationRelativeTo(null);


        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarDatos();

            }

        });


        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
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

        guardarButton= new JButton();
        limpiarButton= new JButton();
        regresarAlMenuButton= new JButton();



        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 5; gbc.anchor = GridBagConstraints.CENTER;
        add(new JLabel("Registro de productos"), gbc);

        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 1; gbc.anchor = GridBagConstraints.WEST;
        add(new JLabel("Codigo:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 4; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField1, gbc);


        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 1; gbc.fill = GridBagConstraints.NONE;
        add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 4; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField2, gbc);


        gbc.gridx = 0; gbc.gridy = 6; gbc.gridwidth = 1; gbc.fill = GridBagConstraints.NONE;
        add(new JLabel("Detalle:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 4; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField3, gbc);

        gbc.gridx = 0; gbc.gridy = 8; gbc.gridwidth = 1; gbc.fill = GridBagConstraints.NONE;
        add(new JLabel("Precio Unitario:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 4; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField4, gbc);

        gbc.gridx = 0; gbc.gridy = 10; gbc.gridwidth = 1; gbc.fill = GridBagConstraints.NONE;
        add(new JLabel("Stock:"), gbc);
        gbc.gridx = 1; gbc.gridwidth = 4; gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField5, gbc);



        guardarButton.setText("Guardar");
        limpiarButton.setText("Limpiar");
        regresarAlMenuButton.setText("Regresar al menu");

        gbc.gridy = 12;
        gbc.gridx = 1;
        add(guardarButton, gbc);
        gbc.gridx = 12;
        gbc.gridy = 12;
        add(limpiarButton, gbc);
        gbc.gridx = 12;
        gbc.gridy = 15;
        add(regresarAlMenuButton, gbc);



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
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");

        }
    }


    private void guardarDatos() {
        textField1.setText(codigo);
        textField2.setText(nombre);
        textField3.setText(detalle);
    }




    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Registro_productos().setVisible(true);
        });
    }



}
