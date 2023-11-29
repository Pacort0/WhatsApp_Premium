package com.example.whatsapp_premium.data

import android.annotation.SuppressLint
import com.example.whatsapp_premium.data.entidades.Mensaje
import com.example.whatsapp_premium.data.entidades.Usuario
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

@SuppressLint("StaticFieldLeak")
val dbReference = Firebase.firestore

/**
 * Crea la coleccion de mensajes en la base de datos si no existe
 */
fun createCollectionMensajes() {
    if (!dbReference.collection("mensajes").equals(null)) {
        dbReference.collection("mensajes")
    } else {
        dbReference.collection("mensajes")
    }
}

/**
 * Crea la coleccion de usuarios en la base de datos si no existe
 */
fun createCollectionUsuarios() {
    if (!dbReference.collection("usuarios").equals(null)) {
        dbReference.collection("usuarios")
    } else {
        dbReference.collection("usuarios")
    }
}

/**
 * Crea mi usuario en la base de datos si no existe
 */
fun createMiUsuario(usuario: Usuario) {
    if (!dbReference.collection("usuarios").equals(null)) {
        dbReference.collection("usuarios").add(usuario)
    } else {
        dbReference.collection("usuarios").add(usuario)
    }
}


/**
 * Agrega un mensaje a la base de datos
 */
fun addMessage(mensaje: Mensaje) {
    dbReference.collection("mensajes").add(mensaje)
}

/**
 * Agrega un usuario a la base de datos
 */
fun addUsuario(usuario: Usuario) {
    dbReference.collection("usuarios").add(usuario)
}

/**
 * Obtiene los mensajes de la base de datos, segun la conversacion en la que se encuentre
 * Es decir, si se encuentra en la conversacion con el usuario 1, solo se obtendran los mensajes
 * entre yo y el usuario 1
 */
fun getMensajes(idReceptor: String, idEmisor: String) {
    dbReference.collection("mensajes")
        .whereEqualTo("idReceptor", idReceptor)
        .whereEqualTo("idEmisor", idEmisor)
        .get()
}