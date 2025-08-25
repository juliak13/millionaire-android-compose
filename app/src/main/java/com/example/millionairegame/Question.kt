package com.example.millionairegame

import android.widget.Toast
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.millionairegame.ui.theme.exo2
import com.example.millionairegame.ui.theme.exo2_italics
import com.example.millionairegame.ui.theme.starjedi

//the layout of the question pages
@Composable
//question functions value defintions
fun Question(
    question: String,
    answer: List<String>,
    correctAnswerIndex: Int,
    winnings: String,
    onCorrect: () -> Unit,
    onWrong: () -> Unit
) {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        //background image
        Image(
            painter = painterResource(id = R.drawable.star),
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(45.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //set at the top of the screen displaying current winnings
            //changes as the user answer correct answers
            Text(
                text = "Current Winnings: $winnings",
                color = Color.Yellow,
                fontFamily = exo2_italics,
                fontSize = 24.sp

            )
            //text box for the questions
            Text(
                text = question,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontFamily = starjedi,
                fontSize = 30.sp,
                letterSpacing = 2.sp,
                modifier = Modifier
                    .padding(vertical = 45.dp)
            )
            //section is for the answers
            //if the user answer the quesiton, wrong or correct there is a toast at the bottom of the screen
            answer.forEachIndexed{
                    index, answer ->
                Button(
                    onClick = {
                        if ( index == correctAnswerIndex) {
                            Toast.makeText(context, "Correct!", Toast.LENGTH_SHORT).show()
                            onCorrect()
                        } else {
                            Toast.makeText(context, "Wrong!", Toast.LENGTH_SHORT).show()
                            onWrong()
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 20.dp)
                ) {
                    Text(
                        text = answer,
                        fontFamily = exo2,
                        fontSize = 24.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}