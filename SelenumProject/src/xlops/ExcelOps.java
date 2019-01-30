package xlops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgHRMLib;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOps {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		String xlpath="F:\\Sridevi_Vennela\\Workspace\\SelenumProject\\src\\testdata\\Testdata.xlsx";
		String xlout="F:\\Sridevi_Vennela\\Workspace\\SelenumProject\\src\\results\\Empres.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpReg");
//		XSSFRow r=ws.getRow(5);
//		XSSFCell c=r.getCell(0);
		
//		System.out.println(c.getStringCellValue());
		
		int Rc=ws.getLastRowNum();
		
		OrgHRMLib om=new OrgHRMLib();
		om.Org_Launch("http://orangehrm.qedgetech.com");
		om.Org_Login("Admin", "Qedge123!@#");
		
		for (int i = 1; i <= Rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			
			XSSFCell c1=r.getCell(0);
			XSSFCell c2=r.getCell(1);
			XSSFCell c3=r.getCell(2);
			
			XSSFCell c4=r.createCell(3);
			
			String f=c1.getStringCellValue();
			String l=c2.getStringCellValue();
			String Eid=c3.getStringCellValue();
			
			System.out.println(f+"---"+l+"---"+Eid);
			
			String res=om.Org_EmpReg(f, l, Eid);
			
			c4.setCellValue(res);
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.Org_Logout();
		om.Org_Close();
	}

}
