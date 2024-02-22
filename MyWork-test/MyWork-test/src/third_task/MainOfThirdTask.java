package third_task;

import static third_task.DnsProvider.CLOUDFLARE;
import static third_task.DnsProvider.GOOGLE;

public class MainOfThirdTask {
    public static void main(String[] args) {
        Map<DnsProvider, DnsServer> mapOfDns = new Map<>();
        Map<String, String> mapOfStrings = new Map<>();
        mapOfDns.idetiPora(GOOGLE, new DnsServer("8.8.8.8", "8.8.4.4"));
        mapOfDns.idetiPora(CLOUDFLARE, new DnsServer("1.1.1.1", "1.0.0.1"));
        mapOfStrings.idetiPora("labas", "hello");
        mapOfStrings.idetiPora("pasaulis", "world");

        DnsServer googleDns = mapOfDns.gautiReiksme(GOOGLE);
        System.out.println(googleDns);
        DnsServer cloudflareDns = mapOfDns.gautiReiksme(CLOUDFLARE);
        System.out.println(cloudflareDns);
        String pasaulis = mapOfStrings.gautiReiksme("pasaulis");
        System.out.println(pasaulis);
        String labas = mapOfStrings.gautiReiksme("labas");
        System.out.println(labas);
    }

}
