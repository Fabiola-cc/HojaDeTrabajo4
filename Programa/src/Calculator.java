package src;

import java.util.ArrayList;

/**
 * Esta clase fue creada y utilizada para la hoja de trabajo 2 del presente curso.
 * Fue adaptada en este caso para utilizar el patrón singleton y permitir su uso en el actual programa.
 * Propósito: Realizar las operaciones matemáticas del archivo leído
 *
 * @author
 * Maria José Villafuerte
 * Fabiola Contreras
 * Madeline Castro
 * @category Hoja de trabajo #2
 *
 * @date 30/01/2023
 */

public class Calculator {
    static PostfixCalculator calculadora = new PostfixCalculator();
    private static Stack<Integer> stack;
    static ArrayList<String> operacion;
    static Calculator onlyCalculator;
    private static boolean instance_flag = false; //true if 1 instance


    /**
     * Constructor, implementar singleton
     * evita la creación de nuevas instancias de src.Calculator en otras clases
     */
    private Calculator() {
        instance_flag = true;
        stack = Stack_Factory.getInstance();
    }

    public static Calculator getInstance() {
        if (instance_flag) {
            return onlyCalculator;
        } else {
            onlyCalculator = new Calculator();
            return onlyCalculator;
        }
    }

    /**
     * Metodo que guarda en la pila los elememtos del ArrayList y realiza las operaciones cuando encuentra un operando (solo con los primeros dos elementos)
     * @param Firstpostfix Primera linea del documento txt
     * @return resultado de la pila
     */
    public int calculate(String Firstpostfix){

        operacion = calculadora.getItems(Firstpostfix);

        for (int i = 0; i < operacion.size(); i++) {

            String num_op = operacion.get(i);

            if (calculadora.isOperator(num_op)){

                int a = stack.pull();
                int b = stack.pull();

                switch(num_op){

                    case "+":
                        stack.push(calculadora.suma(b, a));
                        break;
                    case "-" :
                        stack.push(calculadora.resta(b, a));
                        break;
                    case "*":
                        stack.push(calculadora.multiplicacion(b, a));
                        break;
                    case "/":
                        stack.push(calculadora.division(b, a));
                        break;
                }

            } else {
                stack.push(Integer.valueOf(num_op));
            }

        }
        return stack.pull();
    }
}
