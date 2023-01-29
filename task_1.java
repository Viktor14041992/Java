package HW2;
/**
 * В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */


import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

 class task_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        try {
            File file = new File("file_1.txt");

            if(!file.exists())
               file.createNewFile();

            br = new BufferedReader(new FileReader("file_1.txt"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
                System.out.println("Error:" + e);
        } finally {
            try {
                br.close();
            } catch(IOException e) {
                System.out.print("Error:" + e);
            }
        }
    }
}
    
