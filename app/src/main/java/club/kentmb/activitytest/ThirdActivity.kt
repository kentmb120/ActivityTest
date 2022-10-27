package club.kentmb.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import club.kentmb.activitytest.databinding.ThirdLayoutBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding : ThirdLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ThirdLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.button3.setOnClickListener(this::clickHandlerFunction)
    }

    private fun clickHandlerFunction(view : View){
        finish()
    }
}