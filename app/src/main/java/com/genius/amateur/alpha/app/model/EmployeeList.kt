package com.genius.amateur.alpha.app.model

import com.google.gson.annotations.SerializedName

data class EmployeeList(
    @SerializedName("status")
    val status: String,

    @SerializedName("data")
    var list: List<Employee> = mutableListOf()
)


data class Employee(
    @SerializedName("id")
    val id: String,

    @SerializedName("profile_image")
    var profileImage: String? = null,

    @SerializedName("employee_name")
    val name: String? = null,

    @SerializedName("employee_salary")
    val salary: String? = null,

    @SerializedName("employee_age")
    val age: String? = null
)
