package EmailApp;

public class EmailApp {
    public static void main(String[] args){
        //to do Auto-generated method stub
        Email em1 = new Email("John", "Smith");

        em1.setAlternativeEmail("js@gmail.com");
        System.out.println(em1.getAlternativeEmail());

        //System.out.println(em1.showInfo());
    }
}
