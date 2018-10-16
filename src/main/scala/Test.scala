import com.github.wxpay.sdk._

object Test extends App {
  val body = "test"
  val decoded = WXPayUtil.xmlToMap(body)
  val wxpayConfig = new WxpayConfig()
}
