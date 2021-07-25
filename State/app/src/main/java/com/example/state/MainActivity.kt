package com.example.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                val checkBoxState = remember {
                    mutableStateOf(false)
                }
                CustomCheckBox(isCheck = checkBoxState.value){
                    checkBoxState.value=it
                }

            }
        }
      }

    @Composable
    fun  CustomCheckBox(isCheck:Boolean,onCheckedChange:((Boolean)->Unit )?){
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(checked = isCheck, onCheckedChange = onCheckedChange)
            Spacer(modifier = Modifier.padding(6.dp))
            Text(text = if (isCheck) "On" else "Off")
        }
    }
    }

