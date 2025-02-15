package com.srdash.ui100.Project2.pages

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.srdash.ui100.Project1.black
import com.srdash.ui100.Project2.p2ToxicGreen
import com.srdash.ui100.Project2.p2ToxicLightGreen
import com.srdash.ui100.R

@Preview(showBackground = true)
@Composable
fun P2SplashScreen() {
    P2Bg()
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.p2logo),
            contentDescription = null
        )
    }
}

@Composable
fun P2Bg(){
    Column (
        modifier = Modifier.fillMaxSize().background(black),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .blur(192.dp)
        ) {
            Canvas(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                val canvasWidth = size.width
                val canvasHeight = size.height

                // Top right circle
                drawCircle(
                    color = p2ToxicGreen,
                    radius = 200f,
                    center = androidx.compose.ui.geometry.Offset(canvasWidth - 200f, 200f)
                )

                // Bottom left circle
                drawCircle(
                    color = p2ToxicLightGreen,
                    radius = 200f,
                    center = androidx.compose.ui.geometry.Offset(200f, canvasHeight - 200f)
                )
            }
        }
    }
}