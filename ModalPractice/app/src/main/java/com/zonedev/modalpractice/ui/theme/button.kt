package com.zonedev.modalpractice.ui.theme


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ButtonApp(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit // Este es el parámetro que permite pasar una acción al botón
) {
    Button(
        onClick = onClick,
        modifier = modifier
    ) {
        Text(text = text)
    }
}