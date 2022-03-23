import temperatures.base.*;

import java.util.*;

public class TemperatureTest {

    public static void main(String[] args) {
        
        int temp;
    
        DayTemperatures hourlyTemp = new DayTemperatures();
        WeeklyTemperatures dayTemp = new WeeklyTemperatures();

        Scanner input = new Scanner(System.in);

      for (int i = 0; i < dayTemp.getSize(); i++){
        System.out.println("Insert the temp:  ");
        temp = input.nextInt();
        dayTemp.setDailyTemp(i, temp);

      }

      int max_index = dayTemp.hottestTempsIndex();

      System.out.println("Max temp is " + dayTemp.dailyTemp[max_index]+ " at index "+ max_index);


    }
    
}


