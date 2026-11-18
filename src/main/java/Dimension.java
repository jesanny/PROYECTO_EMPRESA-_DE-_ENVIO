/**
 * Medidas exteriores de un paquete, en centímetros.
 * No tiene métodos para modificar las medidas: una vez creada no cambia.
 *
 * @author jesanny
 */
public class Dimension {

    private double alto;
    private double ancho;
    private double largo;

    /**
     * Crea una dimensión con las medidas indicadas (en cm).
     */
    public Dimension(double alto, double ancho, double largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    // DECISIÓN DE DISEÑO (ver enunciado): si decides que el volumen lo
    // calcula Dimension, añade aquí el método.

    /**
     * @return las medidas con el formato "40.0 x 30.0 x 50.0 cm"
     */
    public String toString() {
        return alto + " x " + ancho + " x " + largo + " cm";
    }
}
