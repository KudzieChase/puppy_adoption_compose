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

//Static list of puppies
val puppies = listOf(
    Puppy(
        name = "Doge",
        breed = "Shiba Inu",
        color = "Brown",
        age = 10,
        imageResource = R.drawable.retriever,
        description = "I hear you like Doge coin? How about the dog that started it all?",
        adoptionPrice = 20,
        background = R.color.bg_dog_1
    ),
    Puppy(
        name = "Lucy",
        breed = "Labrador",
        color = "Brown",
        age = 2,
        imageResource = R.drawable.retriever,
        description = "",
        adoptionPrice = 20,
        background = R.color.bg_dog_2
    ),
    Puppy(
        name = "Lucy",
        breed = "Labrador",
        color = "Brown",
        age = 2,
        imageResource = R.drawable.retriever,
        description = "",
        adoptionPrice = 20,
        background = R.color.bg_dog_3
    ),
    Puppy(
        name = "Lucy",
        breed = "Labrador",
        color = "Brown",
        age = 2,
        imageResource = R.drawable.retriever,
        description = "",
        adoptionPrice = 20,
        background = R.color.bg_dog_4
    ),
    Puppy(
        name = "Lucy",
        breed = "Labrador",
        color = "Brown",
        age = 2,
        imageResource = R.drawable.retriever,
        description = "",
        adoptionPrice = 20,
        background = R.color.bg_dog_5
    ),
    Puppy(
        name = "Lucy",
        breed = "Labrador",
        color = "Brown",
        age = 2,
        imageResource = R.drawable.retriever,
        description = "",
        adoptionPrice = 20,
        background = R.color.bg_dog_6
    ),
    Puppy(
        name = "Lucy",
        breed = "Labrador",
        color = "Brown",
        age = 2,
        imageResource = R.drawable.retriever,
        description = "",
        adoptionPrice = 20,
        background = R.color.bg_dog_7
    )
)

