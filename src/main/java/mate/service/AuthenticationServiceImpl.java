package mate.service;

import java.util.Optional;
import mate.controller.LoginController;
import mate.exception.AuthenticationException;
import mate.lib.Inject;
import mate.lib.Service;
import mate.model.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(LoginController.class);
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isEmpty() || !driver.get().getPassword().equals(password)) {
            logger.error("Username or password was incorrect");
            throw new AuthenticationException("Username or password was incorrect");
        }
        logger.info("Driver " + driver.get().getName() + " login successfully");
        return driver.get();
    }
}
