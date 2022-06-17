import java.util.Arrays;

public class ArraysExercises {

    public static String[] addPerson(String[] arr, String newEl) {
        String[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = newEl;
        return newArr;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] people = new String[3];
        people[0] = "Scott";
        people[1] = "Jimmy";
        people[2] = "Mike";

        for (String peeps : people) {
            System.out.println(peeps);
        }

        String[] newPeople = {"Mark", "David", "Ray"};

        newPeople = addPerson(newPeople, "Jake");
        for (String peeps : newPeople) {
            System.out.println(peeps);
        }
    }
}



