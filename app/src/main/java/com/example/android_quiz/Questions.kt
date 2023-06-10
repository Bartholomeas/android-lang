package com.example.android_quiz

object Questions {
    const val totalQuestions: String = "total_question"
    const val correctAnswers: String = "correct_answers"
    const val category: String = "category"

    fun getQuestions(category: String, numQuestions: Int): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        when (category) {
            "Nouns" -> questionsList.addAll(getNounsQuestions(numQuestions))
            "Body Parts" -> questionsList.addAll(getBodyPartsQuestions(numQuestions))
            "Present Simple" -> questionsList.addAll(getPresentSimpleQuestions(numQuestions))
        }
        return questionsList
    }

 fun getNounsQuestions(numQuestions: Int): ArrayList<Question> {
    val allQuestionsList = ArrayList<Question>()
    val que1 = Question(1, "Which of these words is a noun?",
        R.drawable.croisant,
        "Jump",
        "Quickly",
        "Beautiful",
        "Dog",
        4
    )

    val que2 = Question(2, "Which word is the plural form of 'mouse'?",
        R.drawable.croisant,
        "Mices",
        "Mouses",
        "Mice",
        "Mouse",
        3
    )

    val que3 = Question(3, "What is the noun in the sentence 'She reads books'?",
        R.drawable.croisant,
        "She",
        "Reads",
        "Books",
        "No noun in the sentence",
        3
    )

    val que4 = Question(4, "What type of noun is 'London'?",
        R.drawable.croisant,
        "Proper noun",
        "Common noun",
        "Abstract noun",
        "Collective noun",
        1
    )

    val que5 = Question(5, "What is the collective noun for 'cows'?",
        R.drawable.croisant,
        "Group",
        "Herd",
        "Swarm",
        "Flock",
        2
    )

    allQuestionsList.add(que1)
    allQuestionsList.add(que2)
    allQuestionsList.add(que3)
    allQuestionsList.add(que4)
    allQuestionsList.add(que5)


    return generateQuestionsList(allQuestionsList,numQuestions)

}

     fun getBodyPartsQuestions(numQuestions: Int): ArrayList<Question> {
        val allQuestionsList = ArrayList<Question>()
        val que1 = Question(1, "Which of these is not a part of the human body?",
            R.drawable.croisant,
            "Elbow",
            "Ankle",
            "Paw",
            "Chin",
            3
        )

        val que2 = Question(2, "What do you use to hear?",
            R.drawable.croisant,
            "Nose",
            "Eyes",
            "Ears",
            "Hands",
            3
        )

        val que3 = Question(3, "What is the part of the body where the heart is located?",
            R.drawable.croisant,
            "Head",
            "Chest",
            "Abdomen",
            "Leg",
            2
        )

        val que4 = Question(4, "Which of these is the smallest bone in the human body?",
            R.drawable.croisant,
            "Femur",
            "Humerus",
            "Stapes",
            "Tibia",
            3
        )

        val que5 = Question(5, "What do you call the joint between the upper arm and the forearm?",
            R.drawable.croisant,
            "Elbow",
            "Wrist",
            "Knee",
            "Hip",
            1
        )

        allQuestionsList.add(que1)
        allQuestionsList.add(que2)
        allQuestionsList.add(que3)
        allQuestionsList.add(que4)
        allQuestionsList.add(que5)


        return generateQuestionsList(allQuestionsList,numQuestions)
    }

     fun getPresentSimpleQuestions(numQuestions: Int): ArrayList<Question> {
        val allQuestionsList = ArrayList<Question>()

        val que1 = Question(1, "Which sentence is in the Present Simple tense?",
            R.drawable.croisant,
            "I am running a marathon",
            "I have run a marathon",
            "I ran a marathon",
            "I run a marathon",
            4
        )

        val que2 = Question(2, "What is the third person singular form of 'do' in the present tense?",
            R.drawable.croisant,
            "Does",
            "Do",
            "Did",
            "Doing",
            1
        )

        val que3 = Question(3, "How would you express a routine in the Present Simple tense?",
            R.drawable.croisant,
            "I have breakfast at 7am",
            "I had breakfast at 7am",
            "I am having breakfast at 7am",
            "I have breakfast at 7am every day",
            4
        )

        val que4 = Question(4, "How would you form a negative sentence in the Present Simple tense?",
            R.drawable.croisant,
            "I not play tennis",
            "I don't play tennis",
            "I doesn't play tennis",
            "I am not play tennis",
            2
        )

        val que5 = Question(5, "Which of the following statements is generally true and hence expressed in the Present Simple tense?",
            R.drawable.croisant,
            "Water boils at 100 degrees Celsius",
            "Water is boiling at 100 degrees Celsius",
            "Water boiled at 100 degrees Celsius",
            "Water has boiled at 100 degrees Celsius",
            1
        )

        allQuestionsList.add(que1)
        allQuestionsList.add(que2)
        allQuestionsList.add(que3)
        allQuestionsList.add(que4)
        allQuestionsList.add(que5)
        return generateQuestionsList(allQuestionsList,numQuestions)
    }
     fun generateQuestionsList(allQuestionsList: ArrayList<Question>,numQuestions: Int):ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        for (i in 1..numQuestions) {
            val questionIndex = i % allQuestionsList.size
            questionsList.add(allQuestionsList[questionIndex])
        }
        return questionsList
    }

}
