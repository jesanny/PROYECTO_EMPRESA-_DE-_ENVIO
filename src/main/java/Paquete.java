/**
 * Un bulto físico que forma parte de un envío.
 *
 * @author jesanny
 */
public class Paquete {

    /** cm3 que equivalen a 1 kg a efectos de facturación */



    public static final double FACTOR_VOLUMETRICO = 5000;

    // TODO atributos: una Dimension y el peso real (kg)
    private Dimension dimension; //bulto fisico compone de estas dos.
    private double pesoReal;

    /**
     * Crea un paquete a partir de una dimensión ya creada y su peso real (kg).
     */
    public Paquete(Dimension dimension, double peso) {
        pesoReal= peso;
       this.dimension= dimension;
    }

    /**
     * Crea un paquete a partir de sus medidas (cm) y su peso real (kg).
     * Sin duplicar el código del otro constructor.
     */
    public Paquete(double alto, double ancho, double largo, double peso) {

        this(new Dimension(alto, ancho, largo), peso);
    }

    public Dimension getDimension() {
        return dimension;
    }

    /**
     * @return el peso real en kg
     */
    public double getPeso() {
        return pesoReal;
    }

    /**
     * @return el volumen del paquete en cm3
     */
    public double calcularVolumen(double volumen) {
        // TODO (lee la decisión de diseño del enunciado)
        //que Dimension tenga su propio método para calcular el volumen y Paquete se lo pida.

         dimension.getAlto();
         dimension.getAncho();
         dimension.getLargo();
        System.out.println("volumen en cm3: " +  dimension.getAlto() * dimension.getAncho() * dimension.getLargo() "cm3" );

    }

    /**
     * @return el peso volumétrico en kg (volumen / FACTOR_VOLUMETRICO)
     */
    public double calcularPesoVolumetrico() {
        // TODO
        return 0;
    }

    /**
     * El peso facturable es el mayor entre el peso real y el volumétrico.
     *
     * @return el peso facturable en kg
     */
    public double calcularPesoFacturable() {
        // TODO
        return 0;
    }

    /**
     * @return por ejemplo "40.0 x 30.0 x 50.0 cm | 8.0 kg (facturable 12.0 kg)"
     */
    public String toString() {
        // TODO
        return "";
    }
}
