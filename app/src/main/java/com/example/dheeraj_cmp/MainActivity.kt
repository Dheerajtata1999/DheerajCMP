package com.example.dheeraj_cmp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.dheeraj_cmp.day3.TopicGrid
import com.example.dheeraj_cmp.day3.WoofApp
import com.example.dheeraj_cmp.ui.theme.CoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Replace 'YourAppTheme' with your actual project theme name

              /*  Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Pass the innerPadding modifier to whichever screen is active
                    // BirthdayCardScreen(modifier = Modifier.padding(innerPadding))
                    // ComposeArticleApp(modifier = Modifier.padding(innerPadding))
                    //ComposeQuadrantApp(modifier = Modifier.padding(innerPadding))

                    //TipTimeLayout(modifier = Modifier.padding(innerPadding))



            }*/

            //WoofApp()

            //*************Grid view APP Handling************

            CoursesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TopicGrid(
                        modifier = Modifier.padding(
                            start = dimensionResource(R.dimen.padding_small),
                            top = dimensionResource(R.dimen.padding_small),
                            end = dimensionResource(R.dimen.padding_small),
                        )
                    )
                }
            }
        }
    }
}


