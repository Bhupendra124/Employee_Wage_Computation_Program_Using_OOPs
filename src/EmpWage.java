public class  EmpWage extends CheckAttendance {
    int IS_FULL_TIME=1;
    int EMP_RATE_PER_HOUR=20;

    int empHrs=0;


    int dailywage(){
        return empHrs*EMP_RATE_PER_HOUR;
    }

       public void checkrandom () {
           double empCheck = Math.floor(Math.random() * 10) % 2;
           if (empCheck == IS_FULL_TIME) {
               System.out.println("Employee is Present");
               System.out.println("Wage is " + dailywage());
               empHrs=8;
           }else

           System.out.println("Employee is Absent");
           empHrs=0;
       }

       public static void main (String[]args){
           EmpWage emp = new EmpWage();
          emp.checkrandom();
          emp.dailywage();


       }
   }