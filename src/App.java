import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> array1 = new ArrayList<String>();
        List<String> array2 = new ArrayList<String>();

        String[] arr1 = new String[] { "Banana", "Uva", "Abacaxi", "Abacate", "Pêra" };
        String[] arr2 = new String[] { "Acerola", "Pêra", "Goiaba", "Manga", "Banana" };

        for (int i = 0; i < arr1.length; i++) {
            array1.add(arr1[i]);
            array2.add(arr2[i]);
        }

        for (int i = 0; i < array1.size(); i++) {
            if (array2.contains(array1.get(i))) {
                System.out.println(array1.get(i));
            }
        }
    }
}
