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
package com.example.androiddevchallenge.model

import androidx.annotation.ColorRes
import com.example.androiddevchallenge.R

data class Puppy(
    val name: String,
    val breed: String,
    val color: String,
    val age: Int,
    val imageResource: Int,
    val description: String,
    val adoptionPrice: Int,
    @ColorRes val background: Int
)

// Static list of puppies
val puppies = listOf(
    Puppy(
        name = "Doge",
        breed = "Shiba Inu",
        color = "Brown",
        age = 10,
        imageResource = R.drawable.shiba,
        description = "I hear you like Doge coin? How about the dog that started it all?",
        adoptionPrice = 20,
        background = R.color.bg_dog_1
    ),
    Puppy(
        name = "Lucy",
        breed = "Pit Bull",
        color = "White",
        age = 12,
        imageResource = R.drawable.dog_2,
        description = "Full of Joy, Lucy is both cute and super adorable. She just needs a home",
        adoptionPrice = 40,
        background = R.color.bg_dog_2
    ),
    Puppy(
        name = "Max",
        breed = "Retriever",
        color = "Cream",
        age = 3,
        imageResource = R.drawable.retriever,
        description = "A fun intelligent pup named Max. I promise you won't regret adopting this one",
        adoptionPrice = 100,
        background = R.color.bg_dog_3
    ),
    Puppy(
        name = "Homer",
        breed = "Shiba Inu",
        color = "Brown",
        age = 10,
        imageResource = R.drawable.shiba,
        description = "I hear you like Doge coin? How about the dog that started it all?",
        adoptionPrice = 76,
        background = R.color.bg_dog_4
    ),
    Puppy(
        name = "Laura",
        breed = "Pit Bull",
        color = "White",
        age = 12,
        imageResource = R.drawable.dog_2,
        description = "Full of Joy, Lucy is both cute and super adorable. She just needs a home",
        adoptionPrice = 15,
        background = R.color.bg_dog_5
    ),
    Puppy(
        name = "Maximus",
        breed = "Retriever",
        color = "Cream",
        age = 3,
        imageResource = R.drawable.retriever,
        description = "A fun intelligent pup named Max. I promise you won't regret adopting this one",
        adoptionPrice = 30,
        background = R.color.bg_dog_6
    ),
    Puppy(
        name = "Keisha",
        breed = "Pit Bull",
        color = "White",
        age = 12,
        imageResource = R.drawable.dog_2,
        description = "Full of Joy, Lucy is both cute and super adorable. She just needs a home",
        adoptionPrice = 25,
        background = R.color.bg_dog_7
    )
)
