package Java_basics_10_inheritance.multilevel_inheritance;

public class Java_oops_concepts_93 {
    public static void main(String[] args) {

        Son son =new Son();
        son.bhk3();
        son.bhk2();
        son.bhk1("madhu");
        System.out.println("------ --------");
        Grand_father grandFather=new Son();
        grandFather.bhk3();
        System.out.println("------ --------");
        Father father=new Son();
        father.bhk2();
        father.bhk3();
        System.out.println("------ --------");
        Grand_father grandFather1=new Father();
        grandFather1.bhk3();
        System.out.println("------ --------");
        Father father1=new Father();
        father1.bhk3();
        father1.bhk2();

    }
}
