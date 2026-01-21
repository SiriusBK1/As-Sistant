package com.siriusbk.assistantapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.siriusbk.assistantapp.navigation.AppNavigation
import com.siriusbk.assistantapp.ui.theme.AssistantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssistantTheme {
                AppNavigation()
            }
        }
    }
}
