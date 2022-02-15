import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

import java.io.File;

/**
 * @author l
 */
public class teste3 {
    public static void main(String[] args) throws BarcodeException {
        // get a Barcode from the BarcodeFactory
        Barcode barcodeUPCA = BarcodeFactory.createUPCA("12345678098");
        barcodeUPCA.setBarWidth(100);
        System.out.println(barcodeUPCA.getData());
        try {
            File f = new File("barcodes\\barcodeUPCA.jpeg");

            // Let the barcode image handler do the hard work
            BarcodeImageHandler.savePNG(barcodeUPCA, f);
        } catch (Exception e) {
            // Error handling here
        }

    }
}

