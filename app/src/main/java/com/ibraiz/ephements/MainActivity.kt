package com.ibraiz.ephements

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.ibraiz.ephements.ui.theme.EphementsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EphementsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    EphementsApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}