package com.hedvig.customerio

import com.fasterxml.jackson.databind.ObjectMapper
import kotlin.test.Test
import okhttp3.OkHttpClient

class CustomerioTest {
    @Test fun testSomeLibraryMethod() {
        val classUnderTest = Customerio("", "", ObjectMapper(), OkHttpClient())
    }
}
