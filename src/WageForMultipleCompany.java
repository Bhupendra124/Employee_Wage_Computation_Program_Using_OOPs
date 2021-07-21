public class CompanyEmpWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    String company_name = "";
    int empRatePerHour;
    int numOfWorkingDays;
    int maxHoursInMonth;
    int totalEmpWage;

    public CompanyEmpWage(String company_name, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
        this.company_name = company_name;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursInMonth = maxHoursInMonth;
    }
    public void  setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage=totalEmpWage;
    }
    @Override
    public String toString(){
        return  "Total Employee wage for Company :"+company_name+"is"+totalEmpWage;
    }

public static class EmpWageBuilderArray{

        int numOfCompany=0;
        private CompanyEmpWage[] companyEmpWagesArray;

        public EmpWageBuilderArray(){
            companyEmpWagesArray=new CompanyEmpWage[5];
        }

        private void addCompanyEmpWage(String company_name, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth){
            companyEmpWagesArray[numOfCompany]=new CompanyEmpWage(company_name,empRatePerHour,numOfWorkingDays,maxHoursInMonth);
            numOfCompany++;
        }
        private  void   ComputeEmpWage(CompanyEmpWage companyEmpWage){
            for (int i=0; i<numOfCompany; i++){
                companyEmpWagesArray[i].setTotalEmpWage(this.ComputeEmpWage(companyEmpWagesArray[i]));
            }
        }



    public int displayForMonthSalary(CompanyEmpWage CompanyEmpWage) {
        int empHrs=0; int totalEmpHrs=0; int totalWorkingDays=0;

        while (totalEmpHrs <=CompanyEmpWage.maxHoursInMonth  && totalWorkingDays <CompanyEmpWage.numOfWorkingDays)
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
        return totalEmpHrs*CompanyEmpWage.empRatePerHour ;
//        totalEmpWage = totalEmpHrs * empRatePerHour;



    }
    public static void main(String[] args) {
  EmpWageBuilderArray wageBuilderArray=new EmpWageBuilderArray();
  wageBuilderArray.addCompanyEmpWage("BridgeLabz",100,20,20);
        wageBuilderArray.addCompanyEmpWage("hcl",100,20,20);
        wageBuilderArray.addCompanyEmpWage("reliance",100,20,20);
    }

}
}