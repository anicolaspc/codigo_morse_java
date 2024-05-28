package arreglos;

import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String input = scanner.nextLine().toUpperCase();

        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                // Añadir espacio entre palabras
                result.append(" ");
            } else {
                // Buscar el índice del caracter en el arreglo de letras
                int index = -1;
                for (int j = 0; j < letras.length; j++) {
                    if (letras[j].equals(String.valueOf(c))) {
                        index = j;
                        break;
                    }
                }
                if (index != -1) {
                    // Si el caracter existe en el arreglo, añadir su código Morse correspondiente
                    result.append(morse[index]).append(" ");
                } else {
                    // Si el caracter no existe en el arreglo, omitirlo
                    System.out.println("Carácter omitido: " + c);
                }
            }
        }

        System.out.println("Código Morse resultante: " + result.toString());
    }
}
