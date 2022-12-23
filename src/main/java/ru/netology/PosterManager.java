package ru.netology;

public class PosterManager { // репозиторий в данном случае вместе с менеджером

    private Films[] myFilms = new Films[0];
    private int limit;

    PosterManager() { // конструктор по умолчанию
        limit = 10;
    }

    PosterManager(int newLimit) { //конструктор с заданием лимита
        limit = newLimit;
    }

    public void addFilm(Films film) { //Добавление в ленту нового фильма
        Films[] tmp = new Films[myFilms.length + 1];
        for (int i = 0; i < myFilms.length; i++) {
            tmp[i] = myFilms[i];
        }
        tmp[tmp.length - 1] = film;
        myFilms = tmp;
    }

    public Films[] findAll() { //Вывод всех фильмов в порядке добавления
        return myFilms;
    }

    public Films[] findLast() { //Вывод максимального лимита последних добавленных фильмов в обратном от добавления порядке
        Films[] all = myFilms;
        int resultLength = 0;
        if (limit > all.length) {
            resultLength = all.length;
        } else {
            resultLength = limit;
        }
        Films[] reversed = new Films[resultLength];

        for (int i = 0; i < resultLength; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;

    }

}

