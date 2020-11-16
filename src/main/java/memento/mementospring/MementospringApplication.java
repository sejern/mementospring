package memento.mementospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MementospringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MementospringApplication.class, args);
    }

//    public static void main(String[] args) {
//
//        Editor editor = new Editor();
//        History history = new History();
//
//        editor.setTextString("This is what is going to be saved");
//        history.addSnapshot(editor.makeSnapshot());
//        editor.setTextString("TextString 2");
//        history.addSnapshot(editor.makeSnapshot());
//
//        editor.restoreFromHistory(history.getSnapshotAtIndex(0));
//        history.addSnapshot(editor.makeSnapshot());
//
//        history.print();
//    }

}
