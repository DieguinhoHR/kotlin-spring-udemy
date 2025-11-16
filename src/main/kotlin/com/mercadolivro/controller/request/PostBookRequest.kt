package com.mercadolivro.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import java.math.BigDecimal
import javax.validation.constraints.*

data class PostBookRequest (

    @field:NotEmpty(message = "Nome deve ser válido")
    val name: String,

    @field:NotNull(message = "Price deve ser informado")
    val price: BigDecimal,

    @JsonAlias("customer_id")
    var customerId: Int
)