package ood.remoteControlProject;

import java.security.PublicKey;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand(); // factory setting ---- noCommand
        for (int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed (int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPushed (int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-------------- Remote Control ---------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot" + i + "]" + onCommands[i].getClass().getName()+ " "+offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }

    public void undoButtonPushed(){
        undoCommand.undo();
    }
}
