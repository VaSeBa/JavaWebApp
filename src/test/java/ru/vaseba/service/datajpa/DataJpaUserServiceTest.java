package ru.vaseba.service.datajpa;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;
import ru.vaseba.MealTestData;
import ru.vaseba.UserTestData;
import ru.vaseba.model.User;
import ru.vaseba.service.AbstractUserServiceTest;
import ru.vaseba.util.exception.NotFoundException;

import static ru.vaseba.MealTestData.MEAL_MATCHER;
import static ru.vaseba.Profiles.DATAJPA;
import static ru.vaseba.UserTestData.*;

@ActiveProfiles(DATAJPA)
public class DataJpaUserServiceTest extends AbstractUserServiceTest {
    @Test
    public void getWithMeals() {
        User user = service.getWithMeals(USER_ID);
        USER_MATCHER.assertMatch(user, UserTestData.user);
        MEAL_MATCHER.assertMatch(user.getMeals(), MealTestData.meals);
    }

    @Test
    public void getWithMealsNotFound() {
        Assert.assertThrows(NotFoundException.class,
                () -> service.getWithMeals(NOT_FOUND));
    }
}