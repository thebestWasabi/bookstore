package ru.khamzin.repository;

import java.util.List;

public interface BasicRepository<T, Id> {

    T getById(Id id);

    List<T> getAll();

    T save(T t);

    T update(T t);

    void delete(Id id);

}
