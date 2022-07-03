package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();

        String message = switch(monthNumber){
            case 1:
                yield "january";
                
            case 2:
                yield "february";
                
            case 3:
                yield "march";
                
            case 4:
                yield "april";
                
            case 5:
                yield "may";
                
            case 6:
                yield "june";
                
            case 7:
                yield "july";
                
            case 8:
                yield "august";
                
            case 9:
                yield "september";
                
            case 10:
                yield "october";
                
            case 11:
                yield "november";
                
            default:
                yield "december";

        };
        System.out.println(message.substring(0, 1).toUpperCase() + message.substring(1));

    }
}
