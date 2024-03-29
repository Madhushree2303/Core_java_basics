package Java_basics_10_inheritance;

public class Programming {
    int version;
    String author;
    Programming(){

    }

    Programming(int s_ver,String p_aut){
        this.version=s_ver;
        this.author=p_aut;
    }

    public void print_ProgramDetails(){
        System.out.println("Program version is "+version+"and author name is "+author);
    }

    void java(){
        System.out.println("This is Java program");
    }

    void car(){
        System.out.println("new car in parent");
    }

    int num(){
        return 100;
    }

}
