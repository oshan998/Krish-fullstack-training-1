package design.pattern.mvc;

public class mainclass {
    public static void main(String[] args){
        employeeclass model = retriveEmployeeDatabase();

        employeeview view = new employeeview();

        employeecontroller controller = new employeecontroller(model, view);
        controller.updateView();

        controller.setName("Oshan");
        controller.updateView();

    }
    private static employeeclass retriveEmployeeDatabase(){
        employeeclass emp = new employeeclass();
        emp.setName("nanayakkara");
        emp.setAddress("galle");
        emp.setAge(24);

        return emp;
    }
}
