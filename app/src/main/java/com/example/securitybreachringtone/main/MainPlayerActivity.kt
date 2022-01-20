package com.example.securitybreachringtone.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.securitybreachringtone.R
import com.example.securitybreachringtone.databinding.ActivityMainBinding
import com.example.securitybreachringtone.databinding.ActivityMainPlayerBinding
import com.example.securitybreachringtone.main.model.MainPlayerModel

class MainPlayerActivity :AppCompatActivity(R.layout.activity_main_player){
   lateinit var binding:ActivityMainPlayerBinding
  lateinit var adapter:MainPlayerAdapter
   var list:MutableList<MainPlayerModel> = mutableListOf()

  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

       initToolbar()
        initRecyclerView()



        }

    private fun initRecyclerView() {
  adapter= MainPlayerAdapter()
     binding.mainRv.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.mainRv.adapter=adapter
        list.add(MainPlayerModel(R.drawable.experiment_imge,"Naruto Shippuden Opening 9 Lo","Naruto"))
        list.add(MainPlayerModel(R.drawable.experiment_imge,"Woolf is The good in the world","Woolf"))
   adapter.update(list)


    }

    private fun initToolbar() {
        binding.toolbarMain.setNavigationIcon(R.drawable.ic_close)
        binding.toolbarMain.title="Текущая игра"
        binding.toolbarMain.titleMarginStart=200
        binding.toolbarMain.titleMarginBottom=80
        setSupportActionBar(binding.toolbarMain)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }




}