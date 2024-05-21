public class ExemploFor {
    
    public static void main(String[] args) {
        
        for (int sheep = 0  ; sheep <= 20; sheep++) {
            if (sheep < 2) {
                
                System.out.println(sheep + " carneirinho"); 
                continue;
            } 

            System.out.println(sheep + " carneirinhos");
        }
    }
}
