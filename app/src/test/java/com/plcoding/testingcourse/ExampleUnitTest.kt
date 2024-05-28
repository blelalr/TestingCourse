package com.plcoding.testingcourse

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @BeforeEach
    fun setUp() {
        // Do something before each test
    }

    @AfterEach
    fun tearDown() {
        // Do something after each test
        // for example, close a network connection or disconnect from a database
    }

    @Test
    fun addition_isCorrect() {
        assertThat(2 + 2).isEqualTo(4)
    }
}