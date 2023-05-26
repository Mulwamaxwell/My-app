package com.example.morningjetpackcomposeclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetPackComposeclassTheme

class cardactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycard()

        }
    }
}

@Composable
fun mycard(){
    var scrollState= rememberScrollState()
    Column(modifier = Modifier.fillMaxSize().verticalScroll(scrollState), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Cars", modifier = Modifier.padding(10.dp), fontSize = 30.sp, fontWeight = FontWeight.Bold)

      Card( modifier = Modifier
          .background(color = Color.Gray)
          .padding(10.dp)) {
          Column(modifier = Modifier.padding(10.dp)) {
              Text(text = " Mercedes")
              Image(painter = painterResource(id = R.drawable.max), contentDescription = "dog",
              modifier = Modifier
                  .clip(shape = CircleShape)
                  .size(width = 50.dp, height = 50.dp))

          }

      }

Spacer(modifier = Modifier.height(20.dp))
        Card( modifier = Modifier
            .background(color = Color.Gray)
            .padding(10.dp)) {
            Column(modifier = Modifier.padding(10.dp)) {
                Text(text = "Dog")
                Image(painter = painterResource(id = R.drawable.max), contentDescription = "dog",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(width = 50.dp, height = 50.dp))

            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        Card( modifier = Modifier
            .background(color = Color.Gray)
            .padding(10.dp)) {
            Column(modifier = Modifier.padding(10.dp)) {
                Text(text = "Dog")
                Image(painter = painterResource(id = R.drawable.max), contentDescription = "dog",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(width = 50.dp, height = 50.dp))

            }

        }
        
    }
    
}

@Preview(showBackground = true)
@Composable
fun mycardpreview(){
    mycard()
}
