package br.com.fascari.gof.bridge.transmissions;

import br.com.fascari.gof.bridge.platforms.IPlatform;

public class AdvancedLive extends Live {

    public AdvancedLive(IPlatform platform) {
        super.platform = platform;
    }

    public void subtitles() {
        System.out.println("Legendas ativadas na Transmissão!");
    }

    public void comments() {
        System.out.println("Comentários liberados na live");
    }
}
