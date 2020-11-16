package memento.mementospring;

public class Snapshot implements Memento{

    private String textString;

    public Snapshot(String textString) {
        this.textString = textString;
    }

    @Override
    public String getSnapshot() {
        return textString;
    }

    @Override
    public String toString() {
        return textString;
    }
}
