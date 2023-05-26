package com.example.morningjetpackcomposeclass

import android.content.Intent
import android.icu.text.ListFormatter.Width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetPackComposeclassTheme

class cardAssingment2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            simpson()
        }
    }
}

@Composable
fun simpson(){
    var scrollState= rememberScrollState()
    var mContext= LocalContext.current
    Column(modifier = Modifier.fillMaxSize().verticalScroll(scrollState)) {
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.rick), contentDescription = "rick", modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .absolutePadding(0.dp, 0.dp, 10.dp, 0.dp))
                Column(modifier = Modifier.padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Rick", fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier)
                    Text(text = "Human", fontWeight = FontWeight.Light)
                    Text(text = "Alive", fontWeight = FontWeight.Light)

                }

                
            }
            
        }
        Spacer(modifier = Modifier.height(30.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.morty), contentDescription = "rick", modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .absolutePadding(0.dp, 0.dp, 10.dp, 0.dp))
                Column(modifier = Modifier.padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Morty", fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier)
                    Text(text = "Human", fontWeight = FontWeight.Light)
                    Text(text = "Alive", fontWeight = FontWeight.Light)

                }


            }

        }
        Spacer(modifier = Modifier.height(30.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.morty2), contentDescription = "rick", modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .absolutePadding(0.dp, 0.dp, 10.dp, 0.dp))
                Column(modifier = Modifier.padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Merlin", fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier)
                    Text(text = "Human", fontWeight = FontWeight.Light)
                    Text(text = "Alive", fontWeight = FontWeight.Light)

                }


            }

        }
        Spacer(modifier = Modifier.height(30.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.rick2), contentDescription = "rick", modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .absolutePadding(0.dp, 0.dp, 10.dp, 0.dp))
                Column(modifier = Modifier.padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Harlan", fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier)
                    Text(text = "Human", fontWeight = FontWeight.Light)
                    Text(text = "Alive", fontWeight = FontWeight.Light)

                }


            }

        }
        Spacer(modifier = Modifier.height(30.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.mission), contentDescription = "rick", modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .absolutePadding(0.dp, 0.dp, 10.dp, 0.dp))
                Column(modifier = Modifier.padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Rick And Morty", fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier)
                    Text(text = "Humans", fontWeight = FontWeight.Light)
                    Text(text = "Alive", fontWeight = FontWeight.Light)

                }


            }

        }
        Spacer(modifier = Modifier.height(30.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.family), contentDescription = "rick", modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .absolutePadding(0.dp, 0.dp, 10.dp, 0.dp))
                Column(modifier = Modifier.padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Family", fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier)
                    Text(text = "Humans", fontWeight = FontWeight.Light)
                    Text(text = "Alive", fontWeight = FontWeight.Light)

                }


            }

        }
        Spacer(modifier = Modifier.height(30.dp))
        Card(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(id = R.drawable.morty2), contentDescription = "rick", modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .absolutePadding(0.dp, 0.dp, 10.dp, 0.dp))
                Column(modifier = Modifier.padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Morty", fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier)
                    Text(text = "Human", fontWeight = FontWeight.Light)
                    Text(text = "Alive", fontWeight = FontWeight.Light)

                }


            }

        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { mContext.startActivity(Intent(mContext,MainActivity::class.java)) }) {
            Text(text = "Main")

        }


    }
    
}

@Preview(showBackground = true)
@Composable
fun simpsonpreview(){
    simpson()
}