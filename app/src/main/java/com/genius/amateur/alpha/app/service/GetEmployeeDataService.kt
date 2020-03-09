package com.genius.amateur.alpha.app.service

import com.genius.amateur.alpha.app.model.EmployeeList
import retrofit2.Call
import retrofit2.http.GET

interface GetEmployeeDataService {

    @GET("api/v1/employees")
    fun getEmployeeList() : Call<EmployeeList>
}