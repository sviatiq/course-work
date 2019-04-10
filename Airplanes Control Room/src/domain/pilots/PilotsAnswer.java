package domain.pilots;

import java.util.ArrayList;
import java.util.List;

public class PilotsAnswer {

    private List<PilotsAnswerItem> items;

    public List<PilotsAnswerItem> getItems() {
        return items;
    }

    public void addItems(PilotsAnswerItem item) {
        if(items == null){
            items = new ArrayList<>(10);
        }
        items.add(item);
    }
}
