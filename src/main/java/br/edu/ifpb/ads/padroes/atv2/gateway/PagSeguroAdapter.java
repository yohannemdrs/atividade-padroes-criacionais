package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.PagSeguroSDK;

public class PagSeguroAdapter implements PagamentoGateway {
    private final PagSeguroSDK sdk = new PagSeguroSDK();

    @Override
    public void pagar(double valor) {
        sdk.autorizarTransacao(valor);
    }
}
