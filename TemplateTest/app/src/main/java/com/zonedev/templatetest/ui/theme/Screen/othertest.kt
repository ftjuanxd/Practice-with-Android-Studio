package com.zonedev.templatetest.ui.theme.Screen

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zonedev.templatetest.R
import com.zonedev.templatetest.ui.theme.Component.BaseScreen
import com.zonedev.templatetest.ui.theme.Component.ButtonApp
import com.zonedev.templatetest.ui.theme.Component.CustomTextField
import com.zonedev.templatetest.ui.theme.Component.Separetor
import com.zonedev.templatetest.ui.theme.Component.UploadFileScreen


@Composable
fun Theme_Observations(){
    BaseScreen(stringResource(R.string.Name_Interfaz_Observations),R.drawable.notificacion,R.drawable.logo_menu_burger,
        { Components_Observations() },20.sp,40.dp,100.dp)
}
@Composable
fun Components_Observations(){
    var subject by remember { mutableStateOf("") }
    var observations by remember { mutableStateOf("") }
    //TextField Subject
    CustomTextField(
        value = subject,
        label = stringResource(R.string.label_subject),
        onValueChange = { subject = it },
        isEnabled = true,
        KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Next,
        )
    )
    CustomTextField(
        value = observations,
        label = stringResource(R.string.label_observations),
        onValueChange = { observations = it },
        isEnabled = true,
        KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Done,
        ),
        pdHeight = 140.dp
    )
    UploadFileScreen()
    Separetor()
    // Usamos ButtonApp aquí también
    ButtonApp(text = stringResource(R.string.button_submit),{/*TODO*/})
}