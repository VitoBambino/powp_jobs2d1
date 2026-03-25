package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

import java.util.List;

public class ComplexCommand implements DriverCommand {
    List<DriverCommand> commands;

    ComplexCommand(List<DriverCommand> commands, Job2dDriver driver) {
        this.commands = commands;
    }

    @Override
    public void exsecute() {
        commands.forEach(DriverCommand::exsecute);
    }
}
