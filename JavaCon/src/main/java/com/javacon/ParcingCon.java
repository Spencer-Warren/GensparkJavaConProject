package src.main.java.com.javacon;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class ParcingCon {


    public ArrayList<Event> getEvents(){
        try {
            Scanner scan = new Scanner(Path.of("JavaCon/src/main/resources/input.txt"));
            ArrayList<Event> events = new ArrayList<>();
            while  (scan.hasNext()) {
                String row;
                row = scan.nextLine();
                boolean hasSplit = false;
                if (row.contains("lightning")) {

                    for (String splits : row.split("lightning")) {
//                        System.out.println("Lightning Split Test:");
//                        System.out.println(splits);

                        if (!hasSplit) {
                            //Adds the Name of the Event if it is a Lightning Topic
                            //then skips the remaining half as it isn't needed.
                            Event event = new Event(splits, 5);
                            events.add(event);
                            hasSplit = true;
                        }

                    }

                }else{

                    if (row.contains("30min")){
                for (String splits: row.split("30")){
//                    System.out.println("30min Split Test:");
//                    System.out.println(splits);
                    if (!hasSplit) {
                        //Adds the Name of the Event if it is a 30min Topic
                        //then skips the remaining half as it isn't needed.
                        Event event = new Event(splits, 30);
                        events.add(event);
                        hasSplit = true;
                    }
                }

                } else if (row.contains("45min")) {
                        for (String splits: row.split("45min")){
//                            System.out.println("45min Split Test:");
//                            System.out.println(splits);
                            if (!hasSplit) {
                                //Adds the Name of the Event if it is a 45min Topic
                                //then skips the remaining half as it isn't needed.
                                Event event = new Event(splits, 45);
                                events.add(event);
                                hasSplit = true;
                            }

                    }


                } else if (row.contains("60min")) {
                        for (String splits: row.split("60min")){
//                            System.out.println("60min Split Test:");
//                            System.out.println(splits);
                            if (!hasSplit) {
                                //Adds the Name of the Event if it is a 60min Topic
                                //then skips the remaining half as it isn't needed.
                                Event event = new Event(splits, 60);
                                events.add(event);
                                hasSplit = true;
                            }
                    }

                    } else if (row.contains("15min")) {
                        for (String splits: row.split("15")){
//                            System.out.println("15min Split Test:");
//                            System.out.println(splits);
                            if (!hasSplit) {
                                //Adds the Name of the Event if it is a 15min Topic
                                //then skips the remaining half as it isn't needed.
                                Event event = new Event(splits, 15);
                                events.add(event);
                                hasSplit = true;
                            }

                    }

                }


        }
            }



            return events;
        }catch (Exception e){System.out.println(e);}


        return null;
    }


}
