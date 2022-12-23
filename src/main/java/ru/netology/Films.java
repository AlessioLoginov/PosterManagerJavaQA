package ru.netology;

public class Films { //data-класс фильмы
    private int filmId;
    private String filmName;

    public Films(int filmId, String filmName) { //конструктор
        this.filmId = filmId;
        this.filmName = filmName;
    }

    public int getFilmId() {
        return filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }
}


