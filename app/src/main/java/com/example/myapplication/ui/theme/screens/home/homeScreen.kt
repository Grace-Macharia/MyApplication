package com.example.myapplication.ui.theme.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.navigation.ROUTE_ABOUT
import com.example.myapplication.navigation.ROUTE_ADD_PRODUCT
import com.example.myapplication.navigation.ROUTE_HOME
import com.example.myapplication.navigation.ROUTE_LOGIN
import com.example.myapplication.navigation.ROUTE_REGISTER
import com.example.myapplication.navigation.ROUTE_VIEW_PRODUCT


@Composable
fun HomeScreen(navController: NavController){
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context = LocalContext.current
//var productdata=productviewmodel(navController.context)
        Text(text = "Welcome to Home Page",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(100.dp))
        Button(
            onClick = { navController.navigate(ROUTE_ADD_PRODUCT) },
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "Add Product")
        }
        Spacer(modifier = Modifier.height(100.dp))
        Button(
            onClick = { navController.navigate(ROUTE_VIEW_PRODUCT) },
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "View Product")
        }

    }

}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(navController = rememberNavController())
}
