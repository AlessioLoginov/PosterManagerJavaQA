package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class PosterManagerTest {

    Repository repo = Mockito.mock(Repository.class);
    PosterManager manager = new PosterManager(repo);

    Films myFilm1 = new Films(1, "Матрица");
    Films myFilm2 = new Films(2, "Рэмбо. Первая кровь");
    Films myFilm3 = new Films(3, "Трое из Простоквашино");
    Films myFilm4 = new Films(4, "История О");
    Films myFilm5 = new Films(5, "Не время умирать");
    Films myFilm6 = new Films(6, "Восемь с половиной");

    @Test
    public void shouldFindLast() {
        Films[] myFilms = {myFilm1, myFilm2, myFilm3};
        doReturn(myFilms).when(repo).findAll();

        Films[] expected = {myFilm3, myFilm2, myFilm1};
        Films[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        Films[] myFilms = {myFilm1, myFilm2, myFilm3, myFilm4, myFilm5};
        doReturn(myFilms).when(repo).findAll();

        Films[] expected = {myFilm1, myFilm2, myFilm3, myFilm4, myFilm5};
        Films[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


}
