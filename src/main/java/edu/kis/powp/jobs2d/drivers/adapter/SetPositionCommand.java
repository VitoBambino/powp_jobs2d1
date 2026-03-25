package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

public class SetPositionCommand implements DriverCommand {
    private final Job2dDriver driver;
    public int x,y;
    SetPositionCommand(Job2dDriver driver, int x, int y) {
        this.driver = driver;
        this.x = x;
        this.y = y;
    }

    @Override
    public void exsecute() {
        driver.setPosition(x,y);
    }


}
