package br.edu.ifpb.ads.padroes.atv2.sdk;

public class StripeSDK {
    public void charge(double amount) {
        System.out.println("[Stripe API] Cobrando valor de U$ " + amount);
    }
}
