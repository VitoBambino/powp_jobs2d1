package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

import java.util.ArrayList;
import java.util.List;

public class RectangleFactory {

    public static DriverCommand createRectangle(
            int x, int y, int width, int height, Job2dDriver driver) {

        List<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(driver, x, y));
        commands.add(new OperateToCommand(driver, x + width, y));
        commands.add(new OperateToCommand(driver, x + width, y + height));
        commands.add(new OperateToCommand(driver, x, y + height));
        commands.add(new OperateToCommand(driver, x, y));

        return new ComplexCommand(commands);
    }
}