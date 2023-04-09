package com.example.makeup;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class API {
    static class RetrofitInstance {
        private static Retrofit retrofit;
        private static String BASE_URL = "https://makeup-api.herokuapp.com/";

        public static Retrofit getRetrofit() {

            if (retrofit == null) {
                retrofit = new Retrofit
                        .Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
    }

    public interface ApiInstance {
        @GET("/api/v1/products.json")
        Call<List<Pojo>> getAll(
                @Query("product_type") String product_type
        );
    }
}
// api/v1/products.json?product_type=lipstick