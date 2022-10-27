package club.kentmb.activitytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import club.kentmb.activitytest.databinding.SecondLayoutBinding
import club.kentmb.activitytest.databinding.ThirdLayoutBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : SecondLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.button2.setOnClickListener(this::clickHandlerFunction)
/*        val extraData = intent.getStringExtra("extra_data")
        Log.d("SecondActivity","extra data is $extraData")*///从上一个activity中读取数据并且打印

    }

    private fun clickHandlerFunction(view : View){
        val intent = Intent()
        intent.putExtra("data_return","Hello FirstActivity")
        setResult(RESULT_OK,intent)
        finish()
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("data_return","Hello FirstActivity")
        setResult(RESULT_OK,intent)
        finish()
    }
}