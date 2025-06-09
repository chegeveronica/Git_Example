package com.veronica.app;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Saucer {

 public void generatePdfFromXhtmlFile(String inputXhtmlPath, String outputPdfPath) throws Exception {
  String xhtmlContent = new String(Files.readAllBytes(Paths.get(inputXhtmlPath)), StandardCharsets.UTF_8);
  ITextRenderer renderer = new ITextRenderer();
  renderer.setDocumentFromString(xhtmlContent);
  renderer.layout();
  try (OutputStream os = new FileOutputStream(outputPdfPath)) {
   renderer.createPDF(os);
  }
 }
}

