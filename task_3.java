package HW2;
/**
 В файле содержится строка с данными:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, 
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */

// import java.io.FileWriter;
// import java.io.IOException;
import java.io.*;
 
class task_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        try {
            File file = new File("file_3.txt");

            if(!file.exists())
               file.createNewFile();

            br = new BufferedReader(new FileReader("file_3.txt"));
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
    