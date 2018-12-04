package fr;

public class Classroom {
	
	public static void main(String[] args){

        Wilder saïda = new Wilder("Saïda", true);
        System.out.println(saïda.whoAmI());

        Wilder john = new Wilder("John", false);
        System.out.println(john.whoAmI());
    }

}
