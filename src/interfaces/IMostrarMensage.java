package interfaces;

public interface IMostrarMensage {
    default void getMostrarMensage(String mensaje){

        System.out.println(mensaje);
    }


}
