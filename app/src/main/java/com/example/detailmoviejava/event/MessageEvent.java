package com.example.detailmoviejava.event;

import com.example.detailmoviejava.model.Movie;

public class MessageEvent {
    public static class MovieEvent {
        private Movie movie;
        public MovieEvent(Movie movie) {
            this.movie = movie;
        }
        public Movie getMovie() {
            return movie;
        }
        public void setMovie(Movie movie) {
            this.movie = movie;
        }
    }
}
