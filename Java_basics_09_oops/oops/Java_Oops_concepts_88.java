package Java_basics_09_oops.oops;

public class Java_Oops_concepts_88 {

    String Emp_name;
    int Emp_id;
    String Emp_add;

    Java_Oops_concepts_88(){
        Emp_add="test add";
        Emp_id=1223;
        Emp_name="madhu";
        System.out.println(Emp_name);
    }
    public static void main(String[] args) {
        Atb5x_person atb5xPerson=new Atb5x_person();
        atb5xPerson.name="madhu";
        atb5xPerson.course="Automation Testing";

        atb5xPerson.printdetails();

        Atb5x_person atb5xPerson1=new Atb5x_person("Balan");
        atb5xPerson1.printdetails();

        Java_Oops_concepts_88 oopsConcepts88=new Java_Oops_concepts_88();

    }
}
