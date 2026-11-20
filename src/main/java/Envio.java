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

    public boolean addPaquete(double alto, double ancho, double largo, double peso) {

       return this.addPaquete(new Paquete(alto, ancho, largo, peso));
    }

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

    public String toString() {

        String texto = "Envío " + codigoSeguimiento + " -> CP " + codigoPostal + " (" + getNumeroPaquetes() + " paquete/s)";

        if (paquete1 != null) {
            texto += "\n  1. " + paquete1;
        }

         if (paquete2 != null) {
            texto += "\n  2. " + paquete2;
        }

        if (paquete3 != null) {
            texto += "\n  3. " + paquete3;
        }

        texto += "\n  Peso real: " + calcularPesoReal() + " kg | Peso facturable: " + calcularPesoFacturable() + " kg";

        return texto;

    }
}
