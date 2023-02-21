package src;

public class Factory {

    public static Stack getInstance (int TipoS){
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
