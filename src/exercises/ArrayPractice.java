package exercises;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};

        for (int i : intArray) {
            System.out.println(i);
        }

        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] result = text.split(" ");
        for (String str : result)
        System.out.println(str);

        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] result = text.split("\\.");
        for (String str : result)
            System.out.println(str);

    }
}
