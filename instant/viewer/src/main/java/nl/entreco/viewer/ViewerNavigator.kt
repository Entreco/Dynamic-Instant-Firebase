package nl.entreco.viewer

import androidx.lifecycle.Observer
import nl.entreco.libcore.Navigator.startProfile

class ViewerNavigator(
    private val activity: ViewerActivity
) : Observer<ViewerEvents> {

    override fun onChanged(event: ViewerEvents?) {
        when (event) {
            is ViewerEvents.LaunchProfile -> activity.startProfile()
        }
    }
}