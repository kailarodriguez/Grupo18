public class EjemploAjustePrecio {
    public static void main(String[] args) {

        double precioBase = 100;
        double descuento = 15;
        double recargo = 10;

        double total = precioBase;

        System.out.println("Descuento: "+descuento);
        System.out.println("Recargo: "+recargo);
        total = aplicarDescuento(total, descuento);
        System.out.println("Este programa procesa pago, aplica recargo y descuento para obtener el precio final");

        System.out.println("Comienza reajuste de precio");

        // Aplicación de ajustes
        total = aplicarRecargo(total, recargo);
        System.out.println("Se ha aplicado el recargo");

        total = aplicarDescuento(total, descuento);
        System.out.println("Se ha aplicado el descuento");

        System.out.println("Finaliza reajuste de precio");

        System.out.println("Total final: " + total);
    }

    static double aplicarDescuento(double monto, double descuento) {
        return monto - (monto * descuento / 100);
    }

    static double aplicarRecargo(double monto, double recargo) {
        return monto + (monto * recargo / 100);
    }

}
