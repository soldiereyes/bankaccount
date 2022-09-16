package com.example.bankaccount

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.Optional

interface AccountRepository : MongoRepository<Account, String> {

    fun findByDocument(document: String): Optional<Account>

}