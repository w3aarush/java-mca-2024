// Demonstrating some String methods
class StringDemo2 {
    public static void main(String[] args) {
        String ob1 = "First String";
        String ob2 = "Second String";
        String ob3 = ob1;

        System.out.println("Length of ob1: " + ob1.length());
        System.out.println("Char at index 3 in ob1: "+ ob1.charAt(3));
        
        if(ob1.equals(ob2)) System.out.println("ob1 == ob2");
        else System.out.println("ob1 != ob2");

        if(ob1.equals(ob3)) System.out.println("ob1 == ob3");
        else System.out.println("ob1 != ob3");
    }
}