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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.navigation.ROUTE_ABOUT
import com.example.myapplication.navigation.ROUTE_HOME
import com.example.myapplication.navigation.ROUTE_LOGIN
import com.example.myapplication.navigation.ROUTE_REGISTER


@Composable
fun HomeScreen(navController: NavController){
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "HOME SCREEN")
        Button(
            onClick = { navController.navigate(ROUTE_ABOUT) },
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "About Screen")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { navController.navigate(ROUTE_LOGIN) },
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "Login Screen")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { navController.navigate(ROUTE_REGISTER) },
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "Register Screen")
        }
    }

}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(navController = rememberNavController())
}