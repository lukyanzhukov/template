// Generated by Dagger (https://google.github.io/dagger).
package com.education.android.geophysics.feature.calculate.data.datasource.db.dagger;

import com.education.android.geophysics.feature.calculate.data.datasource.db.CacheDataDao;
import com.education.android.geophysics.сore.data.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DataCacheModule_ProvideCachePlacesDaoFactory implements Factory<CacheDataDao> {
  private final DataCacheModule module;

  private final Provider<AppDatabase> appDatabaseProvider;

  public DataCacheModule_ProvideCachePlacesDaoFactory(
      DataCacheModule module, Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public CacheDataDao get() {
    return provideCachePlacesDao(module, appDatabaseProvider.get());
  }

  public static DataCacheModule_ProvideCachePlacesDaoFactory create(
      DataCacheModule module, Provider<AppDatabase> appDatabaseProvider) {
    return new DataCacheModule_ProvideCachePlacesDaoFactory(module, appDatabaseProvider);
  }

  public static CacheDataDao provideCachePlacesDao(
      DataCacheModule instance, AppDatabase appDatabase) {
    return Preconditions.checkNotNull(
        instance.provideCachePlacesDao(appDatabase),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}