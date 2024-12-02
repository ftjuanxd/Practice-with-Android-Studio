package com.zonedev.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zonedev.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Container()
                    /*CompletedTask(stringResource(R.string.informative), stringResource(R.string.advice))*/
                    /*LearnTogether(
                        Titule = stringResource(R.string.Titule),
                        Description = stringResource(R.string.Description),
                        Lorem = stringResource(R.string.Lorem),
                        modifier = Modifier.fillMaxSize()
                    )*/
                }
            }
        }
    }
}
//Activity 1
@Composable
fun LearnTogether(Titule: String, Description : String, Lorem: String,modifier: Modifier=Modifier){
    Column(modifier = Modifier) {
        val image = painterResource(R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Text(
            text = Titule,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = Description,
            modifier = Modifier
                .padding(16.dp,0.dp,16.dp,0.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = Lorem,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}
//Activity 2
@Composable
fun CompletedTask(informative: String, advice : String) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        val image = painterResource(R.drawable.ic_task_completed)
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = informative,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text =advice,
            fontSize = 16.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}
//Activity 3
@Composable
fun Container(){

    Column (Modifier.fillMaxWidth()){
        Row(Modifier.weight(1f)) {

            Cards(
                stringResource(R.string.Title_Text_Composable),
                stringResource(R.string.Content_Text_Composable),
                0xFFEADDFF, modifier = Modifier.weight(1f)
            )
            Cards(
                stringResource(R.string.Title_Image_Composable),
                stringResource(R.string.Content_Image_Composable),
                0xFFD0BCFF, modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Cards(
                stringResource(R.string.Title_Row_Composable),
                stringResource(R.string.Content_Row_Composable),
                0xFFB69DF8, modifier = Modifier.weight(1f)
            )
            Cards(
                stringResource(R.string.Title_Column_Composable),
                stringResource(R.string.Content_Column_Composable),
                0xFFF6EDFF, modifier = Modifier.weight(1f)
            )
        }
    }

}
@Composable
fun Cards(Title: String, Content: String,Backcolor: Long, modifier: Modifier=Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(Backcolor)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text =Title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.
            padding(bottom=16.dp)
        )
        Text(
            text = Content,
            textAlign = TextAlign.Center
        )
    }
}
@Preview(showBackground = true)
@Composable
fun Preview_Activities(){
   /* LearnTogether(
        Titule = stringResource(R.string.Titule),
        Description = stringResource(R.string.Description),
        Lorem = stringResource(R.string.Lorem),
        modifier = Modifier.fillMaxSize()
    )*/
    /**CompletedTask(stringResource(R.string.informative), stringResource(R.string.advice))**/
    Container()
}