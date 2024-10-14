package principal;
/**
 *
 * @author Ricardo Ortiz
 */
import java.math.BigDecimal;
import java.util.ArrayList;

public class Vendedor extends Funcionario{
    private BigDecimal vendas;
    private BigDecimal comissao;

    public Vendedor(String id_Funcionario, String nome, String cargo, BigDecimal salario, BigDecimal vendas){
	super(id_Funcionario, nome, cargo, salario);
	this.vendas = vendas;
    }

    public void calcularComissao(){
	this.comissao = this.vendas.multiply(BigDecimal.valueOf(0.01));	
    }

    public BigDecimal getVendas() {
        return vendas;
    }
    
    
}
