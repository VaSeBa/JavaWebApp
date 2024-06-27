package ru.vaseba.service.jpa;

import org.springframework.test.context.ActiveProfiles;
import ru.vaseba.service.AbstractMealServiceTest;

import static ru.vaseba.Profiles.JPA;

@ActiveProfiles(JPA)
public class JpaMealServiceTest extends AbstractMealServiceTest {
}