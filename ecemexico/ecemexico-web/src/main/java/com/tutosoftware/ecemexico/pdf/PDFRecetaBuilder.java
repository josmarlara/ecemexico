package com.tutosoftware.ecemexico.pdf;


import java.util.List;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.tutosoftware.ecemexico.model.RecetaExp;

public class PDFRecetaBuilder extends AbstractITextPdfView{
	
	
	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document doc,
			PdfWriter writer, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		@SuppressWarnings("unchecked")
		List<RecetaExp> listReceta = (List<RecetaExp>) model.get("listReceta");
		
		doc.addTitle("Receta Médica");
		
		doc.add(new Paragraph("                             ECEMEXICO              "));
		
		// get data model which is passed by the Spring container
		
		doc.add(new Paragraph("Número de receta: "+listReceta.get(0).getNumeroReceta()));
		doc.add(new Paragraph("Médico: "+listReceta.get(0).getNombreDoctor()));
		doc.add(new Paragraph("Fecha: "+listReceta.get(0).getFecha()));
		
		
		
		
		PdfPTable table = new PdfPTable(5);
		table.setWidthPercentage(100.0f);
		table.setWidths(new float[] {1.0f,3.0f,2.0f,2.0f,2.0f});
		table.setSpacingBefore(10);
		
		// define font for table header row
		Font font = FontFactory.getFont(FontFactory.HELVETICA);
		font.setColor(BaseColor.WHITE);
		
		// define table header cell
		PdfPCell cell = new PdfPCell();
		cell.setBackgroundColor(BaseColor.BLUE);
		cell.setPadding(5);
		
		// write table header 
		cell.setPhrase(new Phrase("No.", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Medicamento", font));
		table.addCell(cell);
        
		cell.setPhrase(new Phrase("Dosis", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Duración", font));
		table.addCell(cell);
		
		
		cell.setPhrase(new Phrase("Notas", font));
		table.addCell(cell);
		
		
		List<String> medicamento = listReceta.get(0).getMedicamento();
		
		List<String> dosis = listReceta.get(0).getDosis();
		
		
		List<String> duracion = listReceta.get(0).getDuracion();
		
		
		List<String> notas = listReceta.get(0).getNotas();
		
		// write table row data
		for (int i=0;i<medicamento.size();i++) {
			table.addCell(String.valueOf(i+1));
			table.addCell(medicamento.get(i));
			table.addCell(dosis.get(i));
		    table.addCell(duracion.get(i));
			table.addCell(notas.get(i));
		}
		
		doc.add(table);
		
		
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph("                     FIRMA Y SELLO"));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph("                     ----------------------------"));
		doc.add(new Paragraph("                     Nombre del Médico/Doctor"));
		
		
		
		
	}
	
	
	
	

}
