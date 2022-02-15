import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * @author l
 */
public class teste {
    public static void main(String[] args) throws Exception {
        //createUPCA("12345678900");
        // createUPCA("183657185678");
    }

    /*public static BufferedImage createUPCA(String data) throws BarcodeException, OutputException, IOException {
        /*Barcode barcode = BarcodeFactory.createUPCA(data);
        barcode.setPreferredBarHeight(100);
        barcode.setBarWidth(2);
        File imgFile = new File("barcode1.png");
        BarcodeImageHandler.savePNG(barcode, imgFile);*/
    //Barcode barcode = BarcodeFactory.createUPCA(data);
        /*Barcode barcode = BarcodeFactory.createEAN13(data);

        return BarcodeImageHandler.getImage(barcode);
    }*/
    //  }

}