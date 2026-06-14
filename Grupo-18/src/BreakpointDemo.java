public class BreakpointDemo {

    public static void main(String[] args) {

        int edad = 15;
        boolean tieneLicencia = true;

        if (edad >= 18 && tieneLicencia) {
            System.out.println("Puede conducir");
        } else {
            System.out.println("No puede conducir");
        }
    }
}