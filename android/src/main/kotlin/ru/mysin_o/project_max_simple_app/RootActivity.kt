package ru.mysin_o.project_max_simple_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.mysin_o.project_max_simple_app.root.RootScreen

class RootActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RootScreen()
        }
    }

}