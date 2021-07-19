

public class WageForMonth extends SwitchCase {
    public static final int NUM_OF_WORKING_DAYS=20;


    int totalEmpWage=0;
    static int day = 0;
    int empHrs = 0;


    void salaryForMonth() {
        int wage = 0;




       for(day=1; day <NUM_OF_WORKING_DAYS+1; day++)
       {
           System.out.println("day is "+day);

           double empCheck = Math.floor(Math.random() * 10) % 3;
           switch ((int) empCheck){
               case IS_FULL_TIME:

                   empHrs = 8;
                   break;
               case IS_PART_TIME:

                   empHrs = 4;

               default:
                   empHrs = 0;
                   System.out.println("Invalid ");

           }
           wage=empHrs*EMP_RATE_PER_HOUR;
           totalEmpWage+=wage;
           System.out.println("Employee wage "+wage);

       }
        System.out.println("total employee wage "+totalEmpWage);


       }




    public static void main(String[] args) {


        WageForMonth forMonth = new WageForMonth();
        forMonth.salaryForMonth();
    }

}