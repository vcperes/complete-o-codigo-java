package br.com.felixgilioli.exercicios.medio;

import java.util.Locale;
import java.util.regex.Matcher;

/**
 * Classe com métodos para trabalhar com Strings.
 */
public class Strings {

    private Strings() {}

    /**
     * Deve retornar a quantidade de letras maiúsculas que a string {@param str} contém.
     * @param str string.
     * @return inteiro informando a quantidade de letras maiúsculas.
     */
    public static int getQuantidadeLetrasMaiusculas(String str) {
        int quantMaisculas = 0;
        if(str==null){
            return 0;
        }
        String stringMaiuscula = str.toUpperCase(Locale.ROOT);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == stringMaiuscula.charAt(i) & str.charAt(i) != ' ') {
                quantMaisculas++;
            }
        }
        return quantMaisculas;
    }
        /**
         * Deve retornar a quantidade de letras minúsculas que a string {@param str} contém.
         * @param str string.
         * @return inteiro informando a quantidade de letras minúsculas.
         */
        public static int getQuantidadeLetrasMinusculas(String str) {
            int quantMinusculas = 0;
            if(str==null){
                return 0;
            }
            String stringMinuscula = str.toLowerCase(Locale.ROOT);

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == stringMinuscula.charAt(i) & str.charAt(i) != ' ') {
                    quantMinusculas++;
                }
            }
            return quantMinusculas;
        }

        /**
         * Deve retornar a quantidade de caracteres especiais(*, #, @, !, etc) que a string {@param str} contém.
         * @param str string.
         * @return inteiro informando a quantidade de caracteres especiais.
         */
        public static int getQuantidadeCaracteresEspeciais(String str) {
            int quant=0;
            if(str.contains("usar expressao regular")){
                quant++;
            }
            return quant;
        }

    }
