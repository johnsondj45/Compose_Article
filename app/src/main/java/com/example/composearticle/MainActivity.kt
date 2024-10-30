package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    StartingImage(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }


    @Composable
    fun Texts(
        tutorialMessage: String,
        bodyOne: String,
        bodyTwo: String,
        modifier: Modifier = Modifier
    ) {
        Column(modifier = modifier) {
            Text(
                text = tutorialMessage,
                fontSize = 24.sp,
                modifier = modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
            )
            Text(
                text = bodyOne,
                modifier = modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Justify
            )
            Text(
                text = bodyTwo,
                modifier = modifier.padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 16.dp,
                    bottom = 16.dp
                ),
                textAlign = TextAlign.Justify
            )
        }


    }

    @Composable
    fun StartingImage(modifier: Modifier = Modifier) {
        val image = painterResource(R.drawable.bg_compose_background)
        Column {
            Image(
                painter = image,
                contentDescription = null,
                modifier = modifier.fillMaxWidth()
            )
            Texts(
                tutorialMessage = stringResource(R.string.tutorial_message),
                bodyOne = stringResource(R.string.body_one),
                bodyTwo = stringResource(R.string.body_two)
            )
        }

    }
}

