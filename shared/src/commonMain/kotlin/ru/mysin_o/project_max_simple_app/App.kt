package ru.mysin_o.project_max_simple_app

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun sayHello() {
    println("Hello World KMP")
}

@Composable
fun SayHelloFromCommon() {
    Box(modifier = Modifier.size(200.dp)) {
        Text(
            text = "Hello World KMP from compose common",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}