@file:Suppress("PreviewMustBeTopLevelFunction")

package com.example.realestate.ui.theme.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ROUT_DETAIL
import com.example.realestate.navigation.ROUT_INTENT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){
        TopAppBar(
            title = { Text(text = "MAGIC BRICKS", fontFamily = FontFamily.SansSerif) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Magenta),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu", tint = Color.Black)
                    }
                },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "menu",
                        tint = Color.Black
                    )
                    
                }
            }

        )
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(280.dp),
        contentAlignment = Alignment.Center){
            Image(
                painter = painterResource(id = R.drawable.home3),
                contentDescription ="image",
                modifier = Modifier.fillMaxSize()
            
            )
            Text(text = "Choose your best property",
                fontSize = 50.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color.White


            )




        }
        Spacer(modifier = Modifier.height(20.dp))

        var search by remember { mutableStateOf("")  }
            OutlinedTextField(
                value = search,
                onValueChange ={search=it},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = { Icon(imageVector =Icons.Default.Search , contentDescription = search)},
                placeholder = { Text(text = "What`s your location")}

            )
        Spacer(modifier = Modifier.height(20.dp))
        Row (modifier = Modifier
            .padding(start = 20.dp)
            .horizontalScroll(rememberScrollState())){
            //card 1
            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp)){
               Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                   Image(
                       painter = painterResource(id = R.drawable.home4),
                       contentDescription ="image",
                       modifier = Modifier.fillMaxSize(),
                       contentScale = ContentScale.Crop

                   )


               }
            }
            //end of card 1
            //card 2
            Spacer(modifier = Modifier.width(20.dp))
            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp)){
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.home2),
                        contentDescription ="image",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )


                }
            }
            //end of card 2

            //end of card 1
            //card 2
            Spacer(modifier = Modifier.width(20.dp))
            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp)){
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.home2),
                        contentDescription ="image",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )


                }
            }
            //end of card 2

            //end of card 1
            //card 2
            Spacer(modifier = Modifier.width(20.dp))
            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp)){
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.home2),
                        contentDescription ="image",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )


                }
            }
            //end of card 2
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate(ROUT_INTENT)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(10.dp)


        ) {
            Text(text = "Continue")
        }














        }
}
   
@Composable
@Preview(showBackground = true)
fun DetailScreenPreview(){
    DetailScreen(rememberNavController())
}

 


