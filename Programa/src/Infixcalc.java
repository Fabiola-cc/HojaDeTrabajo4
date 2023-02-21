package src;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Infixcalc
 * Cuenta con recursos útiles para el uso de Main
 * 
 * @author Fabiola Contreras
 */
public class Infixcalc {
    Scanner sc = new Scanner(System.in);

    /**
     * Consulta al usuario el tipo de pila que desea emplear durante el programa.
     * 
     * @return entero con el número indicado por el usuario, indicando la pila
     *         deseada
     */
    public int Menu_Stack() {

        int ans = solicitarI(
                "¿Cómo desea implementar la pila para este programa?\n1. Usando ArrayList\n2. Usando Vector\n3. Usando Listas");
        switch (ans) {
            case 1: // ArrayList
                return 1;
            case 2: // Vector
                return 2;
            case 3: // Lista
                return 3;
            default:
                return 0;
        }
    }

    /**
     * Consulta al usuario el tipo de lista que desea emplear durante el programa.
     *
     * @return entero con el número indicado por el usuario, indicando la pila
     *         deseada
     */
    public int Menu_List() {

        int ans = solicitarI(
                "¿Qué tipo de lista deseas usar para este programa?\n1. Simple\n2. Doblemente encadenada");
        switch (ans) {
            case 1: // Lista Simple
                return 1;
            case 2: // Lista Doblemente encadenada
                return 2;
            default:
                return 0;
        }
    }

    /**
     * Imprime una solicitud y recibe un dato tipo int
     * Evita una excepción -InputMismatchException- volviendo a solicitar el dato en
     * caso de que ocurra. (Utilizada continuamente en distintos programas)
     *
     * @Author Fabiola Contreras
     * @param solicitud texto que describe lo solicitado
     * @return entero ingresado por el usuario
     */
    public int solicitarI(String solicitud) {
        System.out.println(solicitud);
        int solicitar = 0;
        Boolean correcto = false;
        do {
            try {
                solicitar = sc.nextInt();
                correcto = true;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("¡Cuidado! Ingresa un número entero.");
            }
        } while (correcto == false);
        sc.nextLine(); // Elimina la posibilidad de saltarse una linea de solicitud después
        return solicitar;
    }
}