package src;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * src.Infixcalc
 */
public class Infixcalc {
    Scanner sc = new Scanner(System.in);

    public int Menu_Stack() {

        int ans = solicitarI("¿Cómo desea implementar la pila para este programa?\n1. Usando ArrayList\n2. Usando Vector\n3. Usando Listas");
        switch (ans){
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                int resp = solicitarI("\n¿Qué lista desea implementar?\n1. Lista Simplemente encadenada\n2. Lista Doblemente encadenada");
                switch (resp){
                    case 1:
                        return 3;
                    case 2:
                        return 4;
                }
                break;
            default:
                return 0;
        }

        return 0;
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