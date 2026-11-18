/**
 * Un envío agrupa los paquetes que un cliente manda a un mismo destino.
 * Un envío admite como máximo tres paquetes.
 *
 * Ninguno de los métodos de esta clase escribe en pantalla.
 *
 * @author jesanny
 */
public class Envio {

    // TODO constante de clase MAX_PAQUETES (ver enunciado)

    // TODO atributos: código de seguimiento, código postal y tres paquetes

   private int MAX_PAQUETES;
   private int codigoPostal;
   private int codigoSeguimiento;

    /**
     * Crea un envío sin paquetes.
     *
     * @param codigo       código de seguimiento, p.ej. "PX00000001R"
     * @param codigoPostal código postal del destino, p.ej. "36202"
     */
    public Envio(String codigo, String codigoPostal) {
        // TODO
    }

    public String getCodigo() {
        // TODO
        return null;
    }

    public String getCodigoPostal() {
        // TODO
        return null;
    }

    /**
     * @return cuántos paquetes tiene el envío (0 a 3)
     * Para mejorar el algoritmo: Los paquetes se añaden siempre en orden, así que nunca hay huecos entre ellos.
     */
    public int getNumeroPaquetes() {
        // TODO (se calcula comprobando qué atributos d paquete son null)
        return 0;
    }

    /**
     * @return true si ya no se pueden añadir más paquetes
     */
    public boolean estaCompleto() {
        // TODO
        return false;
    }

    /**
     * Añade un paquete al envío si no está completo.
     *
     * @return true si se ha añadido, false si el envío estaba completo
     */
    public boolean addPaquete(Paquete paquete) {
        // TODO
        return false;
    }

    /**
     * Crea un paquete con las medidas y peso indicados y lo añade al envío.
     *
     * @return true si se ha añadido, false si el envío estaba completo
     */
    public boolean addPaquete(double alto, double ancho, double largo, double peso) {
        // TODO
        return false;
    }

    /**
     * @return la suma de los pesos reales de los paquetes (kg)
     */
    public double calcularPesoReal() {
        // TODO
        return 0;
    }

    /**
     * Suma los pesos facturables de los paquetes y redondea hacia arriba
     * al kilo entero.
     *
     * @return el peso facturable del envío (kg enteros)
     */
    public double calcularPesoFacturable() {
        // TODO
        return 0;
    }

    /**
     * @return el paquete de mayor peso real; si hay empate, el que se añadió
     * antes; null si el envío no tiene paquetes
     */
    public Paquete getPaqueteMasPesado() {
        // TODO
        return null;
    }

    /**
     * @return representación textual del envío (ver enunciado)
     */
    public String toString() {
        // TODO
        return "";
    }
}
