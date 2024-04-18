package com.wes.firebase.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wes.firebase.ui.theme.screens.home.HomeScreen
import com.wes.firebase.ui.theme.screens.login.LoginScreen
import com.wes.firebase.ui.theme.screens.products.AddProductScreen
//import com.wes.firebase.ui.theme.screens.products.AddProductsScreen
//import com.wes.firebase.ui.theme.screens.products.UpdateProductsScreen
//import com.wes.firebase.ui.theme.screens.products.ViewProductsScreen
import com.wes.firebase.ui.theme.screens.products.ViewProductscreen
//import com.wes.firebase.ui.theme.screens.products.ViewUploadsScreen
import com.wes.firebase.ui.theme.screens.products.ViewUploadscreen
import com.wes.firebase.ui.theme.screens.registration.RegisterScreen
import java.lang.reflect.Modifier

@Composable
fun AppNavHost(modifier: androidx.compose.ui.Modifier = androidx.compose.ui.Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination:String= ROUTE_LOGIN){

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddProductScreen()
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductscreen()
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            AddProductScreen()

        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadscreen()
        }
    }

}