package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private JPanel panelSuperior;
    private JPanel panelDerecho;
    private JPanel panelInferior;

    public VentanaPrincipal() {
        setTitle("Juego de LightsOut");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        
        panelSuperior = new JPanel();
        panelDerecho = new JPanel();
        panelInferior = new JPanel();

        
        add(panelSuperior, BorderLayout.NORTH);
        add(panelDerecho, BorderLayout.EAST);
        add(panelInferior, BorderLayout.SOUTH);

        
        configurarPanelSuperior();
        configurarPanelDerecho();
        configurarPanelInferior();
    }

    private void configurarPanelSuperior() {
        panelSuperior.setLayout(new FlowLayout());
        panelSuperior.add(new JLabel("Tamaño:"));
        panelSuperior.add(new JComboBox<>(new String[]{"5x5", "6x6", "7x7"}));
        panelSuperior.add(new JRadioButton("Fácil"));
        panelSuperior.add(new JRadioButton("Medio"));
        panelSuperior.add(new JRadioButton("Difícil"));
    }

    private void configurarPanelDerecho() {
        panelDerecho.setLayout(new BoxLayout(panelDerecho, BoxLayout.Y_AXIS));
        panelDerecho.add(new JButton("Nuevo"));
        panelDerecho.add(new JButton("Reiniciar"));
        panelDerecho.add(new JButton("Top-10"));
        panelDerecho.add(new JButton("Cambiar Jugador"));
    }

    private void configurarPanelInferior() {
        panelInferior.setLayout(new FlowLayout());
        panelInferior.add(new JLabel("Jugador:"));
        panelInferior.add(new JTextField(20));
        panelInferior.setLayout(new FlowLayout());
        panelInferior.add(new JLabel("Jugadas:"));
        panelInferior.add(new JTextField(20));
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}