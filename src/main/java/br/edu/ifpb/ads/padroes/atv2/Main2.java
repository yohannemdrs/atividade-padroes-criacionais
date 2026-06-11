package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.config.PagSeguroModule;
import br.edu.ifpb.ads.padroes.atv2.config.PayPalModule;
import br.edu.ifpb.ads.padroes.atv2.config.StripeModule;
import br.edu.ifpb.ads.padroes.atv2.service.PagamentoService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("-Rodando com o Container PayPal");
        Injector paypalInjector = Guice.createInjector(new PayPalModule());

        PagamentoService servicoPayPal = paypalInjector.getInstance(PagamentoService.class);
        servicoPayPal.efetuarPagamento(250.00);

        System.out.println("\n-Rodando com o Container Stripe");
        Injector stripeInjector = Guice.createInjector(new StripeModule());
        PagamentoService servicoStripe = stripeInjector.getInstance(PagamentoService.class);
        servicoStripe.efetuarPagamento(120.50);

        System.out.println("\n--- Rodando com o Container PagSeguro ---");
        Injector pagSeguroInjector = Guice.createInjector(new PagSeguroModule());
        PagamentoService servicoPagSeguro = pagSeguroInjector.getInstance(PagamentoService.class);
        servicoPagSeguro.efetuarPagamento(89.90);
    }
}
