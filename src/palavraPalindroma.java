import java.util.Scanner;


public class palavraPalindroma {
    
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        String palavraReversa = "";

        System.out.println("Digite a palavra para checagem:");
        String palavra = scanner.nextLine();

        for (int i = (palavra.length()-1); i>=0; i-- ){
            palavraReversa += palavra.charAt(i);
        }
        if(palavraReversa.toLowerCase().equals(palavra.toLowerCase())){
            System.out.println("palavra palindroma");
        }else {
            System.out.println("palavra NAO palindroma");
        }
    }
}
