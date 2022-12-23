package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class PosterManagerTest {
    Films myFilm1 = new Films(1, "Бладшот");
    Films myFilm2 = new Films(2, "Вперёд");
    Films myFilm3 = new Films(3, "Отель «Белград»");
    Films myFilm4 = new Films(4, "Джентльмены");
    Films myFilm5 = new Films(5, "Человек-невидимка");
    Films myFilm6 = new Films(6, "Тролли. Мировой тур");
    Films myFilm7 = new Films(7, "Номер один");
    Films myFilm8 = new Films(8, "Матрица");
    Films myFilm9 = new Films(9, "Рембо");
    Films myFilm10 = new Films(10, "Робот полицейский");
    Films myFilm11 = new Films(11, "Доспехи бога");
    Films myFilm12 = new Films(12, "Красная жара");

    @Test

    public void testAddFilm() { //тест добавления фильмов
        PosterManager myFilms = new PosterManager();
        myFilms.addFilm(myFilm1);
        myFilms.addFilm(myFilm4);
        myFilms.addFilm(myFilm5);
        myFilms.addFilm(myFilm3);
        Films[] expected = {myFilm1, myFilm4, myFilm5, myFilm3};
        Films[] actual = myFilms.findAll();
        Assertions.assertArrayEquals (expected, actual);

    }


    @Test
    //
    public void testFindLastLimitLessCounts() { //тест вывода фильмов в обратном порядке, когда лимит меньше числа фильмов
        PosterManager myFilms = new PosterManager(5);
        myFilms.addFilm(myFilm1);
        myFilms.addFilm(myFilm2);
        myFilms.addFilm(myFilm3);
        myFilms.addFilm(myFilm4);
        myFilms.addFilm(myFilm5);
        myFilms.addFilm(myFilm6);
        myFilms.addFilm(myFilm7);
        myFilms.addFilm(myFilm8);
        Films[] expected = {myFilm8, myFilm7, myFilm6, myFilm5, myFilm4};
        Films[] actual = myFilms.findLast();
        Assertions.assertArrayEquals (expected, actual);

    }

    @Test
    //
    public void testFindLastLimitMoreCounts() { //тест вывода фильмов в обратном порядке, когда лимит больше числа фильмов
        PosterManager myFilms = new PosterManager(5);
        myFilms.addFilm(myFilm1);
        myFilms.addFilm(myFilm2);
        myFilms.addFilm(myFilm3);
        Films[] expected = {myFilm3, myFilm2, myFilm1};
        Films[] actual = myFilms.findLast();
        Assertions.assertArrayEquals (expected, actual);

    }

    @Test
    //
    public void testFindLastLimitIsCounts() { //тест вывода фильмов в обратном порядке, когда лимит равен числу фильмов
        PosterManager myFilms = new PosterManager(5);
        myFilms.addFilm(myFilm1);
        myFilms.addFilm(myFilm2);
        myFilms.addFilm(myFilm3);
        myFilms.addFilm(myFilm4);
        myFilms.addFilm(myFilm5);
        Films[] expected = {myFilm5, myFilm4, myFilm3, myFilm2, myFilm1};
        Films[] actual = myFilms.findLast();
        Assertions.assertArrayEquals (expected, actual);
    }

    @Test
    //
    public void testFindLastNoLimit() { //тест вывода фильмов в обратном порядке с лимитом по умолчанию
        PosterManager myFilms = new PosterManager();
        myFilms.addFilm(myFilm1);
        myFilms.addFilm(myFilm2);
        myFilms.addFilm(myFilm3);
        myFilms.addFilm(myFilm4);
        myFilms.addFilm(myFilm5);
        Films[] expected = {myFilm5, myFilm4, myFilm3, myFilm2, myFilm1};
        Films[] actual = myFilms.findLast();
        Assertions.assertArrayEquals (expected, actual);
    }

}
