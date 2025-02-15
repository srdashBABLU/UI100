package com.srdash.ui100.Project1

import android.annotation.SuppressLint
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.srdash.ui100.Project1.pages.LoginPage
import com.srdash.ui100.Project1.pages.SignUpPage
import com.srdash.ui100.Project1.pages.SplashPage
import com.srdash.ui100.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun P1Navigation(){
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier,
        floatingActionButton = {
            var selectedIcon by remember { mutableStateOf(1) }
            Card (
                modifier = Modifier.fillMaxWidth().padding(22.dp).height(74.dp),
                shape = RoundedCornerShape(22.dp),
                colors = CardDefaults.cardColors(Color.White),
                elevation = CardDefaults.cardElevation(4.dp)
            ){
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // card 1
                    Card(
                        modifier = Modifier.size(56.dp),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(Color.Transparent)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize().clickable(onClick = {
                                selectedIcon = 1
                            }),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = if (selectedIcon == 1) R.drawable.homeiconfilled else R.drawable.homeiconblank),
                                contentDescription = null,
                                contentScale = ContentScale.FillWidth,
                                modifier = Modifier.scale(1.5f)
                            )
                        }
                    }

                    // card 2
                    Card(
                        modifier = Modifier.size(56.dp),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(Color.Transparent)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize().clickable(onClick = {
                                selectedIcon = 2
                            }),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = if (selectedIcon == 2) R.drawable.menuiconfilled else R.drawable.menuiconblank),
                                contentDescription = null,
                                contentScale = ContentScale.FillWidth,
                                modifier = Modifier.scale(1.5f)
                            )
                        }
                    }

                    // card 3
                    Card(
                        modifier = Modifier.size(48.dp),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(orange),
                        elevation = CardDefaults.cardElevation(8.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize().clickable(onClick = {
                                selectedIcon = 3
                            }),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = null,
                                tint = Color.White
                            )
                        }
                    }

                    // card 4
                    Card(
                        modifier = Modifier.size(56.dp),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(Color.Transparent)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize().clickable(onClick = {
                                selectedIcon = 4
                            }),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = if (selectedIcon == 4) R.drawable.messageiconfilled else R.drawable.messageiconblank),
                                contentDescription = null,
                                contentScale = ContentScale.FillWidth,
                                modifier = Modifier.scale(1.5f)
                            )
                        }
                    }

                    // card 5
                    Card(
                        modifier = Modifier.size(56.dp),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(Color.Transparent)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize().clickable(onClick = {
                                selectedIcon = 5
                            }),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = if (selectedIcon == 5) R.drawable.accounticonfilled else R.drawable.accounticonblank),
                                contentDescription = null,
                                contentScale = ContentScale.FillWidth,
                                modifier = Modifier.scale(1.5f)
                            )
                        }
                    }
                }
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        contentColor = contentColorFor(Color.White)
    ){ innerPadding ->
        NavHost(navController = navController, startDestination = "splash"){
            composable("splash"){ SplashPage() }
            composable("login"){ LoginPage() }
            composable("signup"){ SignUpPage() }
        }
    }
}