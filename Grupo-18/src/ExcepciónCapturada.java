public class ExcepciónCapturada {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 3;
            int division = num1 / num2;
            System.out.println("Resultado: " + division);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }
    }
}