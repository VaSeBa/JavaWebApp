package ru.vaseba.service.jdbc;

import org.junit.Ignore;
import org.springframework.test.context.ActiveProfiles;
import ru.vaseba.service.AbstractUserServiceTest;

import static ru.vaseba.Profiles.JDBC;

@ActiveProfiles(JDBC)
@Ignore
public class JdbcUserServiceTest extends AbstractUserServiceTest {
    @Override
    @Ignore
    public void createWithException() throws Exception {
    }
}