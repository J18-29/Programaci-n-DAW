public class Condicional {
    
    public static void main(String[] args) {
        int user = 45;
        if (user <=18) {
            System.out.println("User is 18 or younger");
            }
            else if (user >18 && user< 40) {
                System.out.println("User is between 19 and 39");
            }
            else if (user ==45 || user ==50) {
                System.out.println("User is either 45 OR 50");
            }
            else{
                System.out.println("User is older than 40");
            }
       
        }

    }
