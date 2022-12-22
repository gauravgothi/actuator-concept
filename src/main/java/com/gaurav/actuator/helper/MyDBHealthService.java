package com.gaurav.actuator.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyDBHealthService implements HealthIndicator {
    public static final String DB_Service="Database Services";
    public boolean isHealthGood()    {
        //custom logic
        return true;
    }

    @Override
    public Health health() {
        if (isHealthGood())
        {
            return Health.up().withDetail(DB_Service,"Database Services is running").build();
        }
        return Health.down().withDetail(DB_Service,"Database Service is down.").build();
    }
}
