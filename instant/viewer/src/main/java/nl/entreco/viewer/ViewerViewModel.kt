package nl.entreco.viewer

class ViewerViewModel {

    private val events = ViewerEvents.None
    fun events() = events

    fun launchProfile() {
        events.postValue(ViewerEvents.LaunchProfile)
    }
}