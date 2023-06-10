import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_quiz.VocabularyItem
import com.example.android_quiz.R

class VocabularyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vocabulary)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = VocabularyAdapter(getVocabularyItems())
    }

    private fun getVocabularyItems(): List<VocabularyItem> {
        return listOf(
            VocabularyItem("apple", "jabłko"),
            VocabularyItem("banana", "banan"),
            VocabularyItem("cat", "kot"),
        )
    }
}
