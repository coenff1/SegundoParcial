package metodos;

public class Secuencial {
    
    public static int busquedaSecuencial(int[] array, int buscado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == buscado) {
                return i;
            }
        }
        return -1;
    }
}
