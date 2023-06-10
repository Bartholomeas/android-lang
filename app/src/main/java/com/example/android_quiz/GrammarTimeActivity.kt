package com.example.android_quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class GrammarTimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grammar_times)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = GrammarTimesAdapter(getGrammarTimes())
    }

    private fun getGrammarTimes(): List<GrammarTime> {
        return listOf(
            GrammarTime(
                "Present Simple",
                "Present Simple jest używany do wyrażania stałych sytuacji, nawyków i ogólnych prawd. Czas ten jest też używany do mówienia o czynnościach rutynowych i stałym stanie rzeczy.\n\n" +
                        "Często używamy go razem ze słowami, które wskazują na częstotliwość, takie jak 'always', 'usually', 'sometimes', 'never', 'every day', 'once a week' itp.",
                "W przypadku czasowników regularnych, do formy podstawowej czasownika dodajemy 's' dla trzeciej osoby liczby pojedynczej (he, she, it). Na przykład: He plays football every Sunday.\n\n" +
                        "Jeżeli czasownik kończy się na 'ss', 'sh', 'ch', 'x' lub 'o', dodajemy 'es'. Na przykład: She goes to school.\n\n" +
                        "Jeżeli czasownik kończy się na 'y' poprzedzone spółgłoską, zmieniamy 'y' na 'i' i dodajemy 'es'. Na przykład: He studies English.",
                "1. I play football every weekend.\n" +
                        "2. She works in a bank.\n" +
                        "3. They live in London.\n" +
                        "4. He doesn't like spinach.\n" +
                        "5. Do you speak English?\n" +
                        "6. Sarah goes to school by bus.\n" +
                        "7. I study English every day.\n" +
                        "8. My parents live in New York.\n" +
                        "9. We usually eat breakfast at 7am.\n" +
                        "10. She doesn't smoke."
            ),
            GrammarTime(
                "Past Simple",
                "Past Simple jest używany do opisania zdarzeń, które miały miejsce w przeszłości i już się zakończyły. Czas ten jest też używany do mówienia o czynnościach, które miały miejsce raz, nigdy lub kilka razy w przeszłości.\n\n" +
                        "Często używamy go razem ze słowami, które wskazują na czas w przeszłości, takie jak 'yesterday', 'last week', 'a year ago', 'in 1990' itp.",
                "W przypadku czasowników regularnych, do formy podstawowej czasownika dodajemy 'ed'. Na przykład: He worked in that company for 5 years. Dla czasowników nieregularnych musimy znać ich drugą formę. Na przykład: He saw a movie yesterday.\n\n" +
                        "W tworzeniu formy przeczącej i pytającej używamy pomocniczego czasownika 'did'. Na przykład: I did not (didn't) know about the meeting. Did you see the concert last night?",
                "1. I visited my grandparents last weekend.\n" +
                        "2. She didn't go to the party yesterday.\n" +
                        "3. They studied for the test all night.\n" +
                        "4. He didn't eat breakfast this morning.\n" +
                        "5. Did you see the concert last night?\n" +
                        "6. We watched a movie yesterday.\n" +
                        "7. I didn't understand the question.\n" +
                        "8. They didn't have a car when they were young.\n" +
                        "9. She studied all night for the test.\n" +
                        "10. He lived in Spain for 10 years."
            )
        )
    }
}
