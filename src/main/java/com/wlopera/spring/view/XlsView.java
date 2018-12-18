package com.wlopera.spring.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.wlopera.spring.domain.Movie;

public class XlsView extends AbstractXlsView {

    @SuppressWarnings("unchecked")
	@Override
    protected void buildExcelDocument(
            Map<String, Object> model,
            Workbook workbook,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        // cambiar nombre de archivo
        response.setHeader("Content-Disposition", "attachment; filename=\"customer.xls\"");

        // crear una pagina excel
        Sheet sheet = workbook.createSheet("Peliculas");

        Row header = sheet.createRow(0);

        header.createCell(0).setCellValue("Nombre");
        header.createCell(1).setCellValue("Género");
        header.createCell(2).setCellValue("Año");
        header.createCell(3).setCellValue("Clase");

        int movieRow = 1;

        for (Movie movie : (List<Movie>) model.get("movieList")) {
            Row row = sheet.createRow(movieRow++);

            row.createCell(0).setCellValue(movie.getName());
            row.createCell(1).setCellValue(movie.getGender());
            row.createCell(2).setCellValue(movie.getYear());
            row.createCell(3).setCellValue(movie.getClase());
            
        }
    }
}