public class PartTime extends EmpWage{
    int IS_FULL_TIME=1;
    int EMP_RATE_PER_HOUR=20;
    int IS_PART_TIME=2;

    public void FullPartTimeWage(){

       double emCheck=Math.floor(Math.random()*10) % 3;
       if(emCheck==IS_FULL_TIME){
           empHrs=8;
           System.out.println("Employee is full time  :"+ dailywage());


       }else if (emCheck==IS_PART_TIME){
           empHrs=4;
           System.out.println("Employee is part time  :"+dailywage());

       }
       else {
           empHrs=0;
           System.out.println("Employee is Absent  :"+dailywage());

       }


    }

    public static void main(String[] args) {
        PartTime partTime=new PartTime();
        partTime.FullPartTimeWage();
    }




}
