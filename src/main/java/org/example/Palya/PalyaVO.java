package org.example.Palya;

import java.util.Arrays;
import java.util.Objects;

public class PalyaVO {

    private final int sorszam;
    private final int oszlopszam;
    private int[][] tabla;


    public PalyaVO(final int sorszamA, final int oszlopszamA, final int[][] tablaA) {
        this.sorszam = sorszamA;
        this.oszlopszam = oszlopszamA;
        this.tabla = tablaA;
    }

    public final int getSorszam() {
        return sorszam;
    }

    public final int getOszlopszam() {
        return oszlopszam;
    }


    public final int[][] getTabla() {
        return this.tabla;
    }

    public final void setTabla(final int[][] tablaBe) {
        this.tabla = tablaBe;
    }

    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PalyaVO palyaVO = (PalyaVO) o;
        return sorszam == palyaVO.sorszam && oszlopszam == palyaVO.oszlopszam
                && Objects.deepEquals(tabla, palyaVO.tabla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sorszam, oszlopszam, Arrays.deepHashCode(tabla));
    }

    @Override
    public String toString() {
        return "PalyaVO {"
                +
                "sorszam=" + sorszam
                +
                ", oszlopszam=" + oszlopszam
                +
                ", tabla=" + Arrays.toString(tabla)
                +
                '}';
    }
}
