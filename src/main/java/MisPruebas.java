public class MisPruebas {
    /**
     * Pruebas propias de Dimension, Paquete y Envio.
     *
     * @author jesanny
     */
    public static void main(String[] args) {
            pruebaEnvioVacio();
            pruebaMismoPeso();
            pruebaMasPesadoQueVoluminoso();
        }

        private static void pruebaEnvioVacio() {
            System.out.println("PRUEBA 1: envio vacio");
            Envio envio = new Envio("PX00000002R", "36202");
            System.out.println("Numero de paquetes (esperado 0): " + envio.getNumeroPaquetes());
            System.out.println("¿Completo? (esperado false): " + envio.estaCompleto());
            System.out.println("Paquete más pesado (esperado null): " + envio.getPaqueteMasPesado());
            System.out.println("Peso real (esperado 0.0): " + envio.calcularPesoReal());
            System.out.println("Peso facturable (esperado 0.0): " + envio.calcularPesoFacturable());
            System.out.println(envio);
            System.out.println("--------------------------------------------------");
        }

        private static void pruebaMismoPeso() {
            System.out.println("PRUEBA 2: dos paquetes con el mismo peso real (5 kg)");
            Envio envio = new Envio("PX00000003R", "36202");
            Paquete primero = new Paquete(10, 10, 10, 5);
            Paquete segundo = new Paquete(20, 20, 20, 5);
            envio.addPaquete(primero);
            envio.addPaquete(segundo);
            System.out.println("¿El mas pesado es el primero que se añadio? (esperado true): "
                    + (envio.getPaqueteMasPesado() == primero));
            System.out.println(envio);
            System.out.println("--------------------------------------------------");
        }

        private static void pruebaMasPesadoQueVoluminoso() {
            System.out.println("PRUEBA 3: paquete mas pesado que voluminoso");
            Paquete paquete = new Paquete(10, 10, 10, 8);
            System.out.println("Volumen (esperado 1000.0): " + paquete.calcularVolumen());
            System.out.println("Peso volumetrico (esperado 0.2): " + paquete.calcularPesoVolumetrico());
            System.out.println("Peso facturable (esperado 8.0, el real): " + paquete.calcularPesoFacturable());
            System.out.println(paquete);
            System.out.println("--------------------------------------------------");
        }
    }

