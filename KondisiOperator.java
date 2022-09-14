/*
 created by 21343010-Natasya febriani
 */
package joobsheet4;
public class KondisiOperator {
    public static void main(String[] args) {
       String status = "";
       int grade = 50;
    
       //mendapatkan status pelajar
       status = (grade >= 60) ? "passed" : "Fail";
    
       //print status 
       System.out.println(status);
    
     } 
}
