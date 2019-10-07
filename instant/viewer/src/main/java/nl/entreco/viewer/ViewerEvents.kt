package nl.entreco.viewer

import nl.entreco.libcore.LiveEvent

sealed class ViewerEvents : LiveEvent<ViewerEvents>() {
    object None: ViewerEvents()
    object LaunchProfile : ViewerEvents()
}