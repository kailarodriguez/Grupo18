public class EjemploIndice {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8};
        int resultado = 0;

        for (int i = 0; i <= numeros.length; i++) {
            resultado += numeros[i];
        }

        System.out.println(resultado);
    }
}
