package org.abhishah.assembler;

import com.google.common.util.concurrent.ListenableFuture;

public class SimpleAssembler implements Assembler {

  public <T> ListenableFuture<T> data(DataComponent<T> dataComponent) {
    // TODO Auto-generated method stub
    return null;
  }

  public <T> CompletedFuture<T> immediateData(DataComponent<T> dataComponent) {
    // TODO Auto-generated method stub
    return null;
  }

}
