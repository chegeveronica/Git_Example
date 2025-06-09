package com.veronica.app;

public class Main {
    public static void main(String[] args) {
        // Paths
        String xhtmlFilePath = "src/main/resources/templates/template.xhtml";
        String outputPdfPath = "output.pdf";

        // Generating PDF
        Saucer pdfGenerator = new Saucer();
        try {
            pdfGenerator.generatePdfFromXhtmlFile(xhtmlFilePath, outputPdfPath);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Failed to generate PDF: " + e.getMessage());
        }
    }
}