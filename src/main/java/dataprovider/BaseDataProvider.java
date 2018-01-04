package dataprovider;

import org.testng.annotations.DataProvider;
import util.CsvTestData;

import java.lang.reflect.Method;

public class BaseDataProvider {

    private CsvTestData csvTestData = new CsvTestData();

    @DataProvider(name = "base-data-provider")
    public Object[][] getCsvData(Method method) {
        if (method.isAnnotationPresent(CsvDataProvider.class)) {
            try {
                String csvFilePath = method.getAnnotation(CsvDataProvider.class).filePath();
                return csvTestData.getDataFromCsvFile(getClass().getResource(csvFilePath).getPath());
            } catch (NullPointerException ex) {
                throw new NullPointerException("Csv file is missed!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        throw new NullPointerException("CsvDataProvider annotation is missed!");
    }
}