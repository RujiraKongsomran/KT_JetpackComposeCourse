package com.rujirakongsomran.kt_jetpackcomposecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import com.rujirakongsomran.kt_jetpackcomposecourse.ui.theme.KT_JetpackComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // region Modifier
            /*Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
//                    .padding(16.dp)
//                    .padding(top = 50.dp)
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp, Color.Blue)
                    .padding(5.dp)
                    .border(10.dp, Color.Red)
                    .padding(10.dp)
//                    .width(600.dp)
//                    .requiredWidth(600.dp)
            ) {
//                Text("Hello", modifier = Modifier.offset(0.dp, 20.dp))
//                Text(
//                    "Hello", modifier = Modifier
//                        .border(5.dp, Color.Yellow)
//                        .padding(5.dp)
//                        .offset(20.dp, 20.dp)
//                        .border(10.dp, Color.Black)
//                        .padding(10.dp)
//                )
                Text("Hello", modifier = Modifier.clickable {

                })
                Spacer(modifier = Modifier.height(50.dp))
                Text("World")
            }

             */
            // endregion
            // region Row Column Sizing
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.Green),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.SpaceAround
//            ) {
//                Text("Hello")
//                Text("World")
//                Text("Hello")
//            }
//            Row(
//                modifier = Modifier
////                    .fillMaxSize(0.5f)
//                    .width(300.dp)
//                    .fillMaxHeight(0.7f)
////                    .height(300.dp)
//                    .background(Color.Green),
//                horizontalArrangement = Arrangement.SpaceAround,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Text("Hello")
//                Text("World")
//                Text("Hello")
//            }
            // endregion


        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting("Biwberry")
}