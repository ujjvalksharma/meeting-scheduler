package org.example.repository;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class BaseRepository<T> {
  Map<Integer,T> db = new HashMap<>();

  public T save(int id, T t) {
    db.put(id, t);
    return t;
  }

  public T findById(int id) {
    return db.get(id);
  }

  public List<T> findAll() {
    return db.values().stream().collect(Collectors.toList());
  }

  public T deleteById(int id) {
    T t = db.get(id);
    db.remove(id);
    return t;
  }
}
