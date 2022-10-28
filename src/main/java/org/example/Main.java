package org.example;

import clases.Empleado;

public class Main {

    public static void main(String[] args) {

        //crear un objeto de la clase que yo programe
        //debo crear un objeto de esa clase

        //un objeto es una variable que no es primitiva
        Empleado objeto=new Empleado() ;


        System.out.println(objeto.nombres);


        objeto.saludar();
    }
}