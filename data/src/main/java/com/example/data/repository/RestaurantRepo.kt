package com.example.data.repository

import com.example.core.models.RestaurantModel
import com.example.data.ResturantNetwrokDataRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped


interface RestaurantRepo {

    suspend fun getRestaurants(): DataResponse
}

@InstallIn(ViewModelComponent::class)
@Module
 object UseCaseModule {
    @ViewModelScoped
     @Provides
     fun  provideMyUseCase(resturantUseCaseImpl: ResturantNetwrokDataRepo): RestaurantRepo = resturantUseCaseImpl
}


sealed class DataResponse {
    data class Success(val data: RestaurantModel) : DataResponse()
    data class Error(val message: String) : DataResponse()

}