package Exercise.task_for_use;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateStringRemoval {
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("apple");
        inputList.add("grape");
        inputList.add("banana");

        List<String> resultList = removeDuplicates(inputList);

        System.out.println("Input List: " + inputList);
        System.out.println("Result List: " + resultList);
    }

    public static List<String> removeDuplicates(List<String> inputList) {
        Set<String> uniqueStrings = new HashSet<>();
        List<String> resultList = new ArrayList<>();

        for (String str : inputList) {
            if (uniqueStrings.add(str)) {
                resultList.add(str);
            }
        }

        return resultList;
    }
}

