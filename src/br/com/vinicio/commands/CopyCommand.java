package br.com.vinicio.commands;

import br.com.vinicio.editor.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.setClipboard(editor.getTextField().getSelectedText());
        return false;
    }
}
