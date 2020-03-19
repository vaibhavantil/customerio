package com.hedvig.customerio

import com.fasterxml.jackson.databind.ObjectMapper
import okhttp3.OkHttpClient

fun main(args: Array<String>) {

    for (l in args) {
        println(l)
    }

    val siteId = System.getenv("CUSTOMERIO_SITE_ID")
    val secretApiKey = System.getenv("CUSTOMERIO_SECRET_API_KEY")

    val objectMapper = ObjectMapper()

    val okhttp = OkHttpClient()
    val client = Customerio(siteId, secretApiKey, objectMapper, okhttp)

    client.updateCustomer("340415442", mapOf("test1" to "värde13", "test2" to null))

    okhttp.connectionPool.evictAll()
}
