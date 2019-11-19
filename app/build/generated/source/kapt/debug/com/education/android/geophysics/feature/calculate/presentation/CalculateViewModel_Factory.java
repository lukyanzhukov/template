// Generated by Dagger (https://google.github.io/dagger).
package com.education.android.geophysics.feature.calculate.presentation;

import com.education.android.geophysics.feature.calculate.domain.usecases.GetDataUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CalculateViewModel_Factory implements Factory<CalculateViewModel> {
  private final Provider<GetDataUseCase> getDataUseCaseProvider;

  public CalculateViewModel_Factory(Provider<GetDataUseCase> getDataUseCaseProvider) {
    this.getDataUseCaseProvider = getDataUseCaseProvider;
  }

  @Override
  public CalculateViewModel get() {
    return new CalculateViewModel(getDataUseCaseProvider.get());
  }

  public static CalculateViewModel_Factory create(Provider<GetDataUseCase> getDataUseCaseProvider) {
    return new CalculateViewModel_Factory(getDataUseCaseProvider);
  }

  public static CalculateViewModel newInstance(GetDataUseCase getDataUseCase) {
    return new CalculateViewModel(getDataUseCase);
  }
}