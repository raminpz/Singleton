public class Persona {
    public String nombre;
    public String apellido;
    private static Persona instance = new Persona();


    private Persona(){}

    public static Persona getInstance(){
        return instance;
    }


}
