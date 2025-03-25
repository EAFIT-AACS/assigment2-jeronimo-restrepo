import java.util.Random;

public class ALGORITHM_1_LFCO_2025_JRC {
    public static String generarCadenaValida(int profundidad) {
        if (profundidad == 0) {
            return "";
        }
        return "a" + generarCadenaValida(profundidad - 1) + "b";
    }
    
    public static String generarCadenaInvalida(int longitud) {
        Random rand = new Random();
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            cadena.append(rand.nextBoolean() ? "a" : "b");
        }
        return cadena.toString();
    }
}
