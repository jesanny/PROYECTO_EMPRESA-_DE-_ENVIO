/**
 * Un bulto físico que forma parte de un envío.
 *
 * @author jesanny
 */
public class Paquete {

    /**
     * cm3 que equivalen a 1 kg a efectos de facturación
     */

    public static final double FACTOR_VOLUMETRICO = 5000;

    private Dimension dimension;
    private double pesoReal;


    public Paquete(Dimension dimension, double peso) {
        pesoReal = peso;
        this.dimension = dimension;
    }


    public Paquete(double alto, double ancho, double largo, double peso) {

        this(new Dimension(alto, ancho, largo), peso);
    }

    public Dimension getDimension() {

        return dimension;
    }

    public double getPeso() {

        return pesoReal;
    }

    public double calcularVolumen() {

        return dimension.calcularVolumen();

    }

    public double calcularPesoVolumetrico() {

        return calcularVolumen() / FACTOR_VOLUMETRICO;
    }


    public double calcularPesoFacturable() {


        return Math.max(pesoReal, calcularPesoVolumetrico());

    }

    public String toString() {

        return dimension.toString() + " | " + getPeso() + " kg (facturable " + calcularPesoFacturable() + " kg)";

    }
}
