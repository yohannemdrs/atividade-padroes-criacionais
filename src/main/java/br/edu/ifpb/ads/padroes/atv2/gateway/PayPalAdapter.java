package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.PayPalSDK;

public class PayPalAdapter implements PagamentoGateway {
    private final PayPalSDK sdk = new PayPalSDK();

    @Override
    public void pagar(double valor) {
        sdk.sendPayment(valor);
    }
}
