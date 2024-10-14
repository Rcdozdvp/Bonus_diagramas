package principal;
/**
 *
 * @author Ricardo Ortiz
 */
import java.math.BigDecimal;
import java.util.ArrayList;

public class Funcionario{
    private String id_Funcionario;
    private String nome;
    private String cargo;
    private BigDecimal salario;
    private ArrayList<Funcionario> proximo;

    public Funcionario(String id_Funcionario, String nome, String cargo, BigDecimal salario){
	this.id_Funcionario = id_Funcionario;
	this.nome = nome;
	this.cargo = cargo;
	this.salario = salario;
	this.proximo = null;
    }
    
    public String getId_Funcionario(){
        return this.id_Funcionario;
    }
    
    public void setId_Funcionario(String id_Funcionario){
	this.id_Funcionario = id_Funcionario;
    }

    public String getNome(){
        return this.nome;
    }
   
    public void setNome(String nome){
        this.nome = nome;
    }
   
    public String getCargo(){
       return this.cargo;
    }
    
    public void setCargo(String cargo){
	this.cargo = cargo;
    }

    public BigDecimal getSalario(){
        return this.salario;
    }
    
    public void setSalario(BigDecimal salario){
	this.salario = salario;
    }
    
    
}
