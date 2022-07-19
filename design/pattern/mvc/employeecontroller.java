package design.pattern.mvc;

public class employeecontroller {
    private employeeclass model;
    private employeeview view;

    public employeecontroller(employeeclass model,employeeview view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name){
        model.setName(name);
    }

    public void setAddress(String address){
        model.setAddress(address);
    }

    public void setAge(Integer age){
        model.setAge(age);
    }

    public void getName(){
        model.getName();
    }

    public void getAddress(){
        model.getAddress();
    }

    public void getAge(){
        model.getAge();
    }

    public void updateView(){
        view.printEmployeeDetails(
                model.getName(),
                model.getAddress(),
                model.getAge());

    }
}
