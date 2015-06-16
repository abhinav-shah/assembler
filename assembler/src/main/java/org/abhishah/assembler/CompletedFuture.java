package org.abhishah.assembler;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CompletedFuture<V> implements Future<V> {

  private V result;

  public CompletedFuture(V result) {
    this.result = result;
  }

  public boolean cancel(boolean mayInterruptIfRunning) {
    return false;
  }

  public boolean isCancelled() {
    return false;
  }

  public boolean isDone() {
    return true;
  }

  public V get() throws InterruptedException, ExecutionException {
    return this.result;
  }

  public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException,
      TimeoutException {
    return this.result;
  }

}
