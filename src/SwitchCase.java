public class SwitchCase  {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static int ComputeEmpWage() {
        int empHrs = 0;
        int wage;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empCheck) {
            case IS_FULL_TIME:
                empHrs = 8;
                System.out.println("Employee is present full time ");
                wage = EMP_RATE_PER_HOUR * empHrs;
                System.out.println("Full time wage :" +wage);
                return 1;

            case IS_PART_TIME:
                empHrs = 4;
                System.out.println("Employee is present part time");
                wage = EMP_RATE_PER_HOUR * empHrs;
                System.out.println("Part Time wage :" + wage);
                return 2;
            case 0:
                empHrs = 0;
                System.out.println("Employee is Absent");
                wage = EMP_RATE_PER_HOUR * empHrs;
                System.out.println("Absent hai Koi Paise nhi " +wage);
                return 0;
            default:
                System.out.println("Kuch Ve mat dalo");
        }
        return empHrs;
    }

    public static void main(String[] args) {
        SwitchCase empCheck = new SwitchCase();
        empCheck.ComputeEmpWage();

    }



    }
