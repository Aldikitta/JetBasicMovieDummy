package com.aldikitta.jetbasicmoviedummy.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.aldikitta.jetbasicmoviedummy.model.Movie
import com.aldikitta.jetbasicmoviedummy.model.getMovies
import com.aldikitta.jetbasicmoviedummy.navigation.MovieScreen
import com.aldikitta.jetbasicmoviedummy.widgets.MovieRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            SmallTopAppBar(title = {
                Text(text = "Movies")
            },
                navigationIcon = {
                    IconButton(onClick = {
                    }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
            )


        },
    ) {innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)){
            MainContent(navController = navController)
        }
    }

}

@Composable
fun MainContent(
    navController: NavController,
    movieList: List<Movie> = getMovies()) {
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn {
            items(items = movieList) {
                MovieRow(movie = it){ movie ->
                    navController.navigate(route = MovieScreen.DetailsScreen.route+"/$movie")

                }
            }
        }

    }

}