package principal;
/**
 *
 * @author Ricardo Ortiz
 */
import java.math.BigDecimal;
import java.util.ArrayList;

public class Gerente extends Funcionario{
        
    public Gerente(String id_Funcionario, String nome, String cargo, BigDecimal salario){
	super(id_Funcionario, nome, cargo, salario);
    }
}
