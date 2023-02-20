package src.main.java.com.javacon;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class ParcingCon {


    public ArrayList<com.javacon.Event> getEvents(){
        try {
            Scanner scan = new Scanner(Path.of("JavaCon/src/main/resources/input.txt"));
            ArrayList<com.javacon.Event> events = new ArrayList<>();
            while  (scan.hasNext()) {
                String row;
                row = scan.nextLine();
                boolean hasSplit = false;
                if (row.contains("lightning")) {

                    for (String splits : row.split("lightning", 2)) {
                        if (!hasSplit) {
                            com.javacon.Event event = new com.javacon.Event(splits, 5);
                            events.add(event);
                            events.toString();

                            hasSplit = true;
                        }

                    }

                }

            }

            return events;
        }catch (Exception e){}


        return null;
    }


}
