package br.edu.ifpb.ads.padroes.atv2.gateway;
import br.edu.ifpb.ads.padroes.atv2.sdk.StripeSDK;

public class StripeAdapter implements PagamentoGateway {
    private final StripeSDK sdk = new StripeSDK();

    @Override
    public void pagar(double valor) {
        sdk.charge(valor);
    }
}
