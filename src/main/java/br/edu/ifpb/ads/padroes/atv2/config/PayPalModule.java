package br.edu.ifpb.ads.padroes.atv2.config;
import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.PayPalAdapter;
import com.google.inject.AbstractModule;

public class PayPalModule extends AbstractModule{
    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(PayPalAdapter.class);
    }
}
