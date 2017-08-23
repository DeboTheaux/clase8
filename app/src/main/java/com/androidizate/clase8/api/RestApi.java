package com.androidizate.clase8.api;

import com.androidizate.clase8.dao.Book;
import com.androidizate.clase8.dao.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by andres.oller on 23/08/17.
 */
public interface RestApi {

    @PUT("Book/{id}")
    Call<Book> putBook(@Path("id") int bookId, @Body Book book);
}
