package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

import java.util.ArrayList;
import java.util.List;

public class TriangleFactory {

    public static DriverCommand createTriangle(
            int x1, int y1,
            int x2, int y2,
            int x3, int y3,
            Job2dDriver driver) {

        List<DriverCommand> commands = new ArrayList<>();

        commands.add(new SetPositionCommand(driver, x1, y1));

        commands.add(new OperateToCommand(driver, x2, y2));
        commands.add(new OperateToCommand(driver, x3, y3));
        commands.add(new OperateToCommand(driver, x1, y1));

        return new ComplexCommand(commands);
    }
}