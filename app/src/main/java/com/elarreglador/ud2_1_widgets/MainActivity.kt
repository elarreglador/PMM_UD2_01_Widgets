package com.elarreglador.ud2_1_widgets

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WidgetsDemo()
        }
    }
}

@Composable
fun WidgetsDemo() {
    // Estado para cada widget
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var isChecked by remember { mutableStateOf(false) }
    var sliderValue by remember { mutableFloatStateOf(0.5f) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Text
        Text(text = "Widgets comunes en Jetpack Compose", fontSize = 24.sp)

        // Separacion
        Spacer(modifier = Modifier.height(36.dp))

        // TextField
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nombre") }
        )

        // Separacion
        Spacer(modifier = Modifier.height(16.dp))

        // Button
        Button(onClick = { /* Acción del botón */ }) {
            Text("Enviar")
        }

        // Checkbox
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = isChecked,
                onCheckedChange = { isChecked = it }
            )
            Text("Aceptar términos y condiciones")
        }

        // Separacion
        Spacer(modifier = Modifier.height(16.dp))

        // Slider
        Text(text = "Nivel de satisfacción: ${(sliderValue*10).toInt()}")
        Slider(
            value = sliderValue,
            onValueChange = { sliderValue = it },
            valueRange = 0f..1f,
            steps = 9 // 0 a 10
        )

        Row { // Fila con las dos imagenes
            Image(
                painter = painterResource(id = R.drawable.ic_dialog_info),
                contentDescription = "Ícono de información",
                modifier = Modifier.size(120.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))

            Image(
                painter = painterResource(id = R.drawable.ic_dialog_info),
                contentDescription = "Ícono de información",
                modifier = Modifier.size(120.dp)
            )
        }
    }
}

@Preview(
    showSystemUi = true ,
    device = "id:pixel_4")
@Composable
fun Preview() {
    WidgetsDemo()
}