import java.util.*;

public class Diccionario {
    public static void main(String[] args) {

        // 1 Crear y mezclar la lista
        HashMap<String, String> palabras = new HashMap<>();
        palabras.putAll(Map.ofEntries(Map.entry("hola", "hello"), Map.entry("adiós", "goodbye"), Map.entry("por favor", "please"), Map.entry("gracias", "thank you"), Map.entry("perro", "dog"), Map.entry("gato", "cat"), Map.entry("casa", "house"), Map.entry("libro", "book"), Map.entry("agua", "water"), Map.entry("comida", "food"), Map.entry("sol", "sun"), Map.entry("luna", "moon"), Map.entry("amigo", "friend"), Map.entry("tiempo", "time"), Map.entry("escuela", "school"), Map.entry("trabajo", "work"), Map.entry("feliz", "happy"), Map.entry("amor", "love"), Map.entry("ciudad", "city"), Map.entry("carro", "car")));
        List<String> listaPalabras = new ArrayList<>(palabras.keySet());
        Collections.shuffle(listaPalabras);
        // 2. Crear el Scanner.
        Scanner teclado = new Scanner(System.in);
        // 3 for
        int aciertos = 0;

        for (int i = 0; i < Math.min(5, palabras.size()); i++) {
            String palabraEspanol = listaPalabras.get(i);
            //System.out.println(listaPalabras.get(i));
            System.out.println("Traduce la siguiente palabra: " + palabraEspanol);
            System.out.print("Tu respuesta: ");

            String respuestaUsuario = teclado.nextLine();

            String traduccionCorrecta = palabras.get(palabraEspanol);

            if (traduccionCorrecta.equalsIgnoreCase(respuestaUsuario)) {
                System.out.println("Palabra correcta" );
                aciertos++;
            } else {
                System.out.println("La traducción correcta es: " + traduccionCorrecta);
            }//else
        }//for
        System.out.println();
        System.out.println("Finalizado");
        System.out.println("Total de aciertos: " + aciertos);
    }
}// class

