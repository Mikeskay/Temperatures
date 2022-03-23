package temperatures.base;
public class WeeklyTemperatures {


    int[] dailyTemp = new int[7];

    public int getDailyTemp(int day) {
		if(day >= 0 && day < 7){
            return dailyTemp[day];
        }
        else return -1;
	}

	public void setDailyTemp(int day, int temp) {
        dailyTemp[day] = temp;
	}

    public int getSize(){
        return dailyTemp.length;
      }

    
  public int hottestTempsIndex(){
        double max_value = -1.0;
        int max_index = -1;
        
        for(int i = 0; i < this.dailyTemp.length; i++){

             if(this.dailyTemp[i] > max_value){
               max_value = this.dailyTemp[i];
               max_index = i;
  
             }
          }
          return max_index;
  
      }
  
     
    
}
    

