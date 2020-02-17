package ood.remoteControlProject;

public class SimpleRemoteControl {
    Command slot;
    Command undo;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonPressed(){
        slot.execute();
        undo = slot;
    }

    public void undoButterPressed(){
        undo.undo();  // "undo = slot" make this method loosely-coupled with slot.
    }
}
