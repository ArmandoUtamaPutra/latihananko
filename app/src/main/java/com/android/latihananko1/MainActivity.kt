package com.android.latihananko1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() ,AnkoLogger{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            val username = et_username.text.toString().trim()
            val password = et_password.text.toString().trim()

        }
        tv_ca.setOnClickListener {
            toast("pindah kehalaman Login")

        }

    }
    private fun handlelLogin(username : String, password :String){
        info { "data username : $username , data password : $password" } //log.i jika ditulis dijava
        if (username.equals("test") && password.equals("test123")){
            toast("welcome aboard $username")
        }else{
            alert (title= "warning", message = "passwrod atau username salah"){
                positiveButton(buttonText = "ok"){
                    //
                }
                isCancelable = false
            }.show()
        }

    }
}



