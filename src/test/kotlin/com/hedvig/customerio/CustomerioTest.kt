package com.hedvig.customerio

import com.fasterxml.jackson.databind.ObjectMapper
import okhttp3.OkHttpClient
import kotlin.test.Test

class CustomerioTest {
    @Test fun testSomeLibraryMethod() {
        val classUnderTest = Customerio("", "", ObjectMapper(), OkHttpClient())
    }
}
