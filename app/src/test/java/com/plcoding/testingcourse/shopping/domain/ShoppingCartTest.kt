package com.plcoding.testingcourse.shopping.domain

import assertk.assertFailure
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource

internal class ShoppingCartTest {

    private lateinit var cart: ShoppingCart

    @BeforeEach
    fun setUp() {
        cart = ShoppingCart()
    }
    @ParameterizedTest
    @CsvSource(
        "3, 15.0",
        "0, 0.0",
        "6, 30.0",
        "20, 100.0"
    )

    fun `Add multiple products, total price sum is correct`(
        quantity: Int,
        expectedPriceSum: Double
    ) {
        //Arrange
        val product  = Product(
            id= 0,
            name = "ice cream",
            price = 5.0
        )

        cart.addProduct(product, quantity)

        //Action
        val priceSum = cart.getTotalCost()

        //Assertion
        assertThat(priceSum).isEqualTo(expectedPriceSum)
    }

    @RepeatedTest(100)
    fun `Add product with negative quantity, throws Exception`() {
        val product  = Product(
            id= 0,
            name = "ice cream",
            price = 5.0
        )

        assertFailure {
            cart.addProduct(product, -5)
        }
    }
}