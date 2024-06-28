package ru.vaseba.service.jdbc;

import org.junit.Ignore;
import org.springframework.test.context.ActiveProfiles;
import ru.vaseba.service.AbstractMealServiceTest;

import static ru.vaseba.Profiles.JDBC;

@ActiveProfiles(JDBC)
public class JdbcMealServiceTest extends AbstractMealServiceTest {
    @Override
    @Ignore
    public void createWithException() throws Exception {
    }
}