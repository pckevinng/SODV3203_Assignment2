package com.example.assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment2.ui.theme.Assignment2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpace()
                }
            }
        }
    }
}

@Composable
fun ArtSpace() {
    var currentArtwork by remember { mutableStateOf(1) }
    if(currentArtwork == 1)
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ){
            Surface(
                color  = Color.White,
                shadowElevation = 8.dp,
                modifier = Modifier
                    .fillMaxWidth(0.8f)
            )
            {
                Image(painter = painterResource(R.drawable.wp4639582 )
                    , contentDescription = "Maldives",
                    modifier = Modifier
                        .padding(16.dp)


                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth(0.8f)
                    .background(Color.Cyan)
            )
            {
                Row{
                    Text(
                        text = "Maldives",
                        style = TextStyle(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp),
                        modifier = Modifier
                            .padding(top =10.dp)
                    )
                }
                Row{
                    Text(
                        text = "Vel",
                        style = TextStyle(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp),
                        modifier = Modifier
                            .padding(bottom =10.dp)
                    )
                }



            }

            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                Box(
                    contentAlignment = Alignment.BottomStart,
                    modifier = Modifier.fillMaxWidth()
                        .weight(1f)

                )
                {
                    Button(
                        onClick = { currentArtwork = 3 },
                        modifier = Modifier.padding()

                    ) {
                        Text("Previous")
                    }
                }
                Box(
                    contentAlignment = Alignment.BottomEnd,
                    modifier = Modifier.fillMaxWidth()
                        .weight(1f)
                )
                {
                    Button(
                        onClick = { currentArtwork += 1 },
                        modifier = Modifier.padding()
                    ) {
                        Text("Next")
                    }
                }



            }
        }
    }
    else if(currentArtwork == 2)
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ){
            Surface(
                color  = Color.White,
                shadowElevation = 8.dp,
                modifier = Modifier
                    .fillMaxWidth(0.8f)
            )
            {
                Image(painter = painterResource(R.drawable.wp4991183)
                    , contentDescription = "Sunset beach",
                    modifier = Modifier
                        .padding(16.dp)


                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth(0.8f)
                    .background(Color.Cyan)
            )
            {
                Row{
                    Text(
                        text = "Sunset beach",
                        style = TextStyle(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp),
                        modifier = Modifier
                            .padding(top =10.dp)
                    )
                }
                Row{
                    Text(
                        text = "ifan1",
                        style = TextStyle(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp),
                        modifier = Modifier
                            .padding(bottom =10.dp)
                    )
                }



            }

            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                Box(
                    contentAlignment = Alignment.BottomStart,
                    modifier = Modifier.fillMaxWidth()
                        .weight(1f)

                )
                {
                    Button(
                        onClick = { currentArtwork -= 1 },
                        modifier = Modifier.padding()

                    ) {
                        Text("Previous")
                    }
                }
                Box(
                    contentAlignment = Alignment.BottomEnd,
                    modifier = Modifier.fillMaxWidth()
                        .weight(1f)
                )
                {
                    Button(
                        onClick = { currentArtwork += 1 },
                        modifier = Modifier.padding()
                    ) {
                        Text("Next")
                    }
                }



            }
        }
    }
    else if(currentArtwork == 3)
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ){
            Surface(
                color  = Color.White,
                shadowElevation = 8.dp,
                modifier = Modifier
                    .fillMaxWidth(0.8f)
            )
            {
                Image(painter = painterResource(R.drawable.wp9659549)
                    , contentDescription = "HD Ocean",
                    modifier = Modifier
                        .padding(16.dp)


                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth(0.8f)
                    .background(Color.Cyan)
            )
            {
                Row{
                    Text(
                        text = "HD Ocean",
                        style = TextStyle(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp),
                        modifier = Modifier
                            .padding(top =10.dp)
                    )
                }
                Row{
                    Text(
                        text = "henryriz",
                        style = TextStyle(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp),
                        modifier = Modifier
                            .padding(bottom =10.dp)
                    )
                }



            }

            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                Box(
                    contentAlignment = Alignment.BottomStart,
                    modifier = Modifier.fillMaxWidth()
                        .weight(1f)

                )
                {
                    Button(
                        onClick = { currentArtwork -= 1 },
                        modifier = Modifier.padding()

                    ) {
                        Text("Previous")
                    }
                }
                Box(
                    contentAlignment = Alignment.BottomEnd,
                    modifier = Modifier.fillMaxWidth()
                        .weight(1f)
                )
                {
                    Button(
                        onClick = { currentArtwork = 1 },
                        modifier = Modifier.padding()
                    ) {
                        Text("Next")
                    }
                }

            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment2Theme {
        ArtSpace()
    }
}