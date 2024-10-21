package com.example.domain.resturants

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import com.example.core.models.RestaurantEntity
import kotlinx.coroutines.flow.Flow


interface ResturantUseCase {
    suspend fun getResturants(): RestaurantEntity
}

@InstallIn(ViewModelComponent::class)
@Module
object UseCaseModule {
    @ViewModelScoped
    @Provides
    fun  provideMyUseCase(resturantUseCaseImpl: ResturantUseCaseImpl): ResturantUseCase = resturantUseCaseImpl
}