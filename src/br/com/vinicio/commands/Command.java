package br.com.vinicio.commands;

import br.com.vinicio.editor.Editor;

public abstract class Command {
    public Editor editor;
    public String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    void backup(){
        backup = editor.getTextField().getText();
    }

    public void undo(){
        editor.getTextField().setText(backup);
    }

    public abstract boolean execute();
}
