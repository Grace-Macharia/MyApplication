package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.screens.about.AboutScreen
import com.example.myapplication.ui.theme.screens.home.HomeScreen
import com.example.myapplication.ui.theme.screens.login.LoginScreen
import com.example.myapplication.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination: String = ROUTE_REGISTER){
    NavHost(navController =navController, modifier = Modifier,
        startDestination = startDestination){
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
    }

}