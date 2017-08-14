package javase01.t06;

/**
 * The {@code NotepadRecord} class containing String field for storage {@link Notepad}'s text.
 * Also it has getter, setter and constructor with String parameter for this field.
 */

@SuppressWarnings("WeakerAccess")
public class NotepadRecord {

    private String note;

    public NotepadRecord(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
