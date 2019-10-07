package nl.entreco.viewer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import nl.entreco.viewer.databinding.ActivityViewerBinding

class ViewerActivity : AppCompatActivity() {

    private val viewModel by lazy{ ViewerViewModel() }
    private val navigator by lazy{ ViewerNavigator(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityViewerBinding>(this, R.layout.activity_viewer)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.events().observe(this, navigator)
    }
}