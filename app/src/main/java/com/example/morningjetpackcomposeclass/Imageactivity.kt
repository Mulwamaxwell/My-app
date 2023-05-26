package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetPackComposeclassTheme

class Imageactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            image()
        }
    }
}

@Composable
fun image(){
   Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top) {
       Text(text = "Bmw", color = Color.Gray, fontSize = 30.sp )
       Image(painter = painterResource(id = R.drawable.first), contentDescription = "BMW" )
       
       Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
           Text(text = "Ferrari", color = Color.Gray, fontSize = 30.sp, fontStyle = FontStyle.Italic)
           Image(painter = painterResource(id = R.drawable.second), contentDescription =  "Ferrari")
           
       }

   }
}

@Preview(showBackground = true)
@Composable
fun imagepreview(){
    image()
}