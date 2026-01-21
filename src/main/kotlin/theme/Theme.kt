package com.siriusbk.assistantapp.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun AssistantTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(),
        content = content
    )
}
