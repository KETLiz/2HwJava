import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
 
public class task
{
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // чтение из файла
        List<String> listOfStrings = new ArrayList<String>();   
        listOfStrings = Files.readAllLines(Paths.get("input.txt"));
        String[] array = listOfStrings.toArray(new String[0]);
        for (String eachString : array) {
            System.out.println(eachString);
        }
        String a = array[0];
        char a1 = a.charAt(2);
        int x = Character.getNumericValue(a1);
        String b = array[1];
        String b1 = b.substring(2, 4);
        int y = Integer.parseInt(b1);
        //int y = Character.getNumericValue(b1);
        System.out.println(x);
        System.out.println(y);
        
        // возведение в степень
        int res = 1;
        while (x > 0) {
            res *= y;
            x -= 1;
        }
        System.out.println(res);

        // запись в файл
        File file = new File("output.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(res);
        pw.close();
    }
}