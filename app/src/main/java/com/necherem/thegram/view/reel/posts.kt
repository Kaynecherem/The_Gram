package com.necherem.thegram.view.reel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.necherem.thegram.R
import com.necherem.thegram.elements.ColoredIcon
import com.necherem.thegram.elements.DisplayText
import com.necherem.thegram.elements.ReelUpload

@Composable
fun AllReels(modifier: Modifier = Modifier) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .padding(top = 24.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween, // Evenly distribute space between items
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            val icVolume = ImageVector.vectorResource(R.drawable.volume)
            val icCamera = ImageVector.vectorResource(R.drawable.camera)

            DisplayText(
                text = "Reels",
                color = MaterialTheme.colorScheme.primary,
                modifier = modifier,
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Row(modifier = Modifier.padding(bottom = 8.dp)) {
                ColoredIcon(icVolume, MaterialTheme.colorScheme.secondary, modifier.size(32.dp))
                Spacer(modifier = Modifier.padding(8.dp))
                ColoredIcon(icCamera, MaterialTheme.colorScheme.secondary, modifier.size(32.dp))
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1350.dp)
                .background(MaterialTheme.colorScheme.surface)
                .padding(4.dp)
//                .border(BorderStroke(width = 2.dp, color = Color.Red))

        ) {
            ReelUpload(
                resourceId = R.drawable.my_pic,
                contentDescription = "null"
            )

            @Composable
            fun FloatingButtons(
                modifier: Modifier = Modifier
            ) {
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    modifier = Modifier
                        .wrapContentHeight()
                        .padding(bottom = 140.dp, end = 8.dp)
                        .align(Alignment.BottomEnd)
                ) {
                    val icLike = ImageVector.vectorResource(R.drawable.like)
                    val icComment = ImageVector.vectorResource(R.drawable.comment)
                    val icSend = ImageVector.vectorResource(R.drawable.send)
                    val icMoreVert = ImageVector.vectorResource(R.drawable.ic_dot_menu)
                    Column {
                        ColoredIcon(icLike, MaterialTheme.colorScheme.primary, modifier.size(32.dp))
                        DisplayText(
                            text = "362k",
                            color = MaterialTheme.colorScheme.secondary,
                            modifier = modifier,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Column {
                        ColoredIcon(
                            icComment,
                            MaterialTheme.colorScheme.primary,
                            modifier.size(32.dp)
                        )
                        DisplayText(
                            text = "2,665",
                            color = MaterialTheme.colorScheme.secondary,
                            modifier = modifier,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Column {
                        ColoredIcon(icSend, MaterialTheme.colorScheme.primary, modifier.size(32.dp))
                        DisplayText(
                            text = "362k",
                            color = MaterialTheme.colorScheme.secondary,
                            modifier = modifier,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Column {
                        ColoredIcon(icMoreVert, MaterialTheme.colorScheme.onPrimaryContainer, modifier.size(32.dp))
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun AllReelsPreview() {
    AllReels()
}