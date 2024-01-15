package com.rjornelas.compose_article_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rjornelas.compose_article_app.ui.theme.ComposeArticleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun ArticleImage(modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(painter = image,
        contentDescription = null,
        contentScale = ContentScale.Fit
    )
}

@Composable
fun ArticleText(headText: String, introText: String, bodyText: String, modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier
    ){
        ArticleImage()
        Text(
            text = headText,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)

        )
        Text(
            text = introText,
            modifier = modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = bodyText,
            modifier = modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeArticleAppTheme {
        ArticleText(
            headText = stringResource(R.string.head_text),
            introText = stringResource(R.string.intro_text),
            bodyText = stringResource(R.string.body_text)
        )
    }
}