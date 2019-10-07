package nl.entreco.libcore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

object Navigator {

    private val pkg = "nl.entreco"
    private val PROFILE = "$pkg.profile.ProfileActivity"
    private val VIEWER = "$pkg.viewer.ViewerActivity"

    fun AppCompatActivity.startProfile() {

        // Actions DO NOT work with Dynamic Features ---> use Reflection ;(
        startActivity(Intent().apply {
            setClassName(packageName, PROFILE)
            addCategory(Intent.CATEGORY_DEFAULT)
        })
    }


    fun AppCompatActivity.startViewer() {
        startActivity(Intent().apply {
            setClassName(packageName, VIEWER)
            addCategory(Intent.CATEGORY_DEFAULT)
        })
        finish()
    }
}