package com.wwang.mybackendkickstarter.presentation.graphql.queries

import graphql.kickstart.tools.GraphQLQueryResolver
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.springframework.stereotype.Service

@ExperimentalCoroutinesApi
@Service
class Query : GraphQLQueryResolver {
    suspend fun exampleQuery(input: Boolean): Boolean {
        return true
    }
}