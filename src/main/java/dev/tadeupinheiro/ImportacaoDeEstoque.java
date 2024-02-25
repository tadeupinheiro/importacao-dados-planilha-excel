package dev.tadeupinheiro;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImportacaoDeEstoque {

    public List<Tecido> criar() throws IOException {
        List<Tecido> tecidos = new ArrayList<>();

        try {
            FileInputStream fisPlanilha = new FileInputStream("C:\\Projetos\\novo-teste-excel\\src\\main\\resources\\planilhanova.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fisPlanilha);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();

                Tecido tecido = new Tecido();
                tecidos.add(tecido);
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getColumnIndex()) {
                        case 0:
                            tecido.setArtigo(cell.getStringCellValue());
                            break;
                        case 1:
                            tecido.setAcabamento(cell.getStringCellValue());
                            break;
                        case 2:
                            tecido.setCor(cell.getStringCellValue());
                            break;
                        case 3:
                            tecido.setMetragem(cell.getNumericCellValue());
                            break;
                        case 4:
                            tecido.setQualidade((int) cell.getNumericCellValue());
                            break;
                        case 5:
                            tecido.setNotafiscal((int) cell.getNumericCellValue());
                            break;
                        case 6:
                            tecido.setEmpresa(cell.getStringCellValue());
                            break;
                    }
                }
            }
            fisPlanilha.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Arquivo excel não encontrado!");
        }

        return tecidos;
    }
}
