package ru.vaseba.service.datajpa;

import org.springframework.test.context.ActiveProfiles;
import ru.vaseba.service.AbstractMealServiceTest;

import static ru.vaseba.Profiles.DATAJPA;

@ActiveProfiles(DATAJPA)
public class DataJpaMealServiceTest extends AbstractMealServiceTest {
}
