package com.company;

import java.util.ArrayList;

public class App {

    ArrayList<Film> films = new ArrayList<>();

    ArrayList<Film> filmsInCart = new ArrayList<>();

    public void addToFilms(Film film) {
        films.add(film);
    }

    public void addToCart(Film film) {
        filmsInCart.add(film);
    }

    public int getFilmAmount() {
        return films.size();
    }

    public int getFilmsInCartAmount() {
        return filmsInCart.size();
    }

    public void printAllFilms() {
        for (int i=0; i<films.size(); i++) {
            Film currFilm = films.get(i);
            System.out.println("--------------------------------------------------");
            System.out.println("Id: " + currFilm.getId());
            System.out.println("Name: " + currFilm.getName());
            System.out.println("Summary: " + currFilm.getSummary());
            System.out.println("Poster URL: " + currFilm.getPoster());
            System.out.println("--------------------------------------------------");
        }
    }

    public void printAllFilmsInCart() {
        for (int i=0; i<filmsInCart.size(); i++) {
            Film currFilm = filmsInCart.get(i);
            System.out.println("--------------------------------------------------");
            System.out.println("Id: " + currFilm.getId());
            System.out.println("Name: " + currFilm.getName());
            System.out.println("Summary: " + currFilm.getSummary());
            System.out.println("Poster URL: " + currFilm.getPoster());
            System.out.println("--------------------------------------------------");
        }
    }


}
