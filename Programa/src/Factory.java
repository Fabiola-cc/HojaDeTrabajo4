package src;

/**
 * Factory
 * Permite la generación de distintos tipos de Stack según sea decidido por el usuario.
 *
 * @date 20/02/2023
 * @author Fabiola Contreras
 */
public class Factory {

    public static <T> Stack getInstance (int TipoS){
        switch (TipoS){
            case 1:
                return new Stack_ArrayList();

            case 2:
                return new Stack_Vector();

            case 3:
                return new Stack_SingleList();

            case 4:
                return new Stack_DoubleList();

            default:
                return null;
        }
    }

}
