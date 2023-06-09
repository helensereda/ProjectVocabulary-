
package com.example.peoples_name;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class HelloController {

    public ListView listView = new ListView<>();

    public void action(ActionEvent actionEvent) throws IOException {

  Scanner scaner = new Scanner(new FileReader("src/main/resources/com/example/peoples_name/worlds.txt"));

        String worlds;

        while (scaner.hasNext()){
            worlds = scaner.next();
            listView.getItems().add(worlds);
        }
    }
}


