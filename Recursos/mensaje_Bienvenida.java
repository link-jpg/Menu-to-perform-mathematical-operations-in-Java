package Recursos;

import java.util.Scanner;
import Recursos.variables;

public class mensaje_Bienvenida {
    Scanner entrada = new Scanner(System.in);
    variables v = new variables();

    public void musu() {
        System.out.println("Iniciando Programa Ingrese Un Nombre");
        v.usuario = entrada.next();
    }

    public void mb() {
        System.out.println("Bienvenido Usuario " + v.usuario);
        System.out.println("El Programa Cuenta Actualmete Con Las Siguientes Opciones"
                + "\n1.Suma" + "\n2.Multiplicacion" + "\n3.Resta"
                + "\n4.Division" + "\n5.Mayor o menor" + "\n6.Saber si un numero es par");
    }
}
