package com.example.modifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .background(Color.Yellow).padding(16.dp)
            ) {

                Box(modifier = Modifier
                    .size(200.dp)
                    .background(Color.Magenta)
                    .padding(16.dp)
                    .border(width = 1.dp , color = Color.White)
                    .padding(16.dp)
                    .border(width = 1.dp , color = Color.Black)
                    .padding(16.dp)
                    .border(width = 1.dp , color = Color.White)
                    .padding(16.dp)
                    .border(width = 1.dp , color = Color.Black)

                )
               /* Box(modifier = Modifier
                    .size(200.dp)
                    .background(Color.Red)
                    .clip(CircleShape)
                    .background(Color.White)
                )*/
                /*
                  Box(modifier = Modifier
                    size(64.dp)
                    .background(Color.Red)

                )
                Box(modifier = Modifier
                    .offset(x=32.dp,y=32.dp)
                    .border(width = 2.dp,color = Color.Blue)
                    .size(64.dp)
                )*/

            }
        }
    }


}

