package com.example.myapplication.ui.theme.screens.about

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.navigation.ROUTE_HOME
import com.example.myapplication.navigation.ROUTE_LOGIN

@Composable
fun AboutScreen(navController: NavController){
    Column {
        Box (contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()){
            Text(text = "ABOUT US SCREEN")
            Button(onClick = { navController.navigate(ROUTE_LOGIN) }) {
                Text(text = "LOGIN SCREEN")
            }
        }
    
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(navController = rememberNavController())
}

