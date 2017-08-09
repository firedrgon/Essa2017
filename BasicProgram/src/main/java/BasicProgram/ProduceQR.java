package BasicProgram;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.File;
import java.io.IOException;

/**
 * Created by Yuanping on 2017/7/26.
 */
public class ProduceQR {
    public static void main(String[] args) throws WriterException, IOException {
        int size = 500;
        String content = "http://www.baidu.com";

        QRCodeWriter writer = new QRCodeWriter();
        BitMatrix m = writer.encode(content, BarcodeFormat.QR_CODE, size, size);
        // 生成二维码
        File outputFile = new File("d:" + File.separator + "zxing.png");
        com.google.zxing.client.j2se.MatrixToImageWriter.writeToFile(m, "png", outputFile);
    }
}
