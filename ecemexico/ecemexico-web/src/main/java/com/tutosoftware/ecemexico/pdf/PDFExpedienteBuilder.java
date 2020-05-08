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


import com.tutosoftware.ecemexico.entity.Paciente;
public class PDFExpedienteBuilder extends AbstractITextPdfView{
	
	
	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document doc,
			PdfWriter writer, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// get data model which is passed by the Spring container
		@SuppressWarnings("unchecked")
		List<Paciente> listPaciente = (List<Paciente>) model.get("listPaciente");
		
		doc.add(new Paragraph("Presentar este documento cada vez que vayas a consulta"));
		
		PdfPTable table = new PdfPTable(2);
		table.setWidthPercentage(100.0f);
		table.setWidths(new float[] {2.0f,3.0f});
		table.setSpacingBefore(10);
		
		// define font for table header row
		Font font = FontFactory.getFont(FontFactory.HELVETICA);
		font.setColor(BaseColor.WHITE);
		
		// define table header cell
		PdfPCell cell = new PdfPCell();
		cell.setBackgroundColor(BaseColor.BLUE);
		cell.setPadding(5);
		
		// write table header 
		cell.setPhrase(new Phrase("Nombre", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Numero Expediente", font));
		table.addCell(cell);

		
		
		// write table row data
		for (Paciente paciente : listPaciente) {
			table.addCell(paciente.getNombre()+" "+paciente.getApellidoPaterno()+" "+paciente.getApellidoMaterno());
			table.addCell(paciente.getIdUsuario());
			
		}
		
		doc.add(table);
		
	}

}
