package Pages;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class dataMapper {
    String TC_Id;
    public static HashMap<String,String> testData=new HashMap<>();

    public void getData(String TCid) throws IOException {
        TC_Id=TCid;
        System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
        FileInputStream io=new FileInputStream("src/test/java/Utility/testData.xls");

        HSSFWorkbook workbook=new HSSFWorkbook(io);
        HSSFSheet sheet = workbook.getSheetAt(0);
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        System.out.println(rowCount);

       for(int i=1;i<=rowCount;i++){
            System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
           if((sheet.getRow(i).getCell(0).getStringCellValue()).equals("TC001") ){
               System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
               int noOfColomn=(sheet.getRow(i).getLastCellNum())-(sheet.getRow(i).getFirstCellNum());
               System.out.println(noOfColomn);
               for(int j=0;j<noOfColomn;j++){
                   testData.put(sheet.getRow(0).getCell(j).getStringCellValue(),sheet.getRow(i).getCell(j).getStringCellValue());
               }
           }

       }

        System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");



    }




}
