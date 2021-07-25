package com.example.composeable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                customButton(text = "Buttom One",color = Color.Magenta)
                customButton(text = "Bottom Two",color = Color.Yellow)
            }

        }
    }


    @Composable()
    fun customButton(text: String,color: Color) {
        Button(
            onClick = { },
            Modifier
                .padding(16.dp)
                .clip(
                    RoundedCornerShape(16.dp)


                ),
            colors = ButtonDefaults.buttonColors(backgroundColor = color)

        ) {
            Text(text = text, color = Color.Black)
        }


    }
}




