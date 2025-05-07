package com.example.businesscard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    ProfileSection()
    ContactInfoSection()
}

@Composable
fun ProfileSection() {
    Column(
        modifier = Modifier.padding(bottom = 150.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .background(Color(0xFFf45c37))
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Anton Lekomtsev",
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Android Developer",
            fontSize = 20.sp,
            color = Color(0xFF19d41c)
        )
    }
}

@Composable
fun ContactInfoSection() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.padding(bottom = 50.dp)
            .padding(horizontal = 60.dp)
    ) {
        ContactRow(
            icon = Icons.Default.Phone,
            text = "+7 (904) 276-69-12"
        )
        Spacer(modifier = Modifier.height(15.dp))
        ContactRow(
            icon = Icons.Default.Email,
            text = "wvgvbond@gmail.com"
        )
        Spacer(modifier = Modifier.height(15.dp))
        ContactRow(
            icon = Icons.Default.Share,
            text = "@wvgvbond"
        )
    }
}

@Composable
fun ContactRow(icon: androidx.compose.ui.graphics.vector.ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF19d41c),
            modifier = Modifier.size(30.dp)
        )
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = text, fontSize = 20.sp)
    }
}