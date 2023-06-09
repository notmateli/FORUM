package com.example.sam

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.RowScopeInstance.alignByBaseline
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sam.ui.theme.SamTheme

class IntroductionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()

        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Greeting() {
    val home = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.forum1),
            contentDescription = "abcd",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds

        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {

            LazyColumn {

                item {
                    Text(

                        text = "",
                        color = Color.Black,
                        fontStyle = FontStyle.Normal,



                        modifier = Modifier
                            .padding(20.dp,10.dp,0.dp,0.dp)
                            .size(700.dp)


                    )
                    Column(

                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally,


                    ) {


                        Button(onClick = {
                            home.startActivity(
                                    Intent(
                                        home,
                                        AboutActivity::class.java))},
                            colors = ButtonDefaults.buttonColors(Color.Black),
                            shape = RectangleShape,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp)


                            ) {
                            Image(
                                painterResource(id = R.drawable.arrow1),
                                contentDescription ="arrow icon",
                                modifier = Modifier.size(20.dp))
                            Text(
                                "BEGIN YOUR JOURNEY",
                                color = Color.White,
                                fontStyle = FontStyle.Italic,



                                modifier = Modifier
                                .padding(start = 10.dp)



                            )
                        }
                    }

                }


            }
        }
    }
}


