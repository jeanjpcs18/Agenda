/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.utilidades;

import com.sun.xml.internal.ws.util.StringUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Programacion I 2B
 */
public class Utilidades extends StringUtils{
    
   public static String formatearFecha(Date fecha){
       String fechaSalida = "";
       try{
           SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm");
           fechaSalida = formato.format(fecha);
       }catch(Exception e){}
       
       return fechaSalida;
   } 

    public static boolean isEmpty(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

