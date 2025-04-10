package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {

    int temporadas;
    int espidios;
    int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEspidios() {
        return espidios;
    }

    public void setEspidios(int espidios) {
        this.espidios = espidios;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
