import br.com.ada.folhapagamento.ContratoCLT;
import br.com.ada.folhapagamento.ContratoPJ;
import br.com.ada.folhapagamento.Estagiario;
import br.com.ada.folhapagamento.FolhaPagamento;
import br.com.ada.meiosenvio.EnvioDocumento;
import br.com.ada.meiosenvio.Zap;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Estagiario estagiario = new Estagiario(new BigDecimal(1200));
        ContratoPJ contratoPJ = new ContratoPJ(new BigDecimal(25000));
        ContratoCLT contratoCLT = new ContratoCLT(new BigDecimal(15000));

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        folhaPagamento.pagar(estagiario);
        folhaPagamento.pagar(contratoPJ);
        folhaPagamento.pagar(contratoCLT);

    }


}