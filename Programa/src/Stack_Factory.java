package src;

/**
 * Factory
 * Permite la generación de distintos tipos de Stack según sea decidido por el usuario.
 *
 * @date 20/02/2023
 * @author Fabiola Contreras
 */
public class Stack_Factory {

    public static <T> Stack getInstance (){
        int Stack_Type = new Infixcalc().Menu_Stack();

        switch (Stack_Type){
            case 1:
                return new Stack_ArrayList();


            case 2:
                return new Stack_Vector();

            case 3:
                int List_Type = new Infixcalc().Menu_List();
                return new Stack_List(List_Type);

            default:
                return null;
        }
    }

}
