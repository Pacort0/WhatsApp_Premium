package com.example.whatsapp_premium.data.entidades

import java.sql.Timestamp

data class Mensaje(
    val id:Int,
    val mensaje:String,
    val timestamp: Timestamp,
    val idSender:Int,
    val idReceiver:Int,
    val noLlega:Int
)
