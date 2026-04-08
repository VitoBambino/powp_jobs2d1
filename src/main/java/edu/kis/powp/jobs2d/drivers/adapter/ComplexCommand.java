package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.drivers.DriverCommand;

import java.util.List;

public class ComplexCommand implements DriverCommand {
    List<DriverCommand> commands;

    ComplexCommand(List<DriverCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void exsecute() {
        commands.forEach(DriverCommand::exsecute);
    }
}
