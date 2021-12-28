package Clases;

import java.util.StringTokenizer;
import vistas.FramePreguntas;

public class Respuesta {
    
    
    
    String[] respuestasnvl1 = {                                         //Se crean Arrays con las respuestas correctas para validar
        "Fin","Metal","Escocia","Paga la cuenta","La cedula"
    };
    
    String[] respuestasnvl2 = {
        "1945","Rusia","45","Italia","Páncreas"
    };
    
    String[] respuestasnvl3 = {
        "Cobre","Hemeroteca","Murciélago","Corán","Un avión"
    };
    
    String[] respuestasnvl4 = {
        "Cálculo de probabilidades","Rodio","Cuervos","Barcelona","Bob Dyla"
    };
    
    String[] respuestasnvl5 = {
        "Lago Baikal","Balder","1927","Prípiat","116"
    };
    
    
    
    String[] radioRnvl1 = {                                                     //Se crean las posibles opciones
        "Fin,Conclusión,Final,Acabó",
        "Plástico,Metal,Madera,Aluminio",
        "Irlanda,Gales,Estados Unidos,Escocia",
        "Paga la cuenta,Besa la cuenta,Rompe la cuenta,Espera tener \"Suerte\"",
        "La lengua,La salida,Los dientes,La cedula"
        
    };
    
    String[] radioRnvl2 = {
        "1945,1982,1950,1922",
        "China,Japón,Alemania,Rusia",
        "45,48,49,46.5",
        "Alemania,Rusia,Italia,Corea",
        "Riñones,Hígado,páncreas,Ninguna de las anteriores"
        
    };
    String[] radioRnvl3 = {
        "Oro,Plata,Cobre,Estaño",
        "Hemeroteca,Coleccionistas,Acumulador,Todas las anteriores",
        "Luciérnaga,Búho,Águila,Murciélago",
        "Corán,Antiguo testamento,Nuevo testamento,Todas las anteriores",
        "Un turista,Un avión,País,Ave"
        
    };
    String[] radioRnvl4 = {
        "Multiplicación,Cálculo vectorial,Sustracción Básica,Cálculo de probabilidades",
        "Oro,Plata,Rubí,Rodio",
        "Loros,Cuervos,Canarios,Ninguna de las anteriores",
        "Madrid,Barcelona,Sao Paulo,Río de Janeiro",
        "Bob Dylan,Paul McCartney,Kurt Cobain,Ulán Bator"
        
    };
    
    String[] radioRnvl5 = {
        "Lago Baikal,Lago Titicaca,Lago Victoria,Ninguna de las anteriores",
        "Forseti,Zeus,Balder,Andhrimnir",
        "1924,1931,1927,1923",
        "Kiev,Prípiat,Odesa,Járkov",
        "100,116,98,Ninguna de las anteriores"
        
    };
    
    
    
    
    public String getRespuestas(int posicion) {                                 //Se envian la respuesta segun la posicion
        switch (FramePreguntas.nivel) {
            case 1:
                return respuestasnvl1[posicion];
            case 2:
                return respuestasnvl2[posicion];
            case 3:
                return respuestasnvl3[posicion];
            case 4:
                return respuestasnvl4[posicion];
            case 5:
                return respuestasnvl5[posicion];
            default:
                throw new AssertionError();
        }
        

    }
    
    public String[] separar(String cadena, String separador){                       //Se utiliza para separar las cadenas y pode rasignarlas a los buttongroup
        StringTokenizer token = new StringTokenizer(cadena, separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreElements()){
            a[i] = token.nextToken();
            i++;
        }
        return a;
    }
    
    public String[] setRespuestas(int posicion) {                               //Envia posibles respuestas Segun el nivel
        
        switch (FramePreguntas.nivel) {
            case 1:
                String s1 = radioRnvl1[posicion];
                String[] s2 = separar(s1, ",");
                return s2;
            case 2:
                String s3 = radioRnvl2[posicion];
                String[] s4 = separar(s3, ",");
                return s4;
            case 3:
                String s5 = radioRnvl3[posicion];
                String[] s6 = separar(s5, ",");
                return s6;
            case 4:
                String s7 = radioRnvl4[posicion];
                String[] s8 = separar(s7, ",");
                return s8;
            case 5:
                String s9 = radioRnvl5[posicion];
                String[] s10 = separar(s9, ",");
                return s10;
            default:
                throw new AssertionError();
        }
        

    }
    
}
