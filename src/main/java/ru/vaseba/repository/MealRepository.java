package ru.vaseba.repository;

import ru.vaseba.model.Meal;

import java.util.Collection;

public interface MealRepository {
    // null if not found, when updated
    Meal save(Meal meal);

    // false if not found
    boolean delete(int id);

    // null if not found
    Meal get(int id);

    Collection<Meal> getAll();
}
