package Exercise.CustomList;

public class Sorter<T extends Comparable<T>> {

    public static void sort(CustomList<String> customList) {
        int size = customList.getElements().size();
        for (int i = 0; i < size; i++) {
            String element = customList.getElements().get(i);
            for (int j = i + 1; j < size; j++) {
                String nextElement = customList.getElements().get(j);
                if (element.compareTo(nextElement) > 0) {
                    customList.swap(i, j);
                }
            }
        }
    }
}
