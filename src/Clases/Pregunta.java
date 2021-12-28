package Clases;

import vistas.FramePreguntas;


public class Pregunta {

    String[] nivel1 = {                                                                                     //Se crean Arrays con preguntas, la pregunta es segun el nivel
        "¿Qué palabra aparece tradicionalmente en la pantalla al terminar un largometraje?", 
        "¿Cuál de los siguientes sería atraído por un imán?",
        "¿Cuál es el lugar de origen del whisky escocés?",
        "En un restaurante, si alguien \"invita\", ¿qué hace?",
        "Si alguien pide ver tu identificación, ¿qué puedes mostrarle?"
        
    };
    
    String[] nivel2 = {
        "¿Cuándo acabó la II Guerra Mundial?", 
        "¿Cuál es el país más grande del mundo?",
        "Si 50 es el 100%, ¿cuánto es el 90%?",
        "¿Qué país tiene forma de bota?",
        "¿En qué lugar del cuerpo se produce la insulina?"
        
    };
    
    String[] nivel3 = {
        "¿Cuál fue el primer metal que empleó el hombre?", 
        "¿Cómo se le llama a una colección de revistas, diarios y publicaciones periódicas?",
        "¿Cuál es el único mamífero capaz de volar?",
        "¿Cuál es el libro sagrado del Islam?",
        "¿Qué era el Concorde?"
        
    };
    
    String[] nivel4 = {
        "La campana de Gauss está asociada a…", 
        "¿Cuál es el metal más caro del mundo?",
        "¿Cuál es el animal que tiene mayor facilidad para repetir las frases y palabras que escucha?",
        "¿Dónde se celebraron los Juegos Olímpicos del año 1992?",
        "¿Quién compuso la mítica canción \"Knockin’ on Heaven’s Door\"?"
        
    };
    
    String[] nivel5 = {
        "¿Cuál es el lago más profundo del mundo?", 
        "¿Quién era el Dios Vikingo de la Luz y la verdad?",
        "¿En qué año se estrenó Metrópolis, el clásico de la ciencia ficción de Fritz Lang?",
        "¿En qué ciudad ucraniana ocurrió un desastre nuclear?",
        "¿Cuánto duró “La Guerra de los Cien Años”?"
        
    };
    

    public String getPregunta(int posicion) {                                               //Se retorna segun el nivel en el que se encuentre el usuario
        
        switch (FramePreguntas.nivel) {
            case 1:
                return nivel1[posicion];
            case 2:
                return nivel2[posicion];
            case 3:
                return nivel3[posicion];
            case 4:
                return nivel4[posicion];
            case 5:
                return nivel5[posicion];
            default:
                throw new AssertionError();
        }
        

    }
}
