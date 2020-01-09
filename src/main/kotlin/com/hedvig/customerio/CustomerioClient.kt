package com.hedvig.customerio

interface CustomerioClient {
    fun updateCustomer(id: String, data: Map<String, Any?>)
}