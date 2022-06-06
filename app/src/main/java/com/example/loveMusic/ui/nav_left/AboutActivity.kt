package com.example.loveMusic.ui.nav_left

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loveMusic.ui.main.MainActivity
import com.example.loveMusic.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(MainActivity.currentThemeNav[MainActivity.themeIndex])
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        binding.aboutText.text = aboutText()

        binding.btnGotoFeedback.setOnClickListener {
            startActivity(Intent(this@AboutActivity, FeedbackActivity::class.java))
        }
    }
    private fun aboutText(): String{
        return "Developed By: Mai Quyền Linh \n\nLớp CNTT4 K59 \n\nTrường Đại học giao thông vận tải \n\nỨng dụng của Đồ Án Tốt Nghiệp" +
                "\n\nBạn có thể góp ý cho tôi trong phần Feedback\n\nĐể giúp tôi sẽ hoàn thiện ứng dụng tốt hơn."
    }
}