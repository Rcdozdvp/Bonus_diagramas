package principal;
/**
 *
 * @author Ricardo Ortiz
 */
import java.math.BigDecimal;
import java.util.ArrayList;

public class Bonus {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("10", "Francis", "Gerente", BigDecimal.valueOf(10000.00));
        Vendedor v1 = new Vendedor("1", "Geise", "Vendedor", BigDecimal.valueOf(3500.00), BigDecimal.valueOf(45000.00));
        Departamento d1 = new Departamento("1", "Automotivo");
        d1.adicionarFuncionario(g1);
        d1.adicionarFuncionario(v1);
        d1.calcularVendaTotal();

        Gerente g2 = new Gerente("10", "Rui", "Gerente", BigDecimal.valueOf(10000.00));
        Vendedor v2 = new Vendedor("1", "João", "Vendedor", BigDecimal.valueOf(3500.00), BigDecimal.valueOf(55000.00));
        Departamento d2 = new Departamento("1", "Residencial");
        d2.adicionarFuncionario(g2);
        d2.adicionarFuncionario(v2);
        d2.calcularVendaTotal();
        
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        
        departamentos.add(d1);
        departamentos.add(d2);
        
        CalculoBonus.Bonus(departamentos);
    }
}
