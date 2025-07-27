package fileHandle;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args){
        File file = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\java\\demo-java\\src\\fileHandle\\My_file.txt");

        if(file.exists()){
            String filePath = file.getAbsolutePath();
            System.out.println(file.getPath());
            System.out.println(file.isFile());
            try{
                FileWriter writer = new FileWriter(filePath);
                writer.write("writing a file name is not easy");
                writer.append(" but it has to be done");
                writer.close();

            }catch(IOException e){
                e.printStackTrace();
            }
        }else{
            System.out.println("no such file exist");
        }

    }
}