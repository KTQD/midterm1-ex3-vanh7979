import java.io.*;
public class Main {
    public static void main(String[] args) {


        try (BufferedReader readd = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writee = new BufferedWriter(new FileWriter("output.txt"))) {

            String line;
            while ((line = readd.readLine()) != null) {
                line = line.replaceAll("Nha Trang", "Vũng Tàu");
                writee.write(line);
                writee.newLine();
            }

            System.out.println("Complete!");

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file đầu vào hoặc đầu ra.");
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra trong quá trình đọc ghi file.");
        }
    
    }
}
