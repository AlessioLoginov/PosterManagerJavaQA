package ru.netology;

public class PosterManager { // теперь тут только менеджер

    private Repository repo;
    private int limit;

    PosterManager(Repository repo) { // конструктор по умолчанию
        limit = 10;
        this.repo = repo;
    }

    PosterManager(int newLimit,Repository repo) { //конструктор с заданием лимита
        this.limit = newLimit;
        this.repo = repo;
    }

    public void addFilm(Films film) { //Добавление в ленту нового фильма
        repo.save(film);
    }

    public Films[] findAll() { //Вывод всех фильмов в порядке добавления
        return repo.findAll();
    }

    public Films[] findLast() { //Вывод максимального лимита последних добавленных фильмов в обратном от добавления порядке
        Films[] all = repo.findAll();
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


