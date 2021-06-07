package com.Laidi_arar.S04_exo3.data.repository

import com.Laidi_arar.S04_exo3.data.network.Api
import com.Laidi_arar.S04_exo3.data.network.SafeApiRequest

class TaskRepository (
    private val api : Api
) : SafeApiRequest(){

    suspend fun getAll() = apiRequest { api.getAll() }

}