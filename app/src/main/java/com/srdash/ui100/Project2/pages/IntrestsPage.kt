package com.srdash.ui100.Project2.pages

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.srdash.ui100.Project1.UrbanistMedium
import com.srdash.ui100.Project1.UrbanistRegular
import com.srdash.ui100.Project2.p2Green
import com.srdash.ui100.Project2.p2ToxicGreen
import com.srdash.ui100.Project2.p2ToxicLightGreen
import com.srdash.ui100.Project2.p2White

@Preview(showBackground = true)
@Composable
fun P2InterestsPage(){
    P2Bg()
    Column(
        modifier = Modifier.fillMaxSize().padding(start = 16.dp, end = 16.dp, top = 42.dp, bottom = 32.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 8.dp, end = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card (
                modifier = Modifier.size(56.dp),
                shape = CircleShape,
                colors = CardDefaults.cardColors(p2Green.copy(0.3f))
            ){
                Row(
                    modifier = Modifier.fillMaxSize().clickable(onClick = {

                    }),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = null,
                        tint = p2White,
                        modifier = Modifier.scale(1.3f)
                    )
                }
            }
            Text(
                text = "Interests",
                style = TextStyle(
                    fontFamily = UrbanistMedium,
                    fontSize = 20.sp
                ),
                color = p2White
            )
        }

        Spacer(modifier = Modifier.height(24.dp))
        Row {
            Text(
                text = "Choose Your \nInterests !",
                style = TextStyle(
                    fontFamily = UrbanistRegular,
                    fontSize = 34.sp
                ),
                color = p2White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        val r1Items = listOf<String>("News", "Society", "Culture")
        val r2Items = listOf<String>("Drama", "Motivation")
        val r3Items = listOf<String>("Educational", "Kids", "History")
        val r4Items = listOf<String>("Comedy", "Business")

        val allItems = listOf(r1Items, r2Items, r3Items, r4Items)

        val selectedItem = mutableListOf<String>()

        Column {
            allItems.forEachIndexed { index, item ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    item.forEachIndexed { index2, item2 ->
                        Card (
                            modifier = Modifier,
                            shape = RoundedCornerShape(22.dp),
                            colors = CardDefaults.cardColors(if(selectedItem.contains(item2)) p2ToxicLightGreen.copy(0.5f) else p2Green.copy(0.2f))
                        ){
                            Row(
                                modifier = Modifier.clickable(onClick = {
                                    if(selectedItem.contains(item2)){
                                        selectedItem.remove(item2)
                                    } else {
                                        selectedItem.add(item2)
                                    }
                                })
                            ) {
                                Text(
                                    text = item2,
                                    style = TextStyle(
                                        fontFamily = UrbanistRegular,
                                        fontSize = 18.sp
                                    ),
                                    color = p2White,
                                    modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }

    Column(
        modifier = Modifier.fillMaxSize().padding(start = 16.dp, end = 16.dp, top = 42.dp, bottom = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            Card(
                modifier = Modifier.height(56.dp).weight(1f),
                shape = RoundedCornerShape(32.dp),
                colors = CardDefaults.cardColors(p2Green.copy(0.2f))
            ) {
                Row (
                    modifier = Modifier.fillMaxSize().clickable(onClick = {

                    }),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Skip",
                        style = TextStyle(
                            fontFamily = UrbanistMedium,
                            fontSize = 18.sp
                        ),
                        color = p2White
                    )
                }
            }

            Spacer(modifier = Modifier.width(14.dp))

            Card(
                modifier = Modifier.height(56.dp).weight(1f),
                shape = RoundedCornerShape(32.dp),
                colors = CardDefaults.cardColors(p2ToxicGreen)
            ) {
                Row (
                    modifier = Modifier.fillMaxSize().clickable(onClick = {

                    }),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Continue",
                        style = TextStyle(
                            fontFamily = UrbanistMedium,
                            fontSize = 18.sp
                        ),
                        color = p2White
                    )
                }
            }
        }
    }
}