package com.example.cardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cardapp.ui.theme.CardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyComposable()
                }


            }
        }
    }
}
@Composable
fun MyComposable() {
    val firstColor = colorResource(id = R.color.farcolour)
    val SecondColour = colorResource(id = R.color.barcolour)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = firstColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(modifier = Modifier) {
            Image(
                painter = painterResource(R.drawable.bro_1__3_),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(120.dp) // Increased size to 120.dp
                    .align(Alignment.CenterHorizontally) // Center the image
                    .padding(bottom = 8.dp), // Add bottom padding
                //contentScale = ContentScale.Fit
            )
            Text(text = stringResource(id = R.string.full_name),
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.SansSerif // Change font family to SansSerif
            )

            Text(text = stringResource(id = R.string.title),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = SecondColour,
                textAlign = TextAlign.Center )
        }
        //   }

        // Contact information section
        Column(modifier = Modifier.padding(top = 190.dp), verticalArrangement = Arrangement.Center) {
            Row( modifier = Modifier.padding(top = 8.dp)) {
                Icon(
                    painter = painterResource(R.drawable.call_fill0_wght400_grad0_opsz48),
                    contentDescription = "Phone",
                    tint = Color(0xFF1E6B21), // Custom green color
                    modifier = Modifier.size(24.dp)
                )
                Text(text = stringResource(id = R.string.mobile),
                    modifier = Modifier.padding(start = 18.dp))
            }
            Row( modifier = Modifier.padding(top = 8.dp)) {
                Icon(
                    painter = painterResource(R.drawable.share_fill0_wght400_grad0_opsz48),
                    contentDescription = "Share",
                    tint = Color(0xFF1E6B21), // Custom green color
                    modifier = Modifier.size(24.dp)
                )
                Text(text = stringResource(id = R.string.share),
                    modifier = Modifier.padding(start = 18.dp))
            }
            Row( modifier = Modifier.padding(top = 8.dp)) {
                Icon(
                    painter = painterResource(R.drawable.mail_fill0_wght400_grad0_opsz48),
                    contentDescription = "Mail",
                    tint = Color(0xFF1E6B21), // Custom green color
                    modifier = Modifier.size(24.dp)
                )
                Text(text = stringResource(id = R.string.email),
                    modifier = Modifier.padding(start = 18.dp))
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CardAppTheme{
        MyComposable()
    }
}


