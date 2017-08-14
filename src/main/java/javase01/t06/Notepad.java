package javase01.t06;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class Notepad {

    private NotepadRecord[] notes;

    public Notepad (int countOfNotes) {
        this.notes  = new NotepadRecord[countOfNotes];
    }

    public boolean addNote(String note) {
        for (int i = 0; i < notes.length; i++) {
            if (null == notes[i]) {
                notes[i] = new NotepadRecord(note);
                return true;
            }
        }
        return false;
    }

    public void deleteNote (int index) {
        if ((index >= 0) && (index < notes.length))
            notes[index] = null;
        else
            throw new ArrayIndexOutOfBoundsException("Index out of acceptable range");
    }

    public void editNote (int index, String newNote) {
        if ((index >= 0) && (index < notes.length)) {
            if (notes[index] != null)
                notes[index].setNote(newNote);
            else
                throw new NullPointerException("There is no note for this index");
        }
        else
            throw new ArrayIndexOutOfBoundsException("Index out of acceptable range");
    }
}
