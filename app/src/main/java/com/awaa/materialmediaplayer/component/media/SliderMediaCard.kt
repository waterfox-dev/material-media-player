package com.awaa.materialmediaplayer.component.media

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.awaa.materialmediaplayer.R

@Composable
fun SliderMediaCard(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    )
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .align(androidx.compose.ui.Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(id = R.drawable.media_cover_placeholder),
                contentDescription = "Media Cover",
                modifier = Modifier.clip(RoundedCornerShape(8.dp))
            )

            Text(
                text = "Media Title",
                fontWeight = Bold,
                fontSize = 18.sp,
                modifier = Modifier.padding(8.dp, 8.dp, 8.dp, 2.dp)
            )
            Text(
                text = "Media Artist",
                fontSize = 14.sp,
                modifier = Modifier.padding(8.dp, 2.dp, 8.dp, 8.dp)
            )
            Row(
                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(
                    text = "00:00",
                    fontSize = 14.sp,

                    )
                Slider(
                    value = 0f,
                    onValueChange = { /*TODO*/ },
                    colors = SliderDefaults.colors(
                        thumbColor = Color.Black,
                        activeTrackColor = Color.Gray,
                        inactiveTrackColor = Color.LightGray
                    ),
                    modifier = Modifier
                        .width(220.dp)
                        .padding(8.dp)
                        .background(Color.Transparent)
                )
                Text(
                    text = "00:00",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .width(48.dp)
                )
            }
        }
    }
}