package com.example.realestate.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ADD_PRODUCTS_URL
import com.example.realestate.navigation.ROUT_HOME
import com.example.realestate.navigation.VIEW_PRODUCTS_URL
import com.example.realestate.ui.theme.myblue

@Composable
fun DashboardScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.property1),
            contentDescription ="home",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text ="Manage your property with ease",
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(5.dp))

        Column (modifier = Modifier.verticalScroll(rememberScrollState())){

            Card(modifier = Modifier.fillMaxWidth().height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(myblue)

            ) {
                //Row1
                Row (modifier = Modifier.padding(20.dp)){
                    //Card1
                    Card (modifier = Modifier
                        .height(180.dp)
                        .width(160.dp)
                        .clickable { navController.navigate(ROUT_HOME) }
                    ){
                        Column {
                            Box (modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.img_2),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp)
                                    )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="HOME",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }

                    }
                    //End of card1

                    Spacer(modifier = Modifier.width(20.dp))

                    //Card1
                    Card (modifier = Modifier.height(180.dp).width(160.dp)
                    ){
                        Column {
                            Box (modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.img_5),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="PROFILE",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }

                    }
                    //End of card1

                }
                //End of row1
                //Row1
                Row (modifier = Modifier.padding(20.dp)){
                    //Card1
                    Card (modifier = Modifier.height(180.dp).width(160.dp)
                    ){
                        Column {
                            Box (modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.img_6),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="SETTING",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }

                    }
                    //End of card1

                    Spacer(modifier = Modifier.width(20.dp))

                    //Card1
                    Card (modifier = Modifier.height(180.dp).width(160.dp)
                    ){
                        Column {
                            Box (modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.img_3),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="DETAILS",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }

                    }
                    //End of card1

                }
                //Row1
                Row (modifier = Modifier.padding(20.dp)){
                    //Card1
                    Card (modifier = Modifier.height(180.dp).width(160.dp)
                    ){
                        Column {
                            Box (modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.pro),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="ADD PRODUCTS",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }

                    }
                    //End of card1

                    Spacer(modifier = Modifier.width(20.dp))

                    //Card1
                    Card (modifier = Modifier
                        .clickable { navController.navigate(ADD_PRODUCTS_URL) }
                        .height(180.dp).width(160.dp)
                    ){
                        Column {
                            Box (modifier = Modifier
                                .clickable { navController.navigate(VIEW_PRODUCTS_URL) }
                                .fillMaxWidth(),
                                contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id =R.drawable.property1),
                                    contentDescription ="",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text ="VIEW PRODUCTS",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }

                    }
                    //End of card1

                }
                
            }

        }
        
        


    }


}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}