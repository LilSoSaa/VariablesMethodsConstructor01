public class Main {
    public static void main(String[] args) {


        House house1=new House();
        System.out.println("New House is coming!");

        house1.address="Via Degiacomini 25";
        house1.numberOfFloors= 7;
        System.out.println( house1.print());


        House house2=new House();
        System.out.println("New House is coming!");

        house2.address="Via Malta 1";
        house2.numberOfFloors= 5;
        System.out.println( house2.print());



    }
}