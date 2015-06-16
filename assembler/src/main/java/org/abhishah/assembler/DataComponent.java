package org.abhishah.assembler;

import java.util.concurrent.Callable;

public interface DataComponent<T> extends Callable<T> {
  T getResult();
}
