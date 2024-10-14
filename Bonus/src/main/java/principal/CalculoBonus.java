package principal;
/**
 *
 * @author Ricardo Ortiz
 */
import java.math.BigDecimal;
import java.util.ArrayList;

public class CalculoBonus {
    private static final BigDecimal SALARIO_TOPO=BigDecimal.valueOf(150000);
    
    public static void Bonus(ArrayList<Departamento> departamentos) {
        Departamento dptoMaiorVenda = new Departamento(BigDecimal.ZERO);
        
        for (Departamento d : departamentos) {
            if (d.getVenda_total().compareTo(dptoMaiorVenda.getVenda_total()) == 1) {
                dptoMaiorVenda = d;
            }
        }
        
        //try{
            for (Funcionario f : dptoMaiorVenda.getFuncionarios()) {
               f.setSalario(f.getSalario().add(new BigDecimal(1000)));
               
               if ((f.getSalario().compareTo(SALARIO_TOPO))<0){
                    if (!(f.getCargo().equals("Gerente"))){
                        f.setSalario(f.getSalario().add(new BigDecimal(1000)));
                    }
               }
            }
            
            System.out.println("Departamento com maior venda: "+dptoMaiorVenda.getNomeDpto());
            for (Funcionario f : dptoMaiorVenda.getFuncionarios()) {
                System.out.println("Salario atualizado " + f.getSalario());
            }
        //}
        /*catch(NullPointerException e){
                System.out.println("Código 1: tabela funcionários e/ou tabela departamentos vazia");
        }*/
    }
}
