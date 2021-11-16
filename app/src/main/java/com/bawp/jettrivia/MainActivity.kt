package com.bawp.jettrivia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.bawp.jettrivia.screens.TriviaHome
import com.bawp.jettrivia.ui.theme.JetTriviaTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetTriviaTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    TriviaHome()

                }
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetTriviaTheme {

    }
}