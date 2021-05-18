package br.com.felixgilioli.exercicios.facil;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalUnit;

/**
 * Classe com métodos para trabalhar com objetos do tipo {@link java.time.LocalDate}.
 */
public class LocalDates {

    private LocalDates() {}

    /**
     * Deve retornar a quantidade de dias que se passaram entre as datas {@param inicio} e {@param fim}.
     * @param inicio data de início.
     * @param fim data de fim.
     * @return quantidade de dias entre as datas.
     */
    public static long getQuantidadeDeDiasEntreDatas(LocalDate inicio, LocalDate fim) {
        Period intervalo = inicio.until(fim);
        long dias= intervalo.getDays();
        int anos= intervalo.getYears();
        int meses= intervalo.getMonths();
        if(anos==0)
            anos=1;
        if(meses==0)
            meses=1;
        if(dias==0)
            dias=1;

        anos = anos * 12;
        meses = meses*30;
        return dias;
    }
}
