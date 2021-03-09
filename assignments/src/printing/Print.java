package printing;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.standard.PrinterName;
import java.awt.print.PrinterJob;

public class Print {

    public static void print(String data) {

        try {

            DocFlavor flavor = DocFlavor.STRING.TEXT_PLAIN;
//            PrintService printService = PrintServiceLookup.lookupDefaultPrintService();
            PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
            DocPrintJob job = printServices[0].createPrintJob();
            Doc doc = new SimpleDoc(data, flavor, null);
            job.print(doc, null);

        } catch (PrintException e) {
            e.printStackTrace();
        }
    }

    public static void printListOfPrinters() {
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
        System.out.println("Number of print services: " + printServices.length);

        for (PrintService printer : printServices)
            System.out.println("Printer: " + printer.getName());
    }

}