package dev.jonpoulton.alakazam.theme

import android.app.Application
import android.content.SharedPreferences
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import dev.jonpoulton.alakazam.init.IAppInitialiser
import javax.inject.Inject

class AppThemeInitialiser @Inject constructor(
  private val prefs: SharedPreferences,
) : IAppInitialiser {
  override fun init(app: Application) {
    AppTheme.init(prefs)
  }
}

@InstallIn(SingletonComponent::class)
@Module
internal interface BindsAppThemeInitialiserModule {
  @Binds
  @IntoSet
  fun initialiser(bind: AppThemeInitialiser): IAppInitialiser
}
