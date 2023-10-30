package com.example.tarjetadepresentacionkenerfonseca
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

import com.example.tarjetadepresentacionkenerfonseca.ui.theme.TarjetadePresentacionKenerFonsecaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetadePresentacionKenerFonsecaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TarjetaDePresentacion()
                }
            }
        }
    }
}

@Composable
fun TarjetaDePresentacion() {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFF5CD85C)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {

        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .background(Color.Gray)
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Kener Fonseca", color = Color(0xFF8A8888),
            style = TextStyle(
                    fontFamily = FontFamily.Default,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
            )

        Spacer(modifier = Modifier.height(8.dp))


        Text(
            text = "Prototipo Presentación",
            style = TextStyle(
                fontFamily = FontFamily.Default,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
       )
        Text(
            text = "Android Developer Extraordinaire", color = Color(0xFF8A8888),
            style = TextStyle(
                fontFamily = FontFamily.Default,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        )

        Spacer(modifier = Modifier.height(300.dp))

        Spacer(modifier = Modifier.height(32.dp))

        DatosConIcono("Teléfono:", "+89235692", Icons.Default.Phone)
        DatosConIcono("@", "KenerFonseca", Icons.Default.Share)
        DatosConIcono("Correo:", "fonsecakener@gmail.com", Icons.Default.Email)

    }
}

@Composable
fun DatosConIcono(label: String, valor: String, icon: ImageVector) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = icon, contentDescription = null)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = label)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = valor)
    }
}

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun TarjetaDePresentacionPreview() {
    TarjetadePresentacionKenerFonsecaTheme {
        TarjetaDePresentacion()
    }
}
