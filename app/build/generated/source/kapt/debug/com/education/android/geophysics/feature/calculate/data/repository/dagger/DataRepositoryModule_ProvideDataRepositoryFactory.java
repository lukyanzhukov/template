// Generated by Dagger (https://google.github.io/dagger).
package com.education.android.geophysics.feature.calculate.data.repository.dagger;

import com.education.android.geophysics.feature.calculate.data.datasource.api.DataApiDataSource;
import com.education.android.geophysics.feature.calculate.data.datasource.db.DataCacheDataSource;
import com.education.android.geophysics.feature.calculate.data.repository.DataRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DataRepositoryModule_ProvideDataRepositoryFactory
    implements Factory<DataRepository> {
  private final DataRepositoryModule module;

  private final Provider<DataApiDataSource> apiDataSourceProvider;

  private final Provider<DataCacheDataSource> cacheDataSourceProvider;

  public DataRepositoryModule_ProvideDataRepositoryFactory(
      DataRepositoryModule module,
      Provider<DataApiDataSource> apiDataSourceProvider,
      Provider<DataCacheDataSource> cacheDataSourceProvider) {
    this.module = module;
    this.apiDataSourceProvider = apiDataSourceProvider;
    this.cacheDataSourceProvider = cacheDataSourceProvider;
  }

  @Override
  public DataRepository get() {
    return provideDataRepository(
        module, apiDataSourceProvider.get(), cacheDataSourceProvider.get());
  }

  public static DataRepositoryModule_ProvideDataRepositoryFactory create(
      DataRepositoryModule module,
      Provider<DataApiDataSource> apiDataSourceProvider,
      Provider<DataCacheDataSource> cacheDataSourceProvider) {
    return new DataRepositoryModule_ProvideDataRepositoryFactory(
        module, apiDataSourceProvider, cacheDataSourceProvider);
  }

  public static DataRepository provideDataRepository(
      DataRepositoryModule instance,
      DataApiDataSource apiDataSource,
      DataCacheDataSource cacheDataSource) {
    return Preconditions.checkNotNull(
        instance.provideDataRepository(apiDataSource, cacheDataSource),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}