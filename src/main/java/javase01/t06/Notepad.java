package javase01.t06;

/**
 * The {@code Notepad} class creates a notepad for a given number of notes with abilities to add, delete, edit and
 * printAll this notes which are described as {@link NotepadRecord}.
 */

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class Notepad {

    /**
     * Array of stored notes
     */
    private NotepadRecord[] notes;

    /**
     * Constructor with Int parameter which sets count of notes in notepad
     * @param countOfNotes Sets count of notes in notepad array
     */
    public Notepad(int countOfNotes) {
        this.notes  = new NotepadRecord[countOfNotes];
    }

    /**
     * Adds a new record to notepad array.
     * @param note Text which need to be added as note
     * @return {@code true} - Note was added <br>
     *         {@code false} - Current notepad is full, so note wasn't added
     */
    public boolean addNote(String note) {
        for (int i = 0; i < notes.length; i++) {
            if (null == notes[i]) {
                notes[i] = new NotepadRecord(note);
                return true;
            }
        }
        return false;
    }

    /**
     * Deletes a note by index in notepad array.
     * Also it doesn't throw an exception if note by this index is already empty.
     * @param index Index of note which need to be deleted
     * @throws ArrayIndexOutOfBoundsException Index out of array range
     */
    public void deleteNote(int index) throws ArrayIndexOutOfBoundsException {
        if ((index >= 0) && (index < notes.length))
            notes[index] = null;
        else
            throw new ArrayIndexOutOfBoundsException("Index out of acceptable range");
    }

    /**
     * Edits a note by index in notepad array.
     * @param index Index of note which need to be edited
     * @param newNote Text which need to be added as new value of note
     * @throws NullPointerException There is no note for this index
     * @throws ArrayIndexOutOfBoundsException Index out of array range
     */
    public void editNote(int index, String newNote) throws NullPointerException, ArrayIndexOutOfBoundsException {
        if ((index >= 0) && (index < notes.length)) {
            if (notes[index] != null)
                notes[index].setNote(newNote);
            else
                throw new NullPointerException("There is no note for this index");
        }
        else
            throw new ArrayIndexOutOfBoundsException("Index out of acceptable range");
    }

    /**
     * Prints all notes to System.out in form of table "[indexOfNote]: 'text'".
     */
    public void printAllNotes() {
        System.out.println("Notes in this notepad:");
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != null)
                System.out.println("[" + i + "]: '" + notes[i].getNote() + "'");
        }
    }
}
