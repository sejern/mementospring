package memento.mementospring;

public class Editor {

    private String textString;
    private String appended;

    public Snapshot makeSnapshot(){
        return new Snapshot(textString);
    }

    public void restoreFromHistory(Snapshot s){
        textString = s.getSnapshot();
    }


    public String getTextString() {
        return textString;
    }

    public void setTextString(String textString) {
        this.textString = textString;
    }
}
