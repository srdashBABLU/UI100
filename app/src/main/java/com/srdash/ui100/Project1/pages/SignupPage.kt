package com.srdash.ui100.Project1.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.srdash.ui100.Project1.UrbanistMedium
import com.srdash.ui100.Project1.UrbanistRegular
import com.srdash.ui100.Project1.UrbanistSemiBold
import com.srdash.ui100.Project1.black
import com.srdash.ui100.Project1.gray
import com.srdash.ui100.Project1.lightGray
import com.srdash.ui100.Project1.orange
import com.srdash.ui100.R

@Preview(showBackground = true)
@Composable
fun SignUpPage(){
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

    Column(
        modifier = Modifier.fillMaxSize().padding(top = 128.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.width(380.dp).fillMaxHeight().offset(y = 30.dp),
            shape = RoundedCornerShape(32.dp),
            colors = CardDefaults.cardColors(Color.White),
            elevation = CardDefaults.cardElevation(32.dp)
        ) {
            Column (
                modifier = Modifier.fillMaxSize().padding(start = 16.dp, end = 16.dp, top = 24.dp, bottom = 32.dp)
            ){
                Text(
                    text = "Sign up",
                    style = TextStyle(
                        fontFamily = UrbanistSemiBold,
                        fontSize = 24.sp
                    ),
                    color = black
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Please enter Sign up details below",
                    style = TextStyle(
                        fontFamily = UrbanistRegular,
                        fontSize = 16.sp
                    ),
                    color = gray
                )
                Spacer(modifier = Modifier.height(12.dp))
                Row {
                    Card (
                        modifier = Modifier.height(56.dp).weight(1f),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(lightGray)
                    ){
                        Row (
                            modifier = Modifier.fillMaxSize().clickable(onClick = {}),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.google),
                                contentDescription = null,
                                modifier = Modifier.scale(0.7f)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Google",
                                style = TextStyle(
                                    fontFamily = UrbanistRegular,
                                    fontSize = 16.sp
                                ),
                                color = black
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(6.dp))
                    Card (
                        modifier = Modifier.height(56.dp).weight(1f),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(lightGray)
                    ){
                        Row (
                            modifier = Modifier.fillMaxSize().clickable(onClick = {}),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.facebook),
                                contentDescription = null,
                                modifier = Modifier.scale(0.7f)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Facebook",
                                style = TextStyle(
                                    fontFamily = UrbanistRegular,
                                    fontSize = 16.sp
                                ),
                                color = black
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(12.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(modifier = Modifier.height(2.dp).weight(1f).background(lightGray))
                    Text(
                        text = "Or",
                        style = TextStyle(
                            fontFamily = UrbanistRegular,
                            fontSize = 16.sp
                        ),
                        color = gray,
                        modifier = Modifier.padding(start = 8.dp, end = 12.dp)
                    )
                    Box(modifier = Modifier.height(2.dp).weight(1f).background(lightGray))
                }
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Name",
                    style = TextStyle(
                        fontFamily = UrbanistSemiBold,
                        fontSize = 20.sp
                    ),
                    color = gray
                )
                Spacer(modifier = Modifier.height(8.dp))
                Card (
                    modifier = Modifier.fillMaxWidth().height(56.dp),
                    colors = CardDefaults.cardColors(lightGray),
                    shape = RoundedCornerShape(16.dp)
                ){
                    Row (
                        modifier = Modifier.fillMaxSize().padding(start = 16.dp),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = "Enter your name",
                            style = TextStyle(
                                fontFamily = UrbanistMedium,
                                fontSize = 16.sp
                            ),
                            color = gray.copy(0.5f)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))


                Text(
                    text = "Email",
                    style = TextStyle(
                        fontFamily = UrbanistSemiBold,
                        fontSize = 20.sp
                    ),
                    color = gray
                )
                Spacer(modifier = Modifier.height(8.dp))
                Card (
                    modifier = Modifier.fillMaxWidth().height(56.dp),
                    colors = CardDefaults.cardColors(lightGray),
                    shape = RoundedCornerShape(16.dp)
                ){
                    Row (
                        modifier = Modifier.fillMaxSize().padding(start = 16.dp),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = "Enter your mail",
                            style = TextStyle(
                                fontFamily = UrbanistMedium,
                                fontSize = 16.sp
                            ),
                            color = gray.copy(0.5f)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Password",
                    style = TextStyle(
                        fontFamily = UrbanistSemiBold,
                        fontSize = 20.sp
                    ),
                    color = gray
                )
                Spacer(modifier = Modifier.height(8.dp))
                Card (
                    modifier = Modifier.fillMaxWidth().height(56.dp),
                    colors = CardDefaults.cardColors(lightGray),
                    shape = RoundedCornerShape(16.dp)
                ){
                    Row (
                        modifier = Modifier.fillMaxSize().padding(start = 16.dp, end = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = "password",
                            style = TextStyle(
                                fontFamily = UrbanistMedium,
                                fontSize = 16.sp
                            ),
                            color = gray.copy(0.5f)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.hideeye),
                            contentDescription = null,
                            tint = gray
                        )
                    }
                }
                var radioButtonSelected by remember { mutableStateOf(false) }
                Spacer(modifier = Modifier.height(12.dp))
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Card (
                            modifier = Modifier.size(22.dp).border(1.dp, gray.copy(0.6f), RoundedCornerShape(8.dp)),
                            shape = RoundedCornerShape(8.dp),
                            colors = CardDefaults.cardColors(if(radioButtonSelected) orange else Color.White)
                        ){
                            Row(
                                modifier = Modifier.fillMaxSize().clickable(onClick = {
                                    radioButtonSelected = !radioButtonSelected
                                }),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    painterResource(id = R.drawable.tick__2_),
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.scale(0.6f)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Text (
                            text = "I agree with ",
                            style = TextStyle(
                                fontFamily = UrbanistRegular,
                                fontSize = 12.sp
                            ),
                            color = gray
                        )
                        Text (
                            text = "Privacy",
                            style = TextStyle(
                                fontFamily = UrbanistSemiBold,
                                fontSize = 14.sp
                            ),
                            color = black,
                            textDecoration = TextDecoration.Underline,
                            modifier = Modifier.clickable(onClick = {})
                        )
                        Text (
                            text = " and ",
                            style = TextStyle(
                                fontFamily = UrbanistRegular,
                                fontSize = 12.sp
                            ),
                            color = gray
                        )
                        Text (
                            text = "Policy",
                            style = TextStyle(
                                fontFamily = UrbanistSemiBold,
                                fontSize = 14.sp
                            ),
                            color = black,
                            textDecoration = TextDecoration.Underline,
                            modifier = Modifier.clickable(onClick = {})
                        )
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Card (
                    modifier = Modifier.fillMaxWidth().height(56.dp),
                    colors = CardDefaults.cardColors(orange),
                    shape = RoundedCornerShape(18.dp)
                ){
                    Row(
                        modifier = Modifier.fillMaxSize().clickable(onClick = {}),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Sign up",
                            style = TextStyle(
                                fontFamily = UrbanistMedium,
                                fontSize = 18.sp
                            ),
                            color = Color.White
                        )
                    }
                }
                Spacer(modifier = Modifier.height(12.dp))
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Already have an account? ",
                        style = TextStyle(
                            fontFamily = UrbanistMedium,
                            fontSize = 14.sp
                        ),
                        color = gray
                    )
                    Text(
                        text = "Log in",
                        style = TextStyle(
                            fontFamily = UrbanistSemiBold,
                            fontSize = 16.sp
                        ),
                        color = black,
                        modifier = Modifier.clickable(onClick = {})
                    )
                }
            }
        }
    }
}