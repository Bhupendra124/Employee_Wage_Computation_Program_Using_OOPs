public class WageForMultipleCompany {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    String company_name = "";
    int empRatePerHour;
    int numOfWorkingDays;
    int maxHoursInMonth;
    int totalEmpWage;

    public WageForMultipleCompany(String company_name,int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth){
        this.company_name=company_name;
        this.empRatePerHour=empRatePerHour;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHoursInMonth=maxHoursInMonth;
    }

    public void displayForMonthSalary() {
        int empHrs=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;

        while (totalEmpHrs <= maxHoursInMonth  && totalWorkingDays <numOfWorkingDays)
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
            System.out.println("Day #" +totalWorkingDays+ "  Employe Hours # "+ empHrs+ "  Total Employee Working Hours  is # "+totalEmpHrs);
            }
               totalEmpWage = totalEmpHrs * empRatePerHour;



            }
    @Override
    public String toString(){

        return "Total Employee Wage for Company ---------"+company_name+ "---------is--------- :"+ totalEmpWage;
    }

    public static void main(String[] args) {
     WageForMultipleCompany BridgeLabz=new WageForMultipleCompany("BridgeLabz",20,20,100);
     WageForMultipleCompany HCL=new WageForMultipleCompany("Hcl",100,20,100);
     WageForMultipleCompany Reliance=new WageForMultipleCompany("Reliance",100,100,50);
        BridgeLabz.displayForMonthSalary();
        System.out.println(BridgeLabz);
        HCL.displayForMonthSalary();
        System.out.println(HCL);
        Reliance.displayForMonthSalary();
        System.out.println(Reliance);

    }



}
