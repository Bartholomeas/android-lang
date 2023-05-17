package com.example.android_quiz

object Questions {
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,  "What is it?",
        R.drawable.croisant,
        "Kotlet schabowy",
        "Ogórek",
        "Croissant",
        "Jabłko",
        3,
            )

        questionsList.add(que1)
        return questionsList
    }

}

//val question1 = Question(1,
//    "What is the past tense of the verb 'run'?",
//    R.drawable.running_shoes,
//    "Runned",
//    "Ran",
//    "Running",
//    "Run",
//    2)
//
//val question2 = Question(2,
//    "What is the plural form of the word 'child'?",
//    R.drawable.group_of_children,
//    "Childs",
//    "Childes",
//    "Children",
//    "Childers",
//    3)
//
//val question3 = Question(3,
//    "What is the meaning of the word 'equilibrium'?",
//    R.drawable.balance_scale,
//    "A state of balance",
//    "A state of confusion",
//    "A state of excitement",
//    "A state of sadness",
//    1)
//
//val question4 = Question(4,
//    "Which sentence uses the verb 'to be' correctly in the present tense?",
//    R.drawable.verb_conjugation,
//    "I is happy",
//    "He am tired",
//    "She are hungry",
//    "We are studying",
//    4)
//
//val question5 = Question(5,
//    "What is the past participle of the verb 'eat'?",
//    R.drawable.fork_and_knife,
//    "Ate",
//    "Eaten",
//    "Eatting",
//    "Eated",
//    2)
//
//val question6 = Question(6,
//    "What is the correct comparative form of the adjective 'big'?",
//    R.drawable.large_building,
//    "Biger",
//    "Bigger",
//    "More big",
//    "Most big",
//    2)
//
//val question7 = Question(7,
//    "What is the difference between 'there', 'their', and 'they're'?",
//    R.drawable.words_on_paper,
//    "'There' refers to a place, 'their' indicates possession, and 'they're' is a contraction of 'they are'",
//    "They are all the same",
//    "'There' is an adverb, 'their' is a pronoun, and 'they're' is a preposition",
//    "'There' is a noun, 'their' is an adjective, and 'they're' is a verb",
//    1)
//
//val question8 = Question(8,
//    "Which sentence uses the correct form of the verb 'to have' in the present perfect tense?",
//    R.drawable.books_and_pen,
//    "He has ate breakfast",
//    "They have drinked coffee",
//    "We have eaten lunch",
//    "She has runned to the store",
//    3)
//
//val question9 = Question(9,
//    "What is the correct way to form a question in the present simple tense?",
//    R.drawable.question_mark,
//    "Subject + verb + object",
//    "Object + verb + subject",
//    "Verb + subject