
package com.example.peoples_name;


import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HelloController {
   public TextArea theWord;
    public TextArea translation;
    private Map<String, String> voc = new TreeMap<>();
    private String tempKey;

    public HelloController() {

        File path = new File("src\\main\\resources\\com\\example\\peoples_name/worlds.txt");
        try {
            Scanner read = new Scanner(path);
            while (read.hasNext()) {
                String[] temp = read.nextLine().split(" ", 2);
                voc.put(temp[0], temp[1]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(voc);
        tempKey = "";
    }

}


