package com.aldikitta.jetbasicmoviedummy.navigation

import java.util.*

//www.google.com/sign_in
//enum class MovieScreens {
//    HomeScreen,
//    DetailsScreen;
//    companion object {
//        fun fromRoute(route: String?): MovieScreens
//                = when (route?.substringBefore("/")) {
//            HomeScreen.name -> HomeScreen
//            DetailsScreen.name -> DetailsScreen
//            null -> HomeScreen
//            else -> throw IllegalArgumentException("Route $route is not recognized")
//        }
//    }
//}

sealed class MovieScreen(
    val route: String
){
    object HomeScreen: MovieScreen("home_screen")
    object DetailsScreen: MovieScreen("details_screen")

}