package com.example.cafeemcasa.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cafeemcasa.data.order
import com.example.cafeemcasa.models.Status
import com.example.cafeemcasa.ui.theme.CafeEmCasaTheme
import com.example.cafeemcasa.ui.theme.LightGrey



@Composable
fun OrderStatusScreen( ) {
    Column {
        order.status.forEachIndexed { index, status ->
            val isFirst = index == 0
            val isLast = index == order.status.size - 1
            val styleType = if(isFirst) OrderStyleTypes.First else if(isLast) OrderStyleTypes.Last else OrderStyleTypes.Normal
            OrderStatusItem(styleType, status)
        }
    }
}

enum class OrderStyleTypes {
    First,
    Normal,
    Last,
}

@Composable
fun OrderStatusItem(orderStyleTypes: OrderStyleTypes = OrderStyleTypes.Normal , status: Status) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(horizontal = 8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Box(modifier = Modifier.height(8.dp).width(2.dp).background(if(orderStyleTypes == OrderStyleTypes.First) Color.Transparent else LightGrey))
            Spacer(modifier = Modifier.size(4.dp))
            Icon(Icons.Outlined.CheckCircle, contentDescription = "Status", modifier = Modifier.size(24.dp))
            Spacer(modifier = Modifier.size(4.dp))
            Box(modifier = Modifier.height(32.dp).width(2.dp).background(if(orderStyleTypes == OrderStyleTypes.Last) Color.Transparent else LightGrey))
            Spacer(modifier = Modifier.size(2.dp))
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column(modifier = Modifier.height(66.dp).padding(top = 12.dp))  {
            Text(status.status.label, style = MaterialTheme.typography.bodyLarge)
            Text(status.time, style = MaterialTheme.typography.displayLarge.copy(color = MaterialTheme.colorScheme.tertiary)  )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OrderStatusPreview() {
    CafeEmCasaTheme{
        OrderStatusScreen()
    }
}