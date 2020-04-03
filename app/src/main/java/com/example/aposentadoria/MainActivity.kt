package com.example.aposentadoria

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //definindo o arquivo de layout
        setContentView(R.layout.activity_main)
        //acessando o spinner

        val spn_sexo = findViewById<Spinner>(R.id.spn_sexo)
        //acessando a caixa de idade
        spn_sexo.adapter = ArrayAdapter<String>(this,
            android.R.layout.simple_spinner_dropdown_item,
            listOf("masculino", "feminino"))


        val txt_idade = findViewById<EditText>(R.id.txt_idade)
        //acessando o botão de calcular

        val txt_resultado = findViewById<TextView>(R.id.txt_resultado)

        val btn_calcular = findViewById<Button>(R.id.btn_calcular)

        btn_calcular.setOnClickListener {
            //aqui vai o código que será executado quando houver um click do botão

            val sexo = spn_sexo.selectedItem as String

            val idade = txt_idade.text.toString().toInt()

            var resultado = 0

            if(sexo == "masculino"){
                resultado = 65 - idade
            }else{
                resultado = 60 - idade
            }
            //Atualizando a tela de acordo com o resultado do cálculo
            txt_resultado.text = "Faltam $resultado anos para você se aposentar."
        }


    }
}
