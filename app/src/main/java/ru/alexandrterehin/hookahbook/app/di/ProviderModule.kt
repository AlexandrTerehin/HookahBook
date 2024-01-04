package ru.alexandrterehin.hookahbook.app.di

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.alexandrterehin.hookahbook.provider.AppResourceProvider
import ru.alexandrterehin.hookahbook.provider.ResourceProvider
import javax.inject.Singleton

@Module
class ProviderModule {

    @Provides
    @Singleton
    fun providerAppResourceProvider(context: Context): ResourceProvider {
        return AppResourceProvider(context)
    }
}