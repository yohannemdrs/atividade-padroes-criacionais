package br.edu.ifpb.ads.padroes.atv2.service;
import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;
import com.google.inject.Inject;

public class PagamentoService {
    private final PagamentoGateway gateway;

    @Inject
    public PagamentoService(PagamentoGateway gateway) {
        this.gateway = gateway;
    }

    public void efetuarPagamento(double valor) {
        gateway.pagar(valor);
    }
}
