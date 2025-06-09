package com.veronica.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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
            log.info("Failed to generate PDF: " + e.getMessage());
        }
    }
}