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
package com.example.androiddevchallenge.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.puppies

@Composable
fun PuppyDetailScreen(navController: NavController, puppyIndex: String?) {
    val puppy = puppies[puppyIndex!!.toInt()]
    Column {
        PuppyCard(
            puppyImage = puppy.imageResource,
            puppyBackground = puppy.background
        )
        Spacer(modifier = Modifier.size(12.dp))
        PuppyDetail(puppy)
    }
}

@Composable
fun PuppyCard(
    puppyImage: Int,
    puppyBackground: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier
            .fillMaxWidth()
            .padding(12.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Card(
            backgroundColor = colorResource(puppyBackground),
            modifier = modifier
                .width(300.dp)
                .height(300.dp),
            shape = RoundedCornerShape(4.dp),
            elevation = 8.dp
        ) {
            Image(
                painter = painterResource(puppyImage),
                contentDescription = "Puppy Image",
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Composable
fun PuppyDetail(puppy: Puppy) {

    Column(modifier = Modifier.padding(12.dp)) {
        Row {
            Text(
                text = puppy.name,
                style = MaterialTheme.typography.h6,
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "$${puppy.adoptionPrice}",
                color = Color.Red,
                style = MaterialTheme.typography.h6
            )
        }
        Spacer(modifier = Modifier.size(10.dp))
        Row {
            Column(verticalArrangement = Arrangement.Center) {
                Text(text = "Age:", color = colorResource(id = puppy.background))
                Spacer(modifier = Modifier.size(10.dp))
                Text(text = "${puppy.age} months")
            }
            Spacer(modifier = Modifier.weight(1f))
            Column {
                Text(text = "Color:", color = colorResource(id = puppy.background))
                Spacer(modifier = Modifier.size(10.dp))
                Text(text = puppy.color)
            }
        }
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = "Description:", color = colorResource(id = puppy.background))
        Row {
            Text(text = puppy.description)
        }
        Spacer(modifier = Modifier.size(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Adopt Now")
            }
        }
    }
}
