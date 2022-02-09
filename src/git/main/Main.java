package git.main;

import git.entidad.Persona;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenidos a nuestras versiones deon GIT");
        System.out.println("Esto es otro cambio en el proyecto");
        Persona p = new Persona("Steve Rogers", 45);
        System.out.println(p);
    }

}
