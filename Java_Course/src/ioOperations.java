import java.io.*;

public class ioOperations {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("C:/Users/disha/IdeaProjects/Java_Course/src/abc.txt");
            int data = f.read();
            f.close();
            System.out.print((char) data);

        } catch (IOException e) {
            System.out.print("error Occured");
        }

        try{
            FileOutputStream fos= new FileOutputStream("C:/Users/disha/IdeaProjects/Java_Course/src/abc.txt");
            fos.write(200);
            fos.close();

        }catch(IOException e){
            System.out.print("error Occured");
        }
    }
}


//        try {
//            FileOutputStream f1= new FileOutputStream("abc.txt");
//            f1.write();
//        }



