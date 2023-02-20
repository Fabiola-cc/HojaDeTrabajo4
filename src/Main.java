package src;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nBienvenido a la Calculadora Infix");
        ArrayList<String> infix_expressions = readFile._readfile("datos.txt//");
        int Stack_Type = new Infixcalc().Menu_Stack();

        Calculator calc = Calculator.getInstance();

        for (String element: infix_expressions) {
            element = element.replaceAll("\\s+", "");
            String exp = Infix_Postfix.infixToPostfix(Factory.getInstance(Stack_Type), element);
            System.out.println("\n\tOperación a realizar: " + element);
            System.out.println("\tResultado obtenido: " + Calculator.calculate(Stack_Type, exp) + "\n");
        }

        System.out.println("\nSe han hecho los cálculos de todo el archivo");

    }
}
