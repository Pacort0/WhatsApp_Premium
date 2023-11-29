package com.example.whatsapp_premium

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp_premium.ui.theme.WhatsApp_PremiumTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun vistaChat() {
    var mensaje by rememberSaveable {
        mutableStateOf("mensaje")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(4.dp, 10.dp, 4.dp, 20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.Top,
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "NombreContacto", color = Color.LightGray, fontSize = 40.sp)
        }
        LazyColumn(modifier = Modifier.weight(7f)) {
            items(20) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Mensaje", fontSize = 22.sp)
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                    Text(text = "Mensaje 2", fontSize = 22.sp)
                }
            }
        }
        Row(
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            TextField(
                value = mensaje,
                onValueChange = { mensaje = it },
                modifier = Modifier.fillMaxWidth().weight(3f)
            )
            Button(modifier = Modifier.weight(1f) ,onClick = { /*TODO*/ }) {
                Image(painter = painterResource(id = R.drawable.flecha_enviar), contentDescription = "Enviar")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WhatsApp_PremiumTheme {
        vistaChat()
    }
}