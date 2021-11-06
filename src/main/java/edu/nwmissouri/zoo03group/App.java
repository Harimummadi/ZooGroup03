package edu.nwmissouri.zoo03group;

public class App {

    public static void main(String[] args) {
        initFirstTimeVisitor();
        initStudentVisitor();
        initChildVisitor();
        initSeniorCitizenVisitor();
        initAdultVisitor();
        initEmployeeCareTaker();
        initEmployeeRescueOperator();
        initEmployeeGuide();
        initZooMaintainer();
    }

    private static void initFirstTimeVisitor() {
        FirstTimeVisitor firstTimeVisitor = new FirstTimeVisitor("FirstTimeVisitor", "10$", "name", "email.com", 1234567890);
        System.out.println(firstTimeVisitor.toString());
        firstTimeVisitor.ticketPrice();
        firstTimeVisitor.visitorCategory();
    }

    private static void initStudentVisitor() {
        StudentVisitor studentVisitor = new StudentVisitor("StudentVisitor", "6$", "jj rodson", "rodson@gmail.com", 1234567890, "School of California");
        System.out.println(studentVisitor.toString());
        studentVisitor.ticketPrice();
        studentVisitor.visitorCategory();
        studentVisitor.school();
    }

    private static void initChildVisitor() {
        ChildVisitor childVisitor = new ChildVisitor("ChildVisitor", "5$", "jj rodson", "rodson@gmail.com", 1234567890, 4, "I need a Stroller");
        System.out.println(childVisitor.toString());
        childVisitor.ticketPrice();
        childVisitor.visitorCategory();
        childVisitor.zooStroller();
    }

    private static void initSeniorCitizenVisitor() {
        SeniorCitizenVisitor seniorCitizenVisitor = new SeniorCitizenVisitor("SeniorCitizenVisitor", "4$", "jj rodson", "rodson@gmail.com", 62, "I need Wheel Chair");
        System.out.println(seniorCitizenVisitor.toString());
        seniorCitizenVisitor.ticketPrice();
        seniorCitizenVisitor.visitorCategory();
        seniorCitizenVisitor.zooWheelChair();
    }

    private static void initAdultVisitor() {
        AdultVisitor adultVisitor = new AdultVisitor("AdultVisitor", "8.5$", "name", "email.com", 1234567890);
        System.out.println(adultVisitor.toString());
        adultVisitor.ticketPrice();
        adultVisitor.visitorCategory();
    }

    private static void initEmployeeCareTaker() {
        EmployeeCareTaker employeeCareTaker = new EmployeeCareTaker(865432, "EmployeeCareTaker", "Employee name", "9am-5pm", "name", "email", 1234567890);
        System.out.println(employeeCareTaker.toString());
        employeeCareTaker.employeeShiftTimings();
        employeeCareTaker.employeeCategory();
        employeeCareTaker.employeeID();

    }

    private static void initEmployeeRescueOperator() {

        EmployeeRescueOperators employeeRescueOperators = new EmployeeRescueOperators(673739, "Employee Rescue Operator", "John Greesham", "6AM-1PM", "name", "email", 188292829);
        System.out.println(employeeRescueOperators.toString());
        employeeRescueOperators.employeeCategory();
        employeeRescueOperators.employeeID();
        employeeRescueOperators.employeeShiftTimings();
    }

    private static void initEmployeeGuide() {

        EmployeeGuide employeeGuide = new EmployeeGuide(682939, "Employee Guide", "Tony Stark", "10AM-6PM", "name", "email", 1982882882);
        System.out.println(employeeGuide.toString());
        employeeGuide.employeeCategory();
        employeeGuide.employeeID();
        employeeGuide.employeeShiftTimings();
    }

    private static void initZooMaintainer() {

        ZooMaintainer zooMaintainer = new ZooMaintainer(692939, "Zoo Maintainer", "Jack Sparrow", "9AM-7PM", "name", "email", 1788298277);
        System.out.println(zooMaintainer.toString());
        zooMaintainer.employeeCategory();
        zooMaintainer.employeeID();
        zooMaintainer.employeeShiftTimings();
    }
}
