package com.zonedev.modalpractice.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.* // Para el diseño de la caja y el espaciado
import androidx.compose.material.* // Para el manejo de diálogos
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyApp() {
    var showDialog by remember { mutableStateOf(false) }

    // Usa tu botón personalizado aquí para abrir el modal
    ButtonApp(
        text = "Abrir Modal",
        onClick = { showDialog = true }
    )

    // Componente Modal
    if (showDialog) {
        AlertDialog(
            onDismissRequest = {
                showDialog = false
            },
            title = { Text(text = "Título del Modal") },
            text = { Text(text = "Este es el contenido del modal.") },
            confirmButton = {
                // Usa el botón personalizado dentro del modal
                ButtonApp(
                    text = "Aceptar",
                    onClick = {
                        showDialog = false // Cierra el modal cuando se hace clic en "Aceptar"
                    },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}
