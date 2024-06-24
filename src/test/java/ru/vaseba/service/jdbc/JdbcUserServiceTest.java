package ru.vaseba.service.jdbc;

import org.springframework.test.context.ActiveProfiles;
import ru.vaseba.service.AbstractUserServiceTest;

import static ru.vaseba.Profiles.JDBC;

@ActiveProfiles(JDBC)
public class JdbcUserServiceTest extends AbstractUserServiceTest {
}