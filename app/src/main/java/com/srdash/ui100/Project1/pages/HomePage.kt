package com.srdash.ui100.Project1.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.srdash.ui100.Project1.UrbanistBold
import com.srdash.ui100.Project1.UrbanistMedium
import com.srdash.ui100.Project1.UrbanistSemiBold
import com.srdash.ui100.Project1.black
import com.srdash.ui100.Project1.gray
import com.srdash.ui100.Project1.lightGray
import com.srdash.ui100.Project1.orange
import com.srdash.ui100.Project1.random
import kotlin.math.round
import com.srdash.ui100.R

@Preview(showBackground = true)
@Composable
fun HomePage(){
    // background colors
    Column (
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .blur(128.dp)
        ) {
            BlurredCircles()
        }
    }

    Column (
        modifier = Modifier.fillMaxSize().padding(start = 16.dp, end = 16.dp, top = 42.dp, bottom = 32.dp)
    ){
        // search bar and preferences bar !
        Row (
            modifier = Modifier.fillMaxWidth().padding(4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Card (
                modifier = Modifier.height(48.dp).weight(1f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ){
                Row(
                    modifier = Modifier.fillMaxSize().padding(start = 16.dp).clickable(onClick = {

                    }),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Search..",
                        style = TextStyle(
                            fontFamily = UrbanistSemiBold,
                            fontSize = 16.sp
                        ),
                        color = gray
                    )
                }
            }
            Spacer(modifier = Modifier.width(12.dp))
            Card(
                modifier = Modifier.size(48.dp),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(Color.White),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize().clickable(onClick = {

                    }),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.slidericon),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        modifier = Modifier.scale(1.4f)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(18.dp))
        var categoriesText = listOf<String>("Denim", "Coat", "Pant", "Jacket", "Shirt")

        // categories section
        LazyRow {
            categoriesText.forEachIndexed { index, item ->
                item{
                    Column(
                        modifier = Modifier,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Card(
                            modifier = Modifier.size(96.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(32.dp),
                            elevation = CardDefaults.cardElevation(2.dp)
                        ) {
                            Row (
                                modifier = Modifier.fillMaxSize(),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.google),
                                    contentDescription = null,
                                    contentScale = ContentScale.FillWidth
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = item,
                            style = TextStyle(
                                fontFamily = UrbanistSemiBold,
                                fontSize = 18.sp
                            ),
                            color = black
                        )
                    }
                    Spacer(modifier = Modifier.width(14.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        // Highlight banners
        Card (
            modifier = Modifier.fillMaxWidth().height(150.dp),
            colors = CardDefaults.cardColors(Color.White),
            shape = RoundedCornerShape(32.dp),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Row { 
                Column(
                    modifier = Modifier.fillMaxHeight().padding(start = 16.dp, top = 20.dp, bottom = 20.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Winter Collection",
                        style = TextStyle(
                            fontFamily = UrbanistSemiBold,
                            fontSize = 24.sp
                        ),
                        color = orange
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Having a warm hour with new\nwinter collection",
                        style = TextStyle(
                            fontFamily = UrbanistSemiBold,
                            fontSize = 14.sp
                        ),
                        color = black
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Card(
                        modifier = Modifier.height(32.dp).width(96.dp),
                        colors = CardDefaults.cardColors(orange)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Order Now ",
                                style = TextStyle(
                                    fontFamily = UrbanistMedium,
                                    fontSize = 16.sp
                                ),
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Card(
                modifier = Modifier.width(32.dp).height(10.dp),
                colors = CardDefaults.cardColors(orange)
            ) {  }
            Spacer(modifier = Modifier.width(4.dp))
            Card(
                modifier = Modifier.width(22.dp).height(10.dp),
                colors = CardDefaults.cardColors(random)
            ) {  }
            Spacer(modifier = Modifier.width(4.dp))
            Card(
                modifier = Modifier.width(22.dp).height(10.dp),
                colors = CardDefaults.cardColors(random)
            ) {  }
            Spacer(modifier = Modifier.width(4.dp))
            Card(
                modifier = Modifier.width(22.dp).height(10.dp),
                colors = CardDefaults.cardColors(random)
            ) {  }
        }

        Spacer(modifier = Modifier.height(16.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Trending Products",
                style = TextStyle(
                    fontFamily = UrbanistBold,
                    fontSize = 22.sp
                ),
                color = black
            )
            Text(
                text = "See All",
                style = TextStyle(
                    fontFamily = UrbanistMedium,
                    fontSize = 18.sp
                ),
                color = black,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable(onClick = {})
            )
        }
    }
}