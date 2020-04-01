package com.hedvig.customerio

interface CustomerioClient {
    fun updateCustomer(id: String, data: Map<String, Any?>)
    fun deleteCustomer(id: String)
    fun sendEvent(id: String, data: Map<String, Any?>)
}
