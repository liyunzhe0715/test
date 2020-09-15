package cn.tx.sboot.model;

import lombok.Data;

import java.net.InetAddress;

/**
 * @author liyunzhe
 * @create 2020-08-27
 */
@Data
public class AnotherComponent {

    private boolean enabled;

    private InetAddress remoteAddress;

    /*public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public InetAddress getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(InetAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }*/
}
