package com.example.cafeemcasa.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cafeemcasa.R
import com.example.cafeemcasa.components.AppButton
import com.example.cafeemcasa.components.AppButtonType



@Composable
 fun LoginScreen(onSuccessfulLogin: () -> Unit) {
 Column(modifier =  Modifier.background(Color.White)) {
  Image(painter =  painterResource(id = R.drawable.logo_home), contentDescription = "Logo")
  Spacer(modifier = Modifier.weight(1f))
  Column (modifier = Modifier.padding(10.dp)) {
   AppButton("Login with Google", onClick = onSuccessfulLogin,  type = AppButtonType.Secondary)
   Spacer(modifier = Modifier.height(10.dp))
   AppButton("Continue as Guest", onClick = onSuccessfulLogin,  type = AppButtonType.Primary)
   Spacer(modifier = Modifier.height(20.dp))
   Text("By continuing, you agree to our Terms of Service and Privacy Policy.", style = TextStyle(color = MaterialTheme.colorScheme.tertiary, textAlign = TextAlign.Center))
   Spacer(modifier = Modifier.height(20.dp))
  }
 }
 }

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen(onSuccessfulLogin = {})
}