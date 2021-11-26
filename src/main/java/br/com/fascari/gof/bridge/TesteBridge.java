package br.com.fascari.gof.bridge;

import br.com.fascari.gof.bridge.platforms.Facebook;
import br.com.fascari.gof.bridge.platforms.IPlatform;
import br.com.fascari.gof.bridge.platforms.TwitchTV;
import br.com.fascari.gof.bridge.platforms.YouTube;
import br.com.fascari.gof.bridge.transmissions.AdvancedLive;

public class TesteBridge {

    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
    }

    public static void startLive(IPlatform platform) {
       /* System.out.println("...Aguarde!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();

        */
        System.out.println("Transmissão avançada...aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
    }
}
