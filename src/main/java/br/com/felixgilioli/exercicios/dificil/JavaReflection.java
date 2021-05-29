package br.com.felixgilioli.exercicios.dificil;

import java.lang.reflect.Field;
import java.util.*;

/**
 * Classe com exercícios sobre java reflection.
 */
public class JavaReflection{

    private JavaReflection() {}

    /**
     * Deve retornar o nome dos atributos do objeto {@param objeto}.
     * obs: os nomes devem ser retornados em ordem alfabetica.
     * @return lista com nome dos atributos.
     */
    public static List<String> getNomeDosAtributosDoObjeto(Object objeto) {
        try{
            List<String> atributos = new ArrayList<>();
            if(objeto.getClass() != Object.class && objeto != null) {
                Field[] reflexc = objeto.getClass().getDeclaredFields();
                for(Field field : reflexc) {
                    atributos.add(field.getName());
                }
                Collections.sort(atributos);
                return atributos;
            }
          return atributos;
        }catch(Exception e){
            return new ArrayList<>();
        }


    }




}
