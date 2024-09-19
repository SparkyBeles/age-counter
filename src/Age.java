public class Age {

    int year_days = 365;
    int week = 7;
    int day = 24;
    double minute = 60;




    public Age(){


    }
public double age_month(double age){
        return age * 12;

}
    public double age_week(double age){
        return age * year_days / week;
    }

    public float age_minute(double age){
        return (float) ((float) age * year_days * day * minute);

    }



}
