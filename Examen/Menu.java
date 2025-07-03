package Examen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends  JFrame{
    private JPanel panel1;
    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;



    public Menu() {
        inicializar();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        pack();
        setSize(500, 500);
        setLocationRelativeTo(null);


        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registro_productos rec= new Registro_productos();
                rec.setVisible(true);
                setVisible(false);
            }
        });


        ventasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Factura fac= new Factura();
                fac.setVisible(true);
                setVisible(false);
            }
        });


        verProductosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mostrar_productos mos= new Mostrar_productos();
                mos.setVisible(true);
                setVisible(false);
            }
        });
    }


    private void inicializar(){

        registroButton = new JButton();
        verProductosButton = new JButton();
        ventasButton = new JButton();


        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(7, 7, 7, 7);

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 4; gbc.anchor = GridBagConstraints.CENTER;
        add(new JLabel("Menu de Opciones"), gbc);



        registroButton.setText("Registro de productos");
        verProductosButton.setText("Mostrar productos");
        ventasButton.setText("Mostrar factura");

        gbc.gridy = 12;
        gbc.gridx = 1;
        add(registroButton, gbc);
        gbc.gridx = 12;
        gbc.gridy = 12;
        add(verProductosButton, gbc);
        gbc.gridx= 10;
        gbc.gridy= 15;
        add(ventasButton, gbc);



    }




    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }




}
