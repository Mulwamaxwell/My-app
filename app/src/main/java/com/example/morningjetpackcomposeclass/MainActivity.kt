package com.example.morningjetpackcomposeclass

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.morningjetpackcomposeclass.ui.theme.MorningJetPackComposeclassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            hello()
        }
    }
}

@Composable
fun hello(){
    Text(text = "Welcome to my first app",
    color = Color.Blue,
    fontSize = 30.sp,
    fontStyle = FontStyle.Italic,
    textDecoration = TextDecoration.Underline,
    modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize()
        .padding(30.dp))
    var mContext = LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = {mContext.startActivity(Intent(mContext,Imageactivity::class.java)) }
            , colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)){
            Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription ="" )
            Text(text = "Imageactivity")
            
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {mContext.startActivity(Intent(mContext,TextFieldActivity::class.java)) }) {
            Text(text = "Textfieldactivity")

        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {mContext.startActivity(Intent(mContext,ListActivity::class.java)) },
        shape = RectangleShape)
        {
            Text(text = "ListActivity")

        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {mContext.startActivity(Intent(mContext,cardAssingment2::class.java)) }) {
            Text(text = "Rick and Morty")

        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {mContext.startActivity(Intent(mContext,CardAssignment::class.java)) }) {
            Text(text = "Card")

        }
    }

}

@Preview(showBackground = true)
@Composable
fun helloPreview() {
        hello()
    }
