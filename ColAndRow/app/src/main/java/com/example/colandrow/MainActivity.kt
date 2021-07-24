package com.example.colandrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.colandrow.ui.theme.ColAndRowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColAndRowTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(modifier = Modifier.padding(16.dp)) {
        Column(
            modifier =
            Modifier
                .border(width = 1.dp, color = Color.Cyan)
                .fillMaxWidth().padding(top = 10.dp)
                .height(200.dp)
            ,verticalArrangement = Arrangement.Center
        ) {
            Text("1.$name")
            Spacer(modifier = Modifier.height(10.dp))
            Text("2.$name",modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Row(
            modifier = Modifier
                .border(width = 1.dp, color = Color.Red)
                .fillMaxWidth()
                .height(200.dp)
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text("1.$name")
            Spacer(modifier = Modifier.width(10.dp))
            Text("2.$name")
        }

    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ColAndRowTheme {
        Greeting("Android")
    }
}