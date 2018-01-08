package BasicProgram;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by Yuanping on 2017/10/23.
 */
public class MD5Test {
    // 测试配置信息 & 很重要
    public final static String ENCRYPT_VAL = "123456@HT"; // MD5加密的值
    public final static String CHANNELCODE = "100000"; // 渠道编码
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 测试报文
        String insureJson = "{\"appntObject\":{\"appIDType\":\"01\",\"appName\":\"赵正龙\",\"appNumber\":\"320122197908092014\",\"appType\":1,\"isTaxInvoice\":0},\"channelObject\":{\"bizCode\":\"101\",\"channelCode\":\"100041\",\"channelName\":\"罗计物流\",\"createTime\":1508749216692,\"orderId\":\"1000412017102316595600000109\"},\"definedSafeObj\":{\"isDefinedSafe\":0},\"insuranceObject\":{\"amount\":10.00,\"amtCur\":\"01\",\"copy\":1,\"effectiveTime\":1508774400000,\"insuranceCode\":\"驾乘人员意外伤害保险\",\"plan\":\"A\",\"premium\":0.01,\"prmCur\":\"01\",\"terminalTime\":1540310400000},\"insuredObject\":{\"insuredIDType\":\"01\",\"insuredName\":\"赵正龙\",\"insuredNumber\":\"320122197908092014\",\"insuredTelNumber\":\"18588671104\",\"insuredType\":1,\"isLegal\":0},\"payObject\":{\"isSinglePay\":1,\"payBankNo\":\"2017102321001004030279213239\",\"payDate\":1508749214000,\"payMode\":\"23\"}}";
        insureJson = URLEncoder.encode(insureJson, "utf-8");
        // 针对url传递特殊字符转译问题
        insureJson = insureJson.replaceAll("%","%25");

        String signature = MD5Util.MD5Encode(insureJson + ENCRYPT_VAL, "utf-8"); // 加密
        System.out.println(signature);
    }
}
