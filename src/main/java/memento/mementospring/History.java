package memento.mementospring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class History {

    private final List<Snapshot> snapshotList = new ArrayList<>();


    public void addSnapshot(Snapshot snapshot){
        snapshotList.add(snapshot);
    }

    public Snapshot getSnapshotAtIndex(int index){
        return snapshotList.get(index);
    }

    public List<Snapshot> getAllSnaps(){
        return Collections.unmodifiableList(snapshotList);
    }

    public void print(){
        snapshotList.forEach(System.out::println);
    }
}
