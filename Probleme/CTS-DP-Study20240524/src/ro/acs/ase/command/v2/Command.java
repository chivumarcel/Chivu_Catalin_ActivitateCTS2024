package ro.acs.ase.command.v2;

public interface Command {
    void execute();
    void undo();
}
