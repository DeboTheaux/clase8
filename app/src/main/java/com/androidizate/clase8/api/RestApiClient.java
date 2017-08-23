package com.androidizate.clase8.api;

import com.androidizate.clase8.dao.Book;
import com.androidizate.clase8.dao.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by andres.oller on 23/08/17.
 */

public class RestApiClient implements RestApi {

    private static final String BASE_URL = "http://fakerestapi.azurewebsites.net/api/";

    @Override
    public Call<Book> putBook (int bookId, Book book) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(RestApi.class).putBook(bookId, book);
    }
}
