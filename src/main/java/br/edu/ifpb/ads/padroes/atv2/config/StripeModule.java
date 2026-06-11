package br.edu.ifpb.ads.padroes.atv2.config;
import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.StripeAdapter;
import com.google.inject.AbstractModule;

public class StripeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(StripeAdapter.class);
    }
}
