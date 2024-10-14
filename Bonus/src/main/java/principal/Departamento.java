package principal;
/**
 *
 * @author Ricardo Ortiz
 */
import java.math.BigDecimal;
import java.util.ArrayList;

public class Departamento{
    private String id_Depto;
    private String nome;
    private BigDecimal venda_total;
    private ArrayList<Funcionario> funcionarios;		

    public Departamento(BigDecimal venda_total){
        this.venda_total = venda_total;
    }

    public Departamento(String id_Depto, String nome) {
        this.id_Depto = id_Depto;
        this.nome = nome;
        this.venda_total = BigDecimal.ZERO;
        this.funcionarios = new ArrayList<Funcionario>();
    }
    
    

    public BigDecimal getVenda_total() {
        return venda_total;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    
    public void calcularVendaTotal(){
        for(Funcionario f : this.funcionarios){
            if(f.getCargo().equals("Vendedor")){
                Vendedor v = (Vendedor) f;
                this.venda_total = this.venda_total.add(v.getVendas());
            }
            
        }
    
    }
    
    public String getNomeDpto(){
        return this.nome;
    }

}