package br.com.vinicio.commands;

import br.com.vinicio.editor.Editor;

public class PasteCommand extends Command{

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if(editor.getClipboard() == null || editor.getClipboard().isEmpty()){
            return false;
        }
        backup();
        editor.getTextField().insert(editor.getClipboard(), editor.getTextField().getCaretPosition());
        return true;
    }
}
