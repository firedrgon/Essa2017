package BasicProgram;

import org.apache.commons.lang.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Yuanping on 2017/8/18.
 */
public class ipv4Test {
    private static final String IPV4_REGEX = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."
            +"(00?\\d|1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
            +"(00?\\d|1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
            +"(00?\\d|1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
    public static void main(String[] args) {
        System.out.println(ipv4Test.isIpv4("www.baidu.com"));
    }

    /**
     * 判断是否合法的ipv4
     * @param ip
     * @return
     */
    public static boolean isIpv4(String ip) {
        if (StringUtils.isBlank(ip)) {
            return false;
        }
        Pattern pattern = Pattern.compile(IPV4_REGEX);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

}
