package com.wlopera.spring.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.wlopera.spring.domain.Movie;

public class PdfView extends AbstractPdfView {

	@SuppressWarnings("unchecked")
	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Movie> movieList = (List<Movie>) model.get("movieList");

		PdfPTable table = new PdfPTable(4);

		table.addCell("Nombre");
		table.addCell("Género");
		table.addCell("Año");
		table.addCell("Clase");

		movieList.forEach(movie -> {
			table.addCell(movie.getName());
			table.addCell(movie.getGender());
			table.addCell(String.valueOf(movie.getYear()));
			table.addCell(String.valueOf(movie.getClase()));
		});

		document.add(table);
	}
}
