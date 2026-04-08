package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

public class OperateToCommand implements DriverCommand {
    private Job2dDriver driver;
    private final int x, y;

    public OperateToCommand(Job2dDriver driver,int x,int y) {
        this.driver = driver;
        this.x = x;
        this.y = y;
    }

    @Override
    public void exsecute() {
        driver.operateTo(x,y);
    }
}
