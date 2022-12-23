package ru.netology;

public class Repository { //репозиторий фильмов

    private Films[] myFilms = new Films[0];

    public Films[] findAll() { //Вывод всех фильмов в порядке добавления
        return myFilms;
    }

    public void save(Films myFilm) { //запись фильма
        Films[] tmp = new Films[myFilms.length + 1];
        for (int i = 0; i < myFilms.length; i++) {
            tmp[i] = myFilms[i];
        }
        tmp[tmp.length - 1] = myFilm;
        myFilms = tmp;
    }

    public Films findById(int id) { //возвращает фильм по идентификатору
        Films myFilm = null;
        for (int i = 0; i < myFilms.length; i++) {
            if (myFilms[i].getFilmId() == id) {
                myFilm = myFilms[i];
                break;
            }
        }
        return myFilm;
    }

    public void RemoveById(int id) { //удаляет фильм по идентификатору
        Films[] tmp = new Films[myFilms.length - 1];
        for (int i = 0; i < myFilms.length; i++) {
            if (myFilms[i].getFilmId() != id) {
                tmp[i] = myFilms[i];
            }
        }
        myFilms = tmp;
    }

    public void RemoveAll() { //вычищает весь репозиторий
        Films[] tmp = new Films[0];
        myFilms = tmp;
    }




}
