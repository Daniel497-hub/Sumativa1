package com.example.tarjeta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Nuevo(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
@Preview(
    showSystemUi = false
)
fun Nuevo(modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){


        Logo()
        Row{

            Text(
                "Programacion Android",
                fontSize = 35.sp
            )


        }

        Text(
            "Daniel Alejandro",
            fontSize=25.sp
        )

        Logo2()
        Row    {
            Text("+56975774966",
                fontSize=20.sp
            )
        }
        Logo3()
        Row {
            Text("dquispe255@gmail.com",
                fontSize=20.sp
            )
        }
        Logo4()
        Row {
            Text("dquispe5@santotomas.cl",
                fontSize=20.sp
            )
        }
    }

}





@Composable
fun Logo(){
    val imagen = painterResource(R.drawable.android)
    Image(imagen, null)
}

@Composable
fun Logo2(){
    val imagen= painterResource(R.drawable.celular)
    Image(imagen,null)
}

@Composable
fun Logo3(){
    val imagen= painterResource(R.drawable.correo)
    Image(imagen,null)
}


@Composable
fun Logo4(){
    val imagen= painterResource(R.drawable.correo2)
    Image(imagen,null)
}