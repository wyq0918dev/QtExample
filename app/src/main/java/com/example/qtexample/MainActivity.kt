package com.example.qtexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.qtexample.ui.theme.QtExampleTheme
import org.qtproject.example.android_testApp.Android_test.Main
import org.qtproject.qt.android.QtQuickView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val qt = QtQuickView(this)
        qt.loadContent(Main())
        enableEdgeToEdge()
        setContent {
            QtExampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AndroidView(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        factory = { qt },
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QtExampleTheme {
        Greeting("Android")
    }
}