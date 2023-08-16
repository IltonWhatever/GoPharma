package com.example.gopharma.util

import com.example.gopharma.models.Cliente
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface Endpoints {
    @POST("cliente")
    fun addCliente(@Body cliente: Cliente) : Call<Cliente>
}