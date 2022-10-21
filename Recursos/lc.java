package Recursos;/*package instruccion de java para crear paquetes 
                 + la carpeta donde esta guardado el documento de java*/

public class lc {/* clase limpiar pantalla abreviada en lc */

    public void lp() {/* recurso de la clase lp abreviado en lc */

        try {/* declaramos try mas informacion en bucles */

            /* iniciamos con new proceso interno y las extenciones */
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {/* cierra el proceso */
            /* No hacer nada */
        }
    }
}
