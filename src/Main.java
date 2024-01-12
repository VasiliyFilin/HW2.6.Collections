import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* Задание 1 */
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 > 0) {
                System.out.print(nums.get(i) + " ");
            }
        }

        /* Задание 2 */
        System.out.println("\n");
        Set<Integer> numsSet = new TreeSet<>(nums);
        for (Integer num : numsSet) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        /* Задание 3 */
        System.out.println("\n");
        Set<String> words = new TreeSet<>(List.of("Cat", "Dog", "Hamster", "Cat", "Dog", "Snail"));
        System.out.println(words);

        /* Задание 4 */
        System.out.println("\n");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> wordsMap = new TreeMap<>();
        for (String word : strings) {
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, 1);
            } else {
                wordsMap.replace(word, wordsMap.get(word) + 1);
            }
        }
        System.out.println(wordsMap.values());
    }
}