package com.necherem.thegram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.necherem.thegram.ui.theme.TheGramTheme
import com.necherem.thegram.view.auth.LoginScreen
import com.necherem.thegram.view.auth.RegistrationScreen
import com.necherem.thegram.view.reel.AllReels

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheGramTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    AllReels()
                }
            }
        }
    }
}
