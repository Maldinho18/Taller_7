package uniandes.dpoo.taller7.interfaz3;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class PanelTablero extends JPanel {
    private int tamaņoTablero;

    public PanelTablero(int tamaņoTablero) {
        this.tamaņoTablero = tamaņoTablero;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int ancho = getWidth();
        int altura = getHeight();
        int tamano = Math.min(ancho, altura) / tamaņoTablero;

        for (int i = 0; i < tamaņoTablero; i++) {
            for (int col = 0; col < tamaņoTablero; col++) {
                g2d.setColor((i + col) % 2 == 0 ? Color.LIGHT_GRAY : Color.DARK_GRAY);
                g2d.fillRect(col * tamano, i * tamano, tamano, tamano);
            }
        }
    }
}