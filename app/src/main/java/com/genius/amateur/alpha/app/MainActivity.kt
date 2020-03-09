package com.genius.amateur.alpha.app

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.genius.amateur.alpha.R
import com.genius.amateur.alpha.app.model.EmployeeList
import com.genius.amateur.alpha.app.service.GetEmployeeDataService
import com.google.android.material.snackbar.Snackbar
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var fabMessage: String

    @Inject
    lateinit var retrofit : Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, fabMessage, Snackbar.LENGTH_LONG).setAction("Action", null).show()
        }



        var employeeDataService : GetEmployeeDataService = retrofit.create(GetEmployeeDataService::class.java)
        var call : Call<EmployeeList> = employeeDataService.getEmployeeList()


        call.enqueue(object : Callback<EmployeeList>{
            override fun onFailure(call: Call<EmployeeList>, t: Throwable) {
                Log.v("Employee", "fetching failed " + t.message);
            }

            override fun onResponse(call: Call<EmployeeList>, response: Response<EmployeeList>) {
                var listOfEmployee : EmployeeList? = response.body()!!

                   if(listOfEmployee != null){
                       var list = listOfEmployee.list

                       for(e in list){
                           Log.v("Employee", e.name+"");
                       }
                   }
            }

        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
