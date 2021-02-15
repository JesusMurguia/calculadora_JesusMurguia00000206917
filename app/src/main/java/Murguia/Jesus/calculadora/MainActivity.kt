package Murguia.Jesus.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var num1:String =""
    var num2:String =""
    var primerNumero=false
    var segundoNumero=false
    var res:Float =0.0f
    var str:String=""
    var operacion:String="nada"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado: TextView = findViewById(R.id.tvResultado)
        val tvInput:TextView=findViewById(R.id.tvInput)

        val btnCero:Button=findViewById(R.id.btnCero)
        val btnUno:Button=findViewById(R.id.btnUno)
        val btnDos:Button=findViewById(R.id.btnDos)
        val btnTres:Button=findViewById(R.id.btnTres)
        val btnCuatro:Button=findViewById(R.id.btnCuatro)
        val btnCinco:Button=findViewById(R.id.btnCinco)
        val btnSeis:Button=findViewById(R.id.btnSeis)
        val btnSiete:Button=findViewById(R.id.btnSiete)
        val btnOcho:Button=findViewById(R.id.btnOcho)
        val btnNueve:Button=findViewById(R.id.btnNueve)
        val btnResult:Button=findViewById(R.id.btnResultado)
        val btnBorrar:Button=findViewById(R.id.btnBorrar)
        val btnDividir:Button=findViewById(R.id.btnDivision)
        val btnSumar:Button=findViewById(R.id.btnSumar)
        val btnMultiplicar:Button=findViewById(R.id.btnMultiplicar)
        val btnRestar:Button=findViewById(R.id.btnRestar)

        btnCero.setOnClickListener {
            if(!primerNumero) {
                num1+="0"
                tvInput.setText(num1)
            }
            else {num2+="0"
            tvInput.setText(str+num2)
            }
        }
        btnUno.setOnClickListener {
            if(!primerNumero) {
                num1+="1"
                tvInput.setText(num1)
            }
            else {num2+="1"
                tvInput.setText(str+num2)
            }
        }
        btnDos.setOnClickListener {
            if(!primerNumero) {
                num1+="2"
                tvInput.setText(num1)
            }
            else {num2+="2"
                tvInput.setText(str+num2)
            }
        }
        btnTres.setOnClickListener {
            if(!primerNumero) {
                num1+="3"
                tvInput.setText(num1)
            }
            else {num2+="3"
                tvInput.setText(str+num2)
            }
        }
        btnCuatro.setOnClickListener {
            if(!primerNumero) {
                num1+="4"
                tvInput.setText(num1)
            }
            else {num2+="4"
                tvInput.setText(str+num2)
            }
        }
        btnCinco.setOnClickListener {
            if(!primerNumero) {
                num1+="5"
                tvInput.setText(num1)
            }
            else {num2+="5"
                tvInput.setText(str+num2)
            }
        }
        btnSeis.setOnClickListener {
            if(!primerNumero) {
                num1+="6"
                tvInput.setText(num1)
            }
            else {num2+="6"
                tvInput.setText(str+num2)
            }
        }
        btnSiete.setOnClickListener {
            if(!primerNumero) {
                num1+="7"
                tvInput.setText(num1)
            }
            else {num2+="7"
                tvInput.setText(str+num2)
            }
        }
        btnOcho.setOnClickListener {
            if(!primerNumero) {
                num1+="8"
                tvInput.setText(num1)
            }
            else {num2+="8"
                tvInput.setText(str+num2)
            }
        }
        btnNueve.setOnClickListener {
            if(!primerNumero) {
                num1+="9"
                tvInput.setText(num1)
            }
            else {num2+="9"
                tvInput.setText(str+num2)
            }
        }
        btnSumar.setOnClickListener {
            if(!primerNumero){
                primerNumero=true
                str=num1+"+"
                tvInput.setText(str)
                operacion="suma"
            }
        }
        btnRestar.setOnClickListener {
            if(!primerNumero){
                primerNumero=true
                str=num1+"-"
                tvInput.setText(str)
                operacion="resta"
            }
        }
        btnMultiplicar.setOnClickListener {
            if(!primerNumero){
                primerNumero=true
                str=num1+"*"
                tvInput.setText(str)
                operacion="multiplicacion"
            }
        }
        btnDividir.setOnClickListener {
            if(!primerNumero){
                str=num1+"/"
                primerNumero=true
                tvInput.setText(str)
                operacion="division"
            }
        }

        btnBorrar.setOnClickListener {
            tvInput.setText("")
            tvResultado.setText("")
            operacion="nada"
            res=0.0f
            str=""
            num1=""
            num2=""
            primerNumero=false
            segundoNumero=false

        }
        btnResult.setOnClickListener {
            if(primerNumero){
                when(operacion){
                    "suma" -> res=(num1.toInt()+num2.toInt()).toFloat()
                    "resta" -> res=(num1.toInt()-num2.toInt()).toFloat()
                    "division" -> res=(num1.toInt()/num2.toInt()).toFloat()
                    "multiplicacion" -> res=(num1.toInt()*num2.toInt()).toFloat()
                }
                tvResultado.setText(str+num2+"="+res.toString())
                tvInput.setText("")
                num1=""
                num2=""
                operacion="nada"
                res=0.0f
                str=""
                primerNumero=false
                segundoNumero=false
            }
        }
    }
}