package com.siriusbk.assistantapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NotesScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Lista de compras:")
        Text("• Pan")
        Text("• Leche")
        Text("• Huevos")
    }
}
