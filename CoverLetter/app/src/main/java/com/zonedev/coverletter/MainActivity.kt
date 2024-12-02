package com.zonedev.coverletter

import android.os.Bundle
import android.text.Layout.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zonedev.coverletter.ui.theme.CoverLetterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoverLetterTheme {
                CoverLetter(
                    name = "Juan Sebastian Parra Garcia",
                    "Developer Software",
                    3196400997,
                    "davidstivenpinuela@gmail.com",
                    Modifier
                )
            }
        }
    }
}

@Composable
fun CoverLetter(name: String, cargo: String, telefono: Long, Correo: String modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun SectionCover(name: String, Cargo: String){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(R.drawable.zone)
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = name,
            fontWeight = FontWeight.W200
        )
        Text(
            text = Cargo,
            fontWeight = FontWeight.Thin
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoverLetterTheme {
        CoverLetter("Android")
    }
}