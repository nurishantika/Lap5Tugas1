package com.example.tugasmodul5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugasmodul5.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Data> ()
    val listUsers = arrayOf(
        "Taeil",
        "Johnny",
        "Taeyong",
        "Yuta",
        "Kun",
        "Doyoung",
        "Ten",
        "Jaehyun",
        "Winwin",
        "Jungwoo",
        "Lucas",
        "Mark",
        "Xiaojun",
        "Hendery",
        "Renjun",
        "Jeno",
        "Haechan",
        "Jaemin",
        "Yangyang",
        "Chenle",
        "Jisung",
        "Shotaro",
        "Sungchan"
    )
    val NCT = arrayOf("NCT"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RecyclerView.setHasFixedSize (true)
        RecyclerView.layoutManager = LinearLayoutManager(this)
        for (i in 0 until listUsers.size) {
            list.add(Data(listUsers.get(i)))
            if (listUsers.size - 1 == i) {
                val adaptor = Adaptor (list)
                adaptor.notifyDataSetChanged()
                RecyclerView.adapter = adaptor
                adaptor.setOnClickListener {
                    Toast.makeText(this@MainActivity, "Hi, I'm " + listUsers[it], Toast.LENGTH_LONG).show()
                }
            }
        }
        RecyclerView.scrollToPosition(NCT.size -1)
    }
}