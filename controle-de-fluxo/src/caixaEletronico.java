public class caixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 22.0;
 
        if(valorSolicitado < saldo){
         saldo = saldo - valorSolicitado;
         System.out.println("Saque realizado com sucesso!! Seu novo saldo é : " +saldo);
        }else
         System.out.println("Saldo insuficiente");
 
         
 
     }
 }
