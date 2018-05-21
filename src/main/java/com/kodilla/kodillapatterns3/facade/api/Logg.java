package com.kodilla.kodillapatterns3.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logg {
    private static final Logger LOGGER = LoggerFactory.getLogger(Logg.class);

    @Before("execution(* com.kodilla.kodillapatterns3.facade.api.OrderFacade.processOrder(..))")
    public void logEvent(){
        LOGGER.info("Something is going on.");
    }
}
