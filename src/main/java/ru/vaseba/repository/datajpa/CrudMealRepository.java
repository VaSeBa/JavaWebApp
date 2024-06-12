package ru.vaseba.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vaseba.model.Meal;

public interface CrudMealRepository extends JpaRepository<Meal, Integer> {

}
