package com.kodilla.kodillapatterns3.aop.calculator;

import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Watcher {
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Watcher.class);

    @Before("execution(* com.kodilla.kodillapatterns3.aop.calculator.Calculator.factorial(..))")
    public void logEvent() {
        LOGGER.info("Logging the event");
    }

}
