package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?limit=5&sortField=votes.kp&sortType=-1&rating.kp=7-10&token=1PFJBDQ-CJH4ZT8-PZGZRN8-E1QP4DD")
    Single<MovieResponse> loadMovies(@Query("page") int page);
}
