package com.kanyideveloper.dlight.domain.use_case

import com.kanyideveloper.dlight.domain.model.User
import com.kanyideveloper.dlight.domain.repository.UserRepository
import com.kanyideveloper.dlight.util.Resource
import kotlinx.coroutines.flow.Flow
import timber.log.Timber

class GetUserData(private val userRepository: UserRepository) {
    suspend operator fun invoke(username: String): Flow<Resource<User>> {

        // TODO: Do validation to check if username is empty or not
        val user = userRepository.getUser(username)
        //Timber.d("User: $user")
        return user
    }
}