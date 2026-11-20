    /**
 * Un envío agrupa los paquetes que un cliente manda a un mismo destino.
 * Un envío admite como máximo tres paquetes.
 *
 * Ninguno de los métodos de esta clase escribe en pantalla.
 *
 * @author jesanny
 */
public class Envio {

   private static final int MAX_PAQUETES = 3; //he usado private porque solo lo usaremos en esta clase y en el enuniado me pide la visibilidad mas restrictiva
   private String codigoPostal;
   private String codigoSeguimiento;
   private Paquete paquete1;
    private Paquete paquete2;
    private Paquete paquete3;

    /**
     * Crea un envío sin paquetes.
     *
     * @param codigo       código de seguimiento, p.ej. "PX00000001R"
     * @param codigoPostal código postal del destino, p.ej. "36202"
     */
    public Envio(String codigo, String codigoPostal) {

        this.codigoPostal = codigoPostal;
        codigoSeguimiento = codigo;
    }

    public String getCodigo() {
        return codigoSeguimiento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public int getNumeroPaquetes() {
        if (paquete1 == null) {return 0;}
        if (paquete2 == null) {return 1;}
        if (paquete3 == null) {return 2;}
        return 3;
    }

    public boolean estaCompleto() {
    return (getNumeroPaquetes () == MAX_PAQUETES);
    }

    /**
     * Añade un paquete al envío si no está completo.
     *
     * @return true si se ha añadido, false si el envío estaba completo
     */
    public boolean addPaquete(Paquete paquete) {

        switch (getNumeroPaquetes()){
        case 0:
            paquete1 = paquete;
            return true;

        case 1:
            paquete2 = paquete;
            return true;

        case 2:
            paquete3 = paquete;
            return true;

        default:
            return false;
        }
    }

    /**
     * Crea un paquete con las medidas y peso indicados y lo añade al envío.
     *
     * @return true si se ha añadido, false si el envío estaba completo
     */
    public boolean addPaquete(double alto, double ancho, double largo, double peso) {

       return this.addPaquete(new Paquete(alto, ancho, largo, peso));
    }

    /**
     * @return la suma de los pesos reales de los paquetes (kg)
     */
    public double calcularPesoReal() {
        double total = 0;

        if (paquete1 != null){
            total += paquete1.getPeso();

        }
        if (paquete2 != null){
            total += paquete2.getPeso();

        }
        if (paquete3 != null){
            total += paquete3.getPeso();

        }
        return total;
    }

    /**
     * Suma los pesos facturables de los paquetes y redondea hacia arriba
     * al kilo entero.
     *
     * @return el peso facturable del envío (kg enteros)
     */
    public double calcularPesoFacturable() {
        double pesoTotal = 0;
        if (paquete1 != null){
            pesoTotal += paquete1.calcularPesoFacturable();

        }
        if (paquete2 != null){
            pesoTotal += paquete2.calcularPesoFacturable();

        }
        if (paquete3 != null){
            pesoTotal += paquete3.calcularPesoFacturable();

        }
        return Math.ceil(pesoTotal);
    }

    /**
     * @return el paquete de mayor peso real; si hay empate, el que se añadió
     * antes; null si el envío no tiene paquetes
     */
    public Paquete getPaqueteMasPesado() {

        if (paquete1 == null){
            return null;
        }
        Paquete masPesado = paquete1;

        if (paquete2 != null && paquete2.getPeso() > masPesado.getPeso()){
             masPesado = paquete2;
        }
        if (paquete3 != null && paquete3.getPeso() > masPesado.getPeso()){
            masPesado = paquete3;
        }
        return masPesado;
    }

    /**
     * @return representación textual del envío (ver enunciado)
     */
    public String toString() {
        // TODO
        return "";
    }
}
