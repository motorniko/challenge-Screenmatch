package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {

    int temporadas;
    int espidios;
    int minutosPorEpisodio;
    int duraciontotal;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEspidios() {
        return espidios;
    }

    public void setEspisodios(int espisodios) {
        this.espidios = espisodios;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getDuraciontotal() {
        return duraciontotal;
    }

    public void setDuraciontotal(int duraciontotal) {
        this.duraciontotal = duraciontotal;
    }
}
