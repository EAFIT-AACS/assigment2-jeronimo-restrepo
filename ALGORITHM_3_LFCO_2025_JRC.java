import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class ALGORITHM_3_LFCO_2025_JRC {
    public static void construirArbol(String cadena) {
        Stack<String> pila = new Stack<>();
        List<String> derivaciones = new ArrayList<>();
        
        derivaciones.add("S"); // Estado inicial de la derivación
        
        StringBuilder arbol = new StringBuilder("Árbol de derivación:\n");
        
        for (char simbolo : cadena.toCharArray()) {
            if (simbolo == 'a') {
                pila.push("a");
                derivaciones.add(derivaciones.get(derivaciones.size() - 1).replace("S", "aSb"));
                arbol.append("Nodo a añadido\n");
            } else if (simbolo == 'b' && !pila.isEmpty()) {
                pila.pop();
                String nuevaForma = derivaciones.get(derivaciones.size() - 1).replace("S", "");
                if (!derivaciones.contains(nuevaForma)) { // Evita duplicados
                    derivaciones.add(nuevaForma);
                }
                arbol.append("Nodo b añadido\n");
            }
        }
        
        // Imprimir derivaciones
        arbol.append("\nFormas sentenciales de la derivación:\n");
        for (String derivacion : derivaciones) {
            arbol.append(derivacion).append("\n");
        }
        
        System.out.println(arbol.toString());
    }
}
