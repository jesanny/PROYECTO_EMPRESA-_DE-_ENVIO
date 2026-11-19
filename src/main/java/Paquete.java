/**
 * Un bulto físico que forma parte de un envío.
 *
 * @author jesanny
 */
public class Paquete {

    /** cm3 que equivalen a 1 kg a efectos de facturación */

    public static final double FACTOR_VOLUMETRICO = 5000;

    private Dimension dimension;
    private double pesoReal;


    public Paquete(Dimension dimension, double peso) {
        pesoReal= peso;
       this.dimension= dimension;
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

    /**
     * @return el volumen del paquete en cm3
     */
    public double calcularVolumen() {
        // TODO (lee la decisión de diseño del enunciado)
        //que Dimension tenga su propio método para calcular el volumen y Paquete se lo pida.

        return dimension.calcularVolumen();

    }

    public double calcularPesoVolumetrico() {

        return calcularVolumen() / FACTOR_VOLUMETRICO ;
    }

    /**
     * El peso facturable es el mayor entre el peso real y el volumétrico.
     *
     * @return el peso facturable en kg
     */
    public double calcularPesoFacturable() {
            return Math.max(pesoReal, calcularPesoVolumetrico());
    }

    /**
     * @return por ejemplo "40.0 x 30.0 x 50.0 cm | 8.0 kg (facturable 12.0 kg)"
     */
    public String toString() {

        return dimension.toString() + " | " + getPeso() + " kg (facturable " + calcularPesoFacturable() + " kg)";

    }
}
