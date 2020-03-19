package com.hedvig.customerio

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper

class CustomerioMock(private val objectMapper: ObjectMapper) : CustomerioClient {

    var updates: List<Pair<String, JsonNode>> = listOf()

    override fun updateCustomer(id: String, data: Map<String, Any?>) {
        updates = updates.plus(Pair(id, objectMapper.valueToTree(data)))
    }
}
