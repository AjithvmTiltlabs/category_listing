package com.example.category_list.ui.activities.splash

/**
 * Created by Ajith V M on 22-03-2022.
 */
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.category_list.R
import com.example.category_list.ui.activities.category.CategoryListActivity


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        navigateToMainPage()

    }

    private fun navigateToMainPage() {
        Handler().postDelayed(Runnable {
            val intent = Intent(this@SplashScreen, CategoryListActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }


}