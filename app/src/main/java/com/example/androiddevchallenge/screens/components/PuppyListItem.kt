/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.popUpTo
import com.example.androiddevchallenge.model.Puppy

@Composable
fun PuppyItem(puppy: Puppy, navController: NavController, index: Int) {
    // I do not expect the value of puppy to change as it is static
    Card(
        modifier = Modifier
            .height(150.dp)
            .fillMaxWidth()
            .clickable {
                navController.navigate("puppyDetailScreen/$index") {
                    popUpTo(route = "puppyListScreen") {}
                }
            },
        backgroundColor = colorResource(id = puppy.background),
        contentColor = Color.DarkGray,
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(
                Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = puppy.name,
                    maxLines = 1,
                    style = MaterialTheme.typography.h6
                )
                Text(
                    text = puppy.breed,
                    maxLines = 1,
                    style = MaterialTheme.typography.caption
                )
                Text(
                    text = "$${puppy.adoptionPrice}",
                    style = MaterialTheme.typography.h5
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(id = puppy.imageResource),
                contentDescription = "Dog image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Inside
            )
        }
    }
}
