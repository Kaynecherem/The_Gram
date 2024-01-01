package com.necherem.thegram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.necherem.thegram.ui.theme.TheGramTheme
import com.necherem.thegram.view.auth.AuthenticationScreen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheGramTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                ) {
                    AuthenticationScreen()
                }
            }
        }
    }
}
