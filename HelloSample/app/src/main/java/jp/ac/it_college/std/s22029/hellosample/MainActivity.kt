package jp.ac.it_college.std.s22029.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import jp.ac.it_college.std.s22029.hellosample.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        // ボタンを取ってくる
        val  btClick = findViewById<Button>(R.id.btClick)
        // リスナクラスのインスタンスを作る
        val listener = HelloListener()
        // ボタンをリスナに設定する
        btClick.setOnClickListener(listener)

    }

   private inner class HelloListener: View.OnClickListener {
        override fun onClick(v: View?){
            // 名前が入力されるであろう EditText を取ってくる
            val input = findViewById<EditText>(id.etName)

            // メッセージを出力する先の TextView を取ってくる
            val output = findViewById<TextView>(id.tvOutout)

            // input(EditText) から入力内容を取り出して String型へ
            val inputStr = input.text.toString()

           // メッセージを出す
            output.text = "${inputStr}さん、こんにちは"
        }
    }
}