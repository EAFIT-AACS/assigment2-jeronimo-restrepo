import java.util.Stack;

public class ALGORITHM_2_LFCO_2025_JRC {
    
    public static boolean reconocerCadena(String cadena) {
        Stack<Character> pila = new Stack<>();
        for (char simbolo : cadena.toCharArray()) {
            if (simbolo == 'a') {
                pila.push('a');
            } else if (simbolo == 'b') {
                if (pila.isEmpty() || pila.pop() != 'a') {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
}
