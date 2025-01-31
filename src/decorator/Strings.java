package decorator;

import java.util.ArrayList;
import java.util.Iterator;

class Strings extends Item {
    private ArrayList<String> strings = new ArrayList<>();

    public void add(String item) {
        strings.add(item);
    }

    @Override
    public int getLinesCount() {
        return strings.size();
    }

    @Override
    public int getMaxLength() {
        Iterator<String> iter = strings.iterator();
        int maxwidth = 0;
        while (iter.hasNext()) {
            String string = iter.next();
            int width = string.length();
            if (width > maxwidth) maxwidth = width;
        }
        return maxwidth;
    }

    @Override
    public int getLength(int index) {
        String string = strings.get(index);
        return string.length();
    }

    @Override
    public String getString(int index) {
        return strings.get(index);
    }
}
