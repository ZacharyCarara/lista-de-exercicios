package lista_de_exercicios;

public class exerc6 {

    public static void main (String[] args){
        for(Integer i=1; i<=123; i++){
            if ((i%2==0) || (i%3==0)){
                System.out.ptintln (i+ "não é primo");
            }else{
                System.out.println(i+ "é primo");
            }
        }
    }
}
