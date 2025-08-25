package com.example.millionairegame

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

//navigation between pages
@Composable
fun MillionaireGameApp() {
    val navController = rememberNavController()
    //needed to have the value change on each page for the earnings
    var winnings by remember {
        mutableStateOf(0)
    }
    //start destination, starts at Splash
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") {
            //started earnings $0 and resets when going to splash screen
            winnings = 0
            //after start button is clicked it brings the user to the first question
            Splash {
                navController.navigate("question0")
            }
        }
        //calls from QuestionData.kt, pulls the questions and answers
        //one question at a time
        gameQuestions.forEachIndexed { index, question ->
            composable("question$index") {
                Question(
                    question = question.text,
                    answer = question.answer,
                    correctAnswerIndex = question.correct,
                    //winnings section
                    //after each question $1000 is added to the winnings
                    winnings = "$${winnings}",
                    onCorrect = {
                        winnings += 1000
                        val next = if (index == gameQuestions.lastIndex) "win" else "question${index + 1}"
                        navController.navigate(next)
                    },
                    //if the user selects the wrong answer, it does not add the additional winnings and navigated them to the lose screen
                    onWrong = {
                        navController.navigate("lose")
                    }
                )
            }
        }
        //once the user finishes the question and goes to the Win screen, taking the winnings
        composable("win") {
            Win(winnings = "$${winnings}") {
                navController.navigate("splash")
            }
        }
        //when the user does not answer the question correctly, they go to the Lose screen, taking the winnings
        composable("lose") {
            Lose(winnings = "$${winnings}") {
                navController.navigate("splash")
            }
        }
    }
}