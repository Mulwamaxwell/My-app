package com.example.morningjetpackcomposeclass

import android.content.Intent
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
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetPackComposeclassTheme

class CardAssignment : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            card2()

        }
    }
}

@Composable
fun card2(){
    var scrollState= rememberScrollState()
    var mContext= LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollState), horizontalAlignment = Alignment.CenterHorizontally) {
        Card(modifier = Modifier
            .padding(10.dp)
            .background(color = Color.White)) {
            Column() {
                Image(painter = painterResource(id = R.drawable.max1), contentDescription = "Mercedes1", modifier = Modifier
                    .size(width = 100.dp, height = 100.dp) )

            }

        }
        Card(modifier = Modifier
            .padding(10.dp)
            .background(color = Color.White)) {
            Column() {
                Image(painter = painterResource(id = R.drawable.first), contentDescription = "Mercedes1", modifier = Modifier
                    .size(width = 100.dp, height = 100.dp) )

            }

        }
        Card(modifier = Modifier
            .padding(10.dp)
            .background(color = Color.White)) {
            Column() {
                Image(painter = painterResource(id = R.drawable.max), contentDescription = "Mercedes1", modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .padding(10.dp)
                    .clip(shape = CircleShape))

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
fun card2preview(){
    card2()
}