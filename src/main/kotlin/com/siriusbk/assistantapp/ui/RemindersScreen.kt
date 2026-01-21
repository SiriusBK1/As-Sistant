package com.siriusbk.assistantapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RemindersScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Comprar café – Mañana 07:00")
        Spacer(Modifier.height(8.dp))
        Text("Llamar a Juan – Ayer 15:00")
    }
}
