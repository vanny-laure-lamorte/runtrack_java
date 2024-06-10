package jour01.job09;

public class MyString {
    public static void main(String[] args) {

        // 1
        String v1 = "Variable1"; 
        System.out.println(v1);
        
        // 2
        String v2 = new String("Variable2");
        System.out.println(v2);

        // 3
        String v3 = v1.concat(v2);
        System.out.println(v3);

        //4
        StringBuilder sb =  new StringBuilder() ;  
        sb.append(v1).append(" ").append(v2) ; 
        String v4 = sb.toString() ;
        System.out.println(v4);

    }
    
}
