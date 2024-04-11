package com.example.myapplication.ui.theme.screens.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.navigation.ROUTE_HOME
import com.example.myapplication.navigation.ROUTE_LOGIN
import java.nio.file.WatchEvent

@Composable
fun RegisterScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "PLEASE REGISTER HERE",
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            fontSize = 22.sp)
        TextFieldComponent(mylabel = "First Name")
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldComponent(mylabel = "Last Name")
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldComponent(mylabel = "Gender")
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldComponent(mylabel = "Location")
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldComponent(mylabel = "Password")
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldComponent(mylabel = "Confirm Password")
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
            Text(modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(),
                text = "REGISTER HERE")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {navController.navigate(ROUTE_LOGIN)},
            colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
            Text(modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(),
                text = "LOGIN HERE")
        }

//        Button(onClick = { navController.navigate(ROUTE_HOME) }) {
//            Text(text = "HOME SCREEN")
//        }
    }

}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun RegisterScreenPreview(){
RegisterScreen(navController = rememberNavController())
}
@Composable
fun TextFieldComponent(mylabel: String){
    var text by remember {
        mutableStateOf(value = "")
    }
    TextField(modifier = Modifier.fillMaxWidth(),
        value = text, onValueChange = {
                newText -> text = newText
        },
        label = { TextFieldLabels(value = mylabel)})
}
@Composable
fun TextFieldLabels(value: String){
    Text(text = value)
}
