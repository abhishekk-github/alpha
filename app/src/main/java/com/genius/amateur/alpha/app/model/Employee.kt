package com.genius.amateur.alpha.app.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class EmployeeList(@SerializedName("status") @Expose val status: String) {
    @SerializedName("data")
    @Expose
    var list: List<Employee> = mutableListOf()
}

data class Employee(@SerializedName("id") @Expose val id: String) {

    @SerializedName("profile_image")
    @Expose
    var profileImage: String? = null;
    @SerializedName("employee_name")
    @Expose
    val name: String? = null;
    @SerializedName("employee_salary")
    @Expose
    val salary: String? = null;
    @SerializedName("employee_age")
    @Expose
    val age: String? = null;
}
