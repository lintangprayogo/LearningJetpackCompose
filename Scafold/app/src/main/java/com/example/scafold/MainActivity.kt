package com.example.scafold

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScafoldExample()
        }
    }

    @Composable
    fun ScafoldExample() {
        val materialOrange700 = Color(0xFFF57C00)
        Scaffold(topBar = {
            TopAppBar(
                title = { Text(text = "Scafold Example", color = Color.White) },
                backgroundColor = materialOrange700
            )

        },bottomBar = { BottomAppBar(backgroundColor = materialOrange700) {
            Text(text = "Bottom App Bar")
        }},
            floatingActionButton = { FloatingActionButton(onClick = {  }) {
                Text(text = ("+"))
            }},
            floatingActionButtonPosition = FabPosition.End
           ,drawerContent = { Text(text = "Ini Drawer")}
         ,content = { Text(text = "Ini Content",color = Color.Red)}//Mandatory
        )
    }
}

