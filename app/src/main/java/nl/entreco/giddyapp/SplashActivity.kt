package nl.entreco.giddyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import nl.entreco.libcore.Navigator.startViewer

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startViewer()
    }
}