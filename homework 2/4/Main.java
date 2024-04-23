import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> maleNames = new ArrayList<>(); //Список А
        for (int i = 0; i < 5; i++) {
            maleNames.add(scanner.nextLine());
        }
        System.out.println(maleNames);
        ArrayList<String> femaleNames = new ArrayList<>(); //Список В
        for (int i = 0; i < 5; i++) {
            femaleNames.add(scanner.nextLine());
        }
        System.out.println(femaleNames);
        ArrayList<String> names = new ArrayList<>(); //Список С
        Collections.reverse(femaleNames);
        for (int i = 0; i < maleNames.size(); i++) {
            names.add(maleNames.get(i));
            names.add(femaleNames.get(i));
        }
        System.out.println(names);
        Collections.sort(names);
        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
        Collections.sort(names, lengthComparator);
        System.out.println(names);
    }

}