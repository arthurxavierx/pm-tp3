package br.ufmg.dcc052.oncebook.storage;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;

/**
 * Created by xavier on 6/6/16.
 */
public interface IRepository<T, K> {

  @Nullable
  T getById(@NonNull K id);

  List<T> getAll();

  void save(@NonNull T entity);

  void delete(@NonNull T entity);
}
