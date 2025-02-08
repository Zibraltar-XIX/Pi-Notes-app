package fr.zibraltar.pinotes

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import fr.zibraltar.pinotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Active la gestion automatique des barres système

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment()) // Définir le fragment initial

        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home_menu -> replaceFragment(HomeFragment()) // Remplacer par le fragment d'accueil
                R.id.profile_menu -> replaceFragment(HomeFragment()) // Remplacer par le fragment de profil
                R.id.setting_menu -> replaceFragment(SettingsTitle()) // Remplacer par le fragment de paramètres
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, fragment)
            .commit()
    }
}
