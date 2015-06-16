package org.abhishah.assembler;

import com.google.common.util.concurrent.ListenableFuture;

public interface Assembler {
  <T> ListenableFuture<T> data(DataComponent<T> dataComponent);

  <T> CompletedFuture<T> immediateData(DataComponent<T> dataComponent);
}
