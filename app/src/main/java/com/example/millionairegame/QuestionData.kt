package com.example.millionairegame


//data class functions named
data class QuestionData(
    val text: String,
    val answer: List<String>,
    val correct: Int
)


//data function values
//15 questions and answers
val gameQuestions = listOf(
    QuestionData( //question0
        text = "What year did the first Star Wars Movie come out?",
        answer = listOf(
            "1968",
            "1983",
            "2005",
            "1977"
        ),
        correct = 3 //the correct answer is the 4 option, due to indexing it is the third position
    ),
    QuestionData( //question1
        text = "Who is Luke Skywalker's Father?",
        answer = listOf(
            "Obi-Wan Kenobi",
            "Darth Vader",
            "Han Solo",
            "Yoda"
        ),
        correct = 1
    ),
    QuestionData( //question2
        text = "What is the Name of Han Solo's Ship?",
        answer = listOf(
            "X-Wing",
            "Star Destroyer",
            "Millennium Falcon",
            "Speedster"
        ),
        correct = 2
    ),
    QuestionData( //question3
        text = "What is the Color of Yoda's lighsaber?",
        answer = listOf(
            "Green",
            "Blue",
            "Yellow",
            "Purple"
        ),
        correct = 0
    ),
    QuestionData( //question4
        text = "What species is Chewbacca?",
        answer = listOf(
            "Ewok",
            "Jawa",
            "Hutt",
            "Wookie"
        ),
        correct = 3
    ),
    QuestionData( //question5
        text = "Who built C-3P0?",
        answer = listOf(
            "Padmé Amadala",
            "Anakin Skywalker",
            "Obi-Wan Kenobi",
            "Qui-Gon Jinn"
        ),
        correct = 1
    ),
    QuestionData( //question6
        text = "Who does BB-8 belong to?",
        answer = listOf(
            "Rey",
            "Finn",
            "Poe Dameron",
            "Leia Organa"
        ),
        correct = 2
    ),
    QuestionData( //question7
        text = "Where did 0bi-Wan Kenobi defeat Anakin Skywalker?",
        answer = listOf(
            "Tatoonie",
            "Hoth",
            "Mustafar",
            "Endor"
        ),
        correct = 2
    ),
    QuestionData( //question8
        text = "What is Princess Leia's Home Planet?",
        answer = listOf(
            "Naboo",
            "Coruscant",
            "Tatoonie",
            "Alderaan"
        ),
        correct = 3
    ),
    QuestionData( //question9
        text = "Who kills Jabba the hutt?",
        answer = listOf(
            "Han Solo",
            "Leia Organa",
            "Luke Skywalker",
            "Boba Fett"
        ),
        correct = 1
    ),
    QuestionData( //question10
        text = "What is the name of Boba Fett's ship?",
        answer = listOf(
            "Star Chaser",
            "Eclipse",
            "Slave I",
            "TIE Fighter"
        ),
        correct = 2
    ),
    QuestionData( //question11
        text = "What is the Sith Home Planet?",
        answer = listOf(
            "Moraband",
            "Mustafar",
            "Dathomir",
            "Exegol"
        ),
        correct = 0
    ),
    QuestionData( //question12
        text = "Chancellor Palpatine was which Sith Lord?",
        answer = listOf(
            "Darth Sidious",
            "Darth Maul",
            "Plagueis",
            "Kylo Ren"
        ),
        correct = 0
    ),
    QuestionData( //question13
        text = "What Jedi Master discovers the planet Kamino?",
        answer = listOf(
            "Obi-Wan Kenobi",
            "Mace Windu",
            "Qui-Gon Jinn",
            "Yoda"
        ),
        correct = 0
    ),
    QuestionData( //question14
        text = "What material is used for Jedi Lightsabers?",
        answer = listOf(
            "Durasteel",
            "Beskar",
            "Mithril",
            "Kyber Crystal"
        ),
        correct = 3
    ),
    QuestionData( //question15
        text = "What Species is Darth Maul?",
        answer = listOf(
            "Togruta",
            "Dathomirian",
            "Twi'lek",
            "Chiss"
        ),
        correct = 1
    )
)