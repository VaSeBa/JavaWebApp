package ru.vaseba.service.jpa;

import org.springframework.test.context.ActiveProfiles;
import ru.vaseba.service.AbstractUserServiceTest;

import static ru.vaseba.Profiles.JPA;

@ActiveProfiles(JPA)
public class JpaUserServiceTest extends AbstractUserServiceTest {
}