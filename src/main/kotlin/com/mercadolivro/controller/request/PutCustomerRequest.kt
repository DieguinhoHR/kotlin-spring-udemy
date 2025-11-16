package com.mercadolivro.controller.request

import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class PutCustomerRequest(
    @field:NotEmpty(message = "Nome deve ser válido")
    var name: String,

    @field:Email(message = "Email deve ser válido")
    var email: String
)