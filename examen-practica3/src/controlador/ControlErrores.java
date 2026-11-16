package controlador;

import java.time.LocalDate;
import javax.print.DocFlavor;

/**
 * Clase que comprueba que los campos introducidos sean correctos
 *
 * @author alumno
 */
public class ControlErrores {

    public static boolean comprobarFormato(String matricula) {
        
        //si la matricula no tiene un a longitud de 7 
        if(!(matricula.length()==7)){
            return false;
        }
        
        //POR LA VERSION DE JAVA NO ME DEJA UTILIZAR ESTE METODO
        
        //este for comprueba si los 4 primero digitos (0-3) son numeros
        
        //for (int i = 0; i <= 3; i++) {
          //  if (!(matricula.indent(i) instanceof Integer)) {
            //    return false;
            //}
        //}
        
        //este for comprueba si las 3 ultimas son letras, en caso de que lo sean despues 
        //se convertiran a mayusculas para asegurar
        //for (int i = 4; i <= 6; i++) {
          //  if (!(matricula.charAt(i) instanceof String )) {
            //    return false;
            //}
        //}
        
        return true;
           
    }

    public static boolean comprobarFecha(LocalDate fecha) {

        if (fecha == null) {
            return false;
        }

        int año = fecha.getYear();

        if (año >= 1990 && año <= 2026) {
            return true;
        }

        return false;
    }

    public static boolean comprobarPrecio(float precio) {
        if (precio >= 0 && precio <= 150000) {
            return true;
        }

        return false;
    }

}
