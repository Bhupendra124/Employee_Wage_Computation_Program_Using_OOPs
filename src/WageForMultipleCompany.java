public class WageForMultipleCompany extends WageForMonth {
    public static final int MAX_HOURS_IN_MONTH=100;

    String company_name = "";
    int empRatePerHour;
    int numOfWorkingDays;
    int maxHoursInMonth;

    public void WageForMultipleCompany(String company_name, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth){
        this.company_name=company_name;
        this.empRatePerHour=empRatePerHour;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHoursInMonth=maxHoursInMonth;

      }

    int displayForMonthSalary() {
        int totalEmpHrs=0;
        int totalWorkingDays=0;

        while (totalEmpHrs <= MAX_HOURS_IN_MONTH  && totalWorkingDays <NUM_OF_WORKING_DAYS)
        {
            totalWorkingDays++;
            System.out.println("days is"+totalWorkingDays);
            int empCheck = (int) Math.floor(Math.random() * 10) % 3 ;
            switch ( empCheck){
                case IS_FULL_TIME:
                    System.out.println("full time");
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("part time");
                    empHrs = 4;
                    break;

                default:
                    empHrs = 0;
                    System.out.println("Absent ");

            }

            totalEmpHrs+=empHrs;
            System.out.println("Day #" +totalWorkingDays+ "  Employe Hours # "+ empHrs+ "  Total Employee Working Hours is# "+totalEmpHrs);
        }
             totalEmpWage=    totalEmpHrs*EMP_RATE_PER_HOUR;
             System.out.println("Total Employee wage for company is-:" +totalEmpWage);
              return totalEmpWage ;

    }

    public static void main(String[] args) {
     WageForMultipleCompany multipleCompany=new WageForMultipleCompany();
     multipleCompany.displayForMonthSalary();
    }



}
