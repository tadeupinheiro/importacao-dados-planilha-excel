package dev.tadeupinheiro;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ImportacaoDeEstoque {

    public List<Tecido> criar() throws IOException {
        List<Tecido> tecidos = new ArrayList<>();

        try {
            FileInputStream fisPlanilha = new FileInputStream("C:\\Projetos\\importacao-dados-planilha-excel\\src\\main\\resources\\planilhanova.xlsx");
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
                            tecido.setCodigoRolo((int)cell.getNumericCellValue());
                            break;
                        case 1:
                            tecido.setArtigo(cell.getStringCellValue());
                            break;
                        case 2:
                            tecido.setAcabamento(cell.getStringCellValue());
                            break;
                        case 3:
                            tecido.setCor(cell.getStringCellValue());
                            break;
                        case 4:
                            tecido.setMetragem(cell.getNumericCellValue());
                            break;
                        case 5:
                            tecido.setLargura(cell.getNumericCellValue());
                            break;
                        case 6:
                            tecido.setQualidade((int) cell.getNumericCellValue());
                            break;
                        case 7:
                            tecido.setPrecoCusto(BigDecimal.valueOf(cell.getNumericCellValue()));
                            break;
                        case 8:
                            tecido.setNumeroPedido((int) cell.getNumericCellValue());
                            break;
                        case 9:
                            tecido.setNotafiscal((int) cell.getNumericCellValue());
                            break;
                        case 10:
                            tecido.setDataNota(conversaoData(cell.getStringCellValue()));
                            break;
                        case 11:
                            tecido.setEmpresa(cell.getStringCellValue());
                            break;
                    }
                }
            }
            fisPlanilha.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Arquivo excel não encontrado!");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return tecidos;
    }

    public Date conversaoData (String dataRecebida) throws ParseException {

        SimpleDateFormat formatoPadrao = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formatoPadrao.parse(dataRecebida);

        return dataFormatada;
    }
}
