/**
 * Programa de prueba del proyecto. Se da completo.
 * Es la única clase del proyecto que escribe en pantalla.
 *
 * @author (profesorado)
 */
public class DemoEnvio {

    public static void main(String[] args) {
        Paquete p1 = new Paquete(40, 30, 50, 8);       // volumétrico 12 kg
        Paquete p2 = new Paquete(new Dimension(10, 20, 30), 2.5);
        Envio envio = new Envio("PX00000001R", "36202");

        System.out.println("Paquete 1: " + p1);
        System.out.println("  volumen: " + p1.calcularVolumen() + " cm3");
        System.out.println("Paquete 2: " + p2);
        separador();

        envio.addPaquete(p1);
        envio.addPaquete(p2);
        System.out.println(envio);
        separador();

        boolean anadido = envio.addPaquete(20, 20, 20, 9);
        System.out.println("¿Se añade el tercer paquete? " + anadido);
        anadido = envio.addPaquete(10, 10, 10, 1);
        System.out.println("¿Se añade un cuarto paquete? " + anadido);
        System.out.println("¿Envío completo? " + envio.estaCompleto());
        separador();

        System.out.println(envio);
        System.out.println("Paquete más pesado: " + envio.getPaqueteMasPesado());
    }

    private static void separador() {
        System.out.println("--------------------------------------------------");
    }
}
