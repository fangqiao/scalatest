/**
 * Wxpay configuration file.
 * Copied from official example
 *
 */


import com.github.wxpay.sdk.WXPayConfig;
import java.io.*;

public class WxpayConfig implements WXPayConfig{

    private byte[] certData;

    public WxpayConfig() throws Exception {
        File file = new File("/path/to/key.p12");
        InputStream certStream = new FileInputStream(file);
        this.certData = new byte[(int) file.length()];
        certStream.read(this.certData);
        certStream.close();
    }

    public String getAppID() {
        return "appid";

    }

    public String getMchID() {
        return "mchid***";
    }

    public String getKey() {
        return "key***";
    }

    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    public int getHttpReadTimeoutMs() {
        return 10000;
    }
}
