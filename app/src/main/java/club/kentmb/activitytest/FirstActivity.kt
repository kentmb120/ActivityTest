package club.kentmb.activitytest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import club.kentmb.activitytest.databinding.FirstLayoutBinding

class FirstActivity : BaseActivity() {
    private lateinit var binding: FirstLayoutBinding//视图绑定第一步，定义一个binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FirstLayoutBinding.inflate(layoutInflater)//视图绑定第二步
        val view = binding.root//视图绑定第三步
        setContentView(view)//视图绑定第四部
        binding.button1.setOnClickListener(this::clickHandlerFunction)//注册一个监听单击

        Log.d("FirstActivity","Task id is $taskId")
    }

    private fun clickHandlerFunction(view: View){
/*        val intent = Intent(this,SecondActivity::class.java)//SecondActivity::class.java的写法就相当于Java中SecondActivity.class的写法
        startActivity(intent)*/

/*        val intent = Intent("club.kentmb.activitytest.ACTION_START")
        intent.addCategory("club.kentmb.activitytest.MY_CATEGORY")
        startActivity(intent)*///隐式intent跳转activity

/*        val intent =Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:10086")
        startActivity(intent)*/

/*        val data = "Hello SecondActivity"
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("extra_data",data)
        startActivity(intent)*///将数据通过intent传送到下一个activity

/*        val intent = Intent(this,SecondActivity::class.java)
        startActivityForResult(intent,1)*///此方法已被弃用，使用Activity Result API替代

        SecondActivity.actionStart(this,"data1","data2")
    }

    private val requestDataLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
/*
        registerForActivityResult()方法接收两个参数，第一个参数是一种Contract类型，由于我们是希望从另外一个Activity中请求数据，因此这里使用了StartActivityForResult这种Contract。
        第二个参数是一个Lambda表达式，当有结果返回时则会回调到这里，
        然后我们在这里获取并处理数据即可。

        registerForActivityResult()方法的返回值是一个ActivityResultLauncher对象，这个对象当中有一个launch()方法可以用于去启用Intent。
        这样我们就不需要再调用startActivityForResult()方法了，而是直接调用launch()方法，并把Intent传入即可。

*/
        result -> if(result.resultCode == RESULT_OK){
            val data = result.data?.getStringExtra("data")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item -> Toast.makeText(this,"You clicked Add",Toast.LENGTH_LONG).show()
            R.id.remove_item -> Toast.makeText(this,"You clicked Remove",Toast.LENGTH_LONG).show()
        }
        return true
    }

/*    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when(requestCode){
            1 -> if(requestCode == RESULT_OK){
                val returnedData = data?.getStringExtra("data_return")
                Log.d("FirstActivity","returned data is $returnedData")
            }
        }
    }*///此方法已被弃用，新方法参考requestDataLaunch
}