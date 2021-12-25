package com.safaa.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.safaa.notesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var noteList: ArrayList<String> = ArrayList()
    val myAdapter : RecyclerViewAdapter by lazy { RecyclerViewAdapter() }
    val databaseHelper by lazy { DatabaseHelper(applicationContext)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            addBtn.setOnClickListener {
                databaseHelper.saveData(noteET.text.toString())
                noteET.setText("")
                Toast.makeText(this@MainActivity, "Added successfully", Toast.LENGTH_LONG).show()
            }

        }



    }
}