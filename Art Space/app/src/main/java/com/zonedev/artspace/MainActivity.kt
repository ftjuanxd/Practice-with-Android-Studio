package com.zonedev.artspace

import android.media.SubtitleData
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zonedev.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                ArtSpace()
            }
        }
    }
}

@Composable
fun ArtSpaceElement(Titule: String,subtitle: String, Date: String, modifier: Modifier = Modifier) {
    var result: Int by remember { mutableStateOf(1) }

    val imageResource = when(result){
        1 -> R.drawable.ic_launcher_background
        else -> R.drawable.ic_launcher_foreground
    }

    Column (
        modifier = modifier
            .fillMaxSize()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        ArtSpaceText(Titule,subtitle,Date,modifier)

        Row {
            if(result == 1){
                Button(onClick ={result-= 1}) {
                    Text("Previous")
                }
            }
            Button(onClick ={result +=1}) {
                Text("Next")
            }
        }
    }
}

@Composable
fun ArtSpaceText(Titule: String,subtitle: String, Date: String, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text =Titule,
            fontSize = 30.sp,
            fontWeight = FontWeight.Thin
        )
        Row {
            Text(
                text = subtitle,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = Date,
                fontWeight = FontWeight.Thin
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArtSpace() {
    ArtSpaceTheme {
        ArtSpaceElement("Pendejo","Mayor","(2011)")
    }
}