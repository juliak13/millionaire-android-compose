package com.example.millionairegame

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.millionairegame.ui.theme.exo2
import com.example.millionairegame.ui.theme.starjedi

@Composable
fun Lose(winnings: String, onTryAgain: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        //import image star.jpg from drawable as the background
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        Column(
            modifier = Modifier
                .padding(75.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            //when the user does not win, they are met with this message
            Text(
                text = "You have failed young Padawan!",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontFamily = starjedi,
                fontSize = 40.sp,
                letterSpacing = 2.sp,
                modifier = Modifier
                    .fillMaxWidth()
            )
            //displays their earnings
            Text(
                text = "Final Winnings: $winnings",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontFamily = exo2,
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(vertical = 20.dp)

            )
            //additional box allows for better button placement on the screen
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ){
                Button(
                    onClick = onTryAgain,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 80.dp)
                ) {
                    Text(
                        text = "Try Again",
                        fontFamily = exo2,
                        fontSize = 24.sp
                    )
                }
            }
        }
    }
}