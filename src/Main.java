public class Main {
    /***
     *
     * Singleton es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia,
     * a la vez que proporciona un punto de acceso global a dicha instancia.
     */
    public static void main(String[] args) {

       Persona p = Persona.getInstance();
       Persona p2 = Persona.getInstance();

       p.apellido = "Nuñez";
       p.nombre = "Ramiro";

        System.out.println(p2.nombre);

    }
}