package alakazam.di.hilt

import alakazam.android.core.ActivityLauncher
import alakazam.android.core.SnackbarFeed
import alakazam.android.core.Toaster
import alakazam.kotlin.core.MainDispatcher
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.datetime.Clock
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
public class ProvidesCoreModule {
  @Provides
  public fun launcher(
    @ApplicationContext context: Context,
  ): ActivityLauncher = ActivityLauncher(context)

  @Provides
  @Singleton
  public fun snackbarFeed(): SnackbarFeed = SnackbarFeed()

  @Provides
  public fun clock(): Clock = Clock.System

  @Provides
  public fun toaster(
    @ApplicationContext context: Context,
    main: MainDispatcher,
  ): Toaster = Toaster(main, appContext = context, resourcesContext = context)
}
