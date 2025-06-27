package com.example.cafeemcasa.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppHeader(text: String, goBack: (() -> Unit)? = null) {

    CenterAlignedTopAppBar(
           title = {  Text(text, style = MaterialTheme.typography.titleLarge.copy(fontSize = 18.sp), color = MaterialTheme.colorScheme.onBackground, ) },
           navigationIcon = {
               if(goBack != null) {
                   IconButton(onClick = goBack) {
                       Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Voltar")
                   }
               }
           },
         colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
             containerColor = MaterialTheme.colorScheme.background,
             titleContentColor = MaterialTheme.colorScheme.onBackground,
             navigationIconContentColor = MaterialTheme.colorScheme.onBackground
         )
       )
}


@Preview(backgroundColor = 16777215, showBackground = true)
@Composable
fun AppHeaderPreview() {
    AppHeader("TESTES TESTE")
}