import java.util.Random;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

// Clase Main para probar los algoritmos
public class Main {
    public static void main(String[] args) {
        // Generar y probar cadenas válidas
        String cadenaValida = ALGORITHM_1_LFCO_2025_JRC.generarCadenaValida(3);
        System.out.println("Cadena válida generada: " + cadenaValida);
        System.out.println("¿Es válida? " + (ALGORITHM_2_LFCO_2025_JRC.reconocerCadena(cadenaValida) ? "Sí" : "No"));
        
        // Generar y probar cadenas inválidas
        String cadenaInvalida = ALGORITHM_1_LFCO_2025_JRC.generarCadenaInvalida(6);
        System.out.println("Cadena inválida generada: " + cadenaInvalida);
        System.out.println("¿Es válida? " + (ALGORITHM_2_LFCO_2025_JRC.reconocerCadena(cadenaInvalida) ? "Sí" : "No"));
        
        // Construcción del árbol de derivación si la cadena es válida
        if (ALGORITHM_2_LFCO_2025_JRC.reconocerCadena(cadenaValida)) {
            System.out.println("Construcción del árbol de derivación para la cadena válida:");
            ALGORITHM_3_LFCO_2025_JRC.construirArbol(cadenaValida);
        }
    }
}