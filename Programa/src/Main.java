package src;

import java.util.ArrayList;

/**
 * Main class
 * @purpose permite correr el programa y llamar a funciones de otras clases para un buen funcionamiento.
 *
 * @date 20/02/2023
 * @author Fabiola Contreras
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("\nBienvenido a la Calculadora Infix");
        ArrayList<String> infix_expressions = readFile._readfile("datos.txt//");

        Calculator calc = Calculator.getInstance();

        for (String element: infix_expressions) {
            element = element.replaceAll("\\s+", "");
            String exp = Infix_Postfix.infixToPostfix(element);
            System.out.println("\n\tOperación a realizar: " + element);
            System.out.println("\tResultado obtenido: " + calc.calculate(exp) + "\n");
        }

        System.out.println("\nSe han hecho los cálculos de todo el archivo");

    }
}
