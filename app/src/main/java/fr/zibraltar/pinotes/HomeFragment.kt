package fr.zibraltar.pinotes

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView

class HomeFragment : Fragment(R.layout.home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ViewCompat.setOnApplyWindowInsetsListener(view) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textView = view.findViewById<TextView>(R.id.title)
        textView.text = "Pi Notes"

        val button: Button = view.findViewById(R.id.button1)
    }
}
