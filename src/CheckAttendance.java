public class CheckAttendance {
    int IS_FULL_TIME =1;
    //int empCheck;

    public void checkrandom()
    {
        double empCheck=Math.floor(Math.random() *10) %2 ;
        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");

        else
            System.out.println("Employee is Absent");

    }

    public static void main(String[] args) {
        CheckAttendance emp=new CheckAttendance();
        emp.checkrandom();
        System.out.println(emp);
    }
}

