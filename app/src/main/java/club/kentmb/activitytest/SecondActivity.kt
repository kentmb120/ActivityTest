package club.kentmb.activitytest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import club.kentmb.activitytest.databinding.SecondLayoutBinding
import club.kentmb.activitytest.databinding.ThirdLayoutBinding

class SecondActivity : BaseActivity() {
    private lateinit var binding : SecondLayoutBinding

    companion object {
        fun actionStart(context: Context,data1:String,data2:String){
            val intent = Intent(context,SecondActivity::class.java)
            intent.putExtra("param1",data1)
            intent.putExtra("param2",data2)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.button2.setOnClickListener(this::clickHandlerFunction)
/*        val extraData = intent.getStringExtra("extra_data")
        Log.d("SecondActivity","extra data is $extraData")*///从上一个activity中读取数据并且打印

        Log.d("SecondActivity","Task id is $taskId")

    }

    private fun clickHandlerFunction(view : View){
        val intent = Intent(this,ThirdActivity::class.java)
        startActivity(intent)
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("data_return","Hello FirstActivity")
        setResult(RESULT_OK,intent)
        finish()
    }
}