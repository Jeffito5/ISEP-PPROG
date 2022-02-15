
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Luís Araújo
 */
class ImportClinicalTestsController {
    public static void main(String[] args) throws Exception {
        readCSVFilesBlood();
        //readCSVFilesCovid();
    }
    public static void readCSVFilesBlood() {
        List<String> tests = readTestsFromCSV("C:\\Users\\User\\Documents\\IntelliJ\\PPROG\\1\\tests_BloodMDISCCSV.csv");
        List<String> clients = readClientsFromCSV("C:\\Users\\User\\Documents\\IntelliJ\\PPROG\\1\\tests_BloodMDISCCSV.csv");
        System.out.println(clients);
    }


    public static void readCSVFilesCovid() {
        List<String> tests = readTestsFromCSV("C:\\Users\\User\\Documents\\IntelliJ\\PPROG\\1\\tests_CovidMATCPCSV");
        List<String> clients = readTestsFromCSV("C:\\Users\\User\\Documents\\IntelliJ\\PPROG\\1\\tests_CovidMATCPCSV");
        System.out.println(clients);
    }

    private static List<String> readTestsFromCSV(String fileName) {
        List<String> tests = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                tests.add(values[0]);
                tests.add(values[1]);
                tests.add(values[2]);
                tests.add(values[11]);
                tests.add(values[12]);
                tests.add(values[13]);
                tests.add(values[14]);
                tests.add(values[15]);
                tests.add(values[16]);
                tests.add(values[17]);
                tests.add(values[18]);
                tests.add(values[19]);
                tests.add(values[20]);
                tests.add(values[21]);
                tests.add(values[22]);
                tests.add(values[23]);
                tests.add(values[24]);
                tests.add("\n");
                //tests.add(Arrays.toString(values) + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tests;
    }

    private static List<String> readClientsFromCSV(String fileName) {
        List<String> clients = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                clients.add(values[3]);
                clients.add(values[4]);
                clients.add(values[5]);
                clients.add(values[6]);
                clients.add(values[7]);
                clients.add(values[8]);
                clients.add(values[9]);
                clients.add(values[10]);
                clients.add("\n");
                //tests.add(Arrays.toString(values) + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clients;
    }
}
