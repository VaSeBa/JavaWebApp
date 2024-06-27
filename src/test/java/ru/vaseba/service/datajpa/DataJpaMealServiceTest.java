package ru.vaseba.service.datajpa;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;
import ru.vaseba.MealTestData;
import ru.vaseba.model.Meal;
import ru.vaseba.service.AbstractMealServiceTest;
import ru.vaseba.util.exception.NotFoundException;

import static ru.vaseba.MealTestData.*;
import static ru.vaseba.Profiles.DATAJPA;
import static ru.vaseba.UserTestData.*;

@ActiveProfiles(DATAJPA)
public class DataJpaMealServiceTest extends AbstractMealServiceTest {

    @Test
    public void getWithUser() {
        Meal adminMeal = service.getWithUser(ADMIN_MEAL_ID, ADMIN_ID);
        MEAL_MATCHER.assertMatch(adminMeal, adminMeal1);
        USER_MATCHER.assertMatch(adminMeal.getUser(), admin);
    }

    @Test
    public void getWithUserNotFound() {
        Assert.assertThrows(NotFoundException.class,
                () -> service.getWithUser(MealTestData.NOT_FOUND, ADMIN_ID));
    }
}
