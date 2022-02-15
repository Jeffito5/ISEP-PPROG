import javax.swing.*;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;

import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.print.PrinterJob;
import java.io.*;

/**
 * @author l
 */
public class teste2 {
    /*public static void main(String[] args)
    {
        try
        {
            Barcode b = BarcodeFactory.createCode128("Hello");
            /*PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(b);
            if (job.printDialog())
            {
                job.print();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }*/

  /*  }}*/
// NÃO PRECISO
    public void usingBarbecueAsSwingComponent() {
        JPanel panel = new JPanel();

        // Always get a Barcode from the BarcodeFactory
        Barcode barcode = null;
        try {
            barcode = BarcodeFactory.createCode128B("My Barcode");
        } catch (BarcodeException e) {
            // Error handling
        }

        /* Because Barcode extends Component, you can use it just like any other
         * Swing component. In this case, we can add it straight into a panel
         * and it will be drawn and layed out according to the layout of the panel.
         */
        panel.add(barcode);
    }
    // NÃO PRECISO
    public void drawingBarcodeDirectToGraphics() throws BarcodeException, OutputException {
        // Always get a Barcode from the BarcodeFactory
        Barcode barcode = BarcodeFactory.createCode128B("My Barcode");

        // We are created an image from scratch here, but for printing in Java, your
        // print renderer should have a Graphics internally anyway
        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_BYTE_GRAY);
        // We need to cast the Graphics from the Image to a Graphics2D - this is OK
        Graphics2D g = (Graphics2D) image.getGraphics();

        // Barcode supports a direct draw method to Graphics2D that lets you position the
        // barcode on the canvas
        barcode.draw(g, 10, 56);
    }
// PRECISO
    public void outputtingBarcodeAsPNG() throws BarcodeException {
        // get a Barcode from the BarcodeFactory
        Barcode barcode = BarcodeFactory.createCode128B("My Barcode");

        try {
            File f = new File("mybarcode.png");

            // Let the barcode image handler do the hard work
            BarcodeImageHandler.savePNG(barcode, f);
        } catch (Exception e) {
            // Error handling here
        }
    }
}
