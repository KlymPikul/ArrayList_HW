package Task_2;

import java.util.List;

public class MaxGradeFinder <T extends Gradeable> {
    //находим и возвращаем элемент с наибольшей оценкой
    public T findMaxGrade(List<T> items) {
        if (items.isEmpty()) {
            return null;
        }

        T maxGradeItem = items.get(0);

        for (T item : items) {
            if (item.getGrade() > maxGradeItem.getGrade()) {
                maxGradeItem = item;
            }
        }

        return maxGradeItem;
    }
}
