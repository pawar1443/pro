package pro.data_processing;
import java.util.*;
import java.io.*;
import java.util.stream.Stream;
import java.nio.file.*;

public class processing {
    public static void main(String args[]){
        try{
            Stream<String> lines = Files.lines(Paths.get("data.csv"));
            lines.forEach(System.out::println);
            lines.close();
        }catch(IOException e){
            e.printStackTrace();
        } 
    }
}
