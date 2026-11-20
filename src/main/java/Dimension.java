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

    public double calcularVolumen() {

        // Dimension tiene el alto, ancho y largo, así que ella es quien calcula el volumen.
        // Paquete solo se lo pide, para no acceder a los datos de otra clase.

        return alto * ancho * largo;
    }

    public String toString() {

        return alto + " x " + ancho + " x " + largo + " cm";
    }
}
