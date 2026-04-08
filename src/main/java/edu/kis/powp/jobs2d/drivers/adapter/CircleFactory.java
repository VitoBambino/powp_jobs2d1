package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

import java.util.ArrayList;
import java.util.List;

public class CircleFactory {

    public static DriverCommand createCircle(
            int centerX, int centerY, int radius, Job2dDriver driver) {

        List<DriverCommand> commands = new ArrayList<>();
        int segments = 36; // im więcej segmentów, tym gładszy okrąg

        for (int i = 0; i <= segments; i++) {
            double angle = 2 * Math.PI * i / segments;
            int x = centerX + (int) (radius * Math.cos(angle));
            int y = centerY + (int) (radius * Math.sin(angle));

            if (i == 0) {
                commands.add(new SetPositionCommand(driver, x, y));
            } else {
                commands.add(new OperateToCommand(driver, x, y));
            }
        }

        return new ComplexCommand(commands);
    }
}