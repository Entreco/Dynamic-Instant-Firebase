package nl.entreco.viewer

import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class ViewerViewModel {

    private val events = ViewerEvents.None
    fun events() = events

    init {
        Firebase.firestore.document("horses/2RxUmQl9h4ssUN05Yilc").get().addOnCompleteListener {
            Log.i("YO", "argh YO: $it")
        }.addOnFailureListener {
            Log.i("YO", "argh NO: $it")
        }
    }

    fun launchProfile() {
        events.postValue(ViewerEvents.LaunchProfile)
    }
}