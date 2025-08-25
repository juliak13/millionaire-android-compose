package com.example.millionairegame

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.millionairegame.ui.theme.exo2

@Composable
//function onStartClick pulled from MillionaireGameApp for navigation
fun Splash(onStartClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        //imports from res drawable splash_logo.png for the splash_screen
        Image(
            painter = painterResource(id = R.drawable.splash_logo),
            contentDescription = "Splash Screen",
            contentScale = ContentScale.Crop, //allows the image to be full screen
            modifier = Modifier
                .fillMaxSize()
        )
        //This box is for the button, and it helps with aligning the button towards the bottom center
        Box(
            modifier = Modifier
                .fillMaxSize()
        ){
            //start button
            Button(
                onClick = onStartClick,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 80.dp)
            ) {
                Text(
                    text = "Start",
                    fontFamily = exo2,
                    fontSize = 24.sp
                )
            }
        }
    }
}