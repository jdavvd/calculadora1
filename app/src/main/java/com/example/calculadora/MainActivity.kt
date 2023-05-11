package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edtNumero1 : EditText
    lateinit var edtNumero2 : EditText
    lateinit var btnDividir1 : Button
    lateinit var btnSumar : Button
    lateinit var btnRestar : Button
    lateinit var btnMultiplicar : Button
    lateinit var txtResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumero1 = findViewById(R.id.edtNumero1)
        edtNumero2 = findViewById(R.id.edtNumero2)
        btnDividir1 = findViewById(R.id.btnDividir)
        btnSumar = findViewById(R.id.btnSumar)
        btnRestar = findViewById(R.id.btnRestar)
        btnMultiplicar = findViewById(R.id.btnMultiplicar)
        txtResultado = findViewById(R.id.txtResultado)

        btnDividir1.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())

            txtResultado.setText("Resultado: " + dividir(num1, num2))

        })
        btnMultiplicar.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())


            txtResultado.setText("Resultado: " + multiplicar(num1, num2))

        })
        btnSumar.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())


            txtResultado.setText("Resultado: " + sumar(num1, num2))

        })
        btnRestar.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())


            txtResultado.setText("Resultado: " + restar(num1, num2))

        })
    }

    fun dividir(numero1: Int, numero2: Int) : Int{
        return numero1 / numero2
    }

    fun multiplicar(numero1: Int, numero2: Int) : Int{
        return numero1 * numero2
    }

    fun sumar(numero1: Int, numero2: Int) : Int{
        return numero1 + numero2
    }

    fun restar(numero1: Int, numero2: Int) : Int{
        return numero1 - numero2
    }
}