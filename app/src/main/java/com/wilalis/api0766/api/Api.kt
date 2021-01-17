package com.wilalis.api0766.api

import com.wilalis.api0766.data.model.DetailUserResponse
import com.wilalis.api0766.data.model.User
import com.wilalis.api0766.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 57eeb347a14db3afd6a6e7d077d1c2787f614f14")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 57eeb347a14db3afd6a6e7d077d1c2787f614f14")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 57eeb347a14db3afd6a6e7d077d1c2787f614f14")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 57eeb347a14db3afd6a6e7d077d1c2787f614f14")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}