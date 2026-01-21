package com.siriusbk.assistantapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0B0F14)),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Button(
                onClick = {},
                shape = CircleShape,
                modifier = Modifier.size(260.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF00E5B8)
                )
            ) {}

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Mantén presionado para hablar",
                color = Color(0xFF8AF2D6)
            )
        }
    }
}
