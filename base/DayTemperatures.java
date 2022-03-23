package temperatures.base;

public class DayTemperatures {

    int[] hourlyTemp = new int[23];

    public int getHourlyTemp(int hour) {
		if(hour >= 0 && hour < 23){
            return hourlyTemp[hour];
        }
        else return -1;
	}

	public void setHourlyTemp(int hour, int temp) {
        hourlyTemp[hour] = temp;
	}

    public int getSize(){
        return hourlyTemp.length;
      }

    
  public int hottestTempsIndex(){
        double max_value = -1.0;
        int max_index = -1;
        for(int i=0; i< this.hourlyTemp.length; i++){
             if(this.hourlyTemp[i] > max_value){
               max_value = this.hourlyTemp[i];
               max_index = i;
  
             }
          }
          return max_index;
  
      }
  
     
    
}
