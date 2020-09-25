package com.interview.study.basic.aspose;

import com.aspose.words.*;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;

public class AsposeWordTest {
    public static void main(String[] args) {
        try {
//            File file = ResourceUtils.getFile("classpath:word/template.docx");
            Document doc = new Document();

// Tables are placed in the body of a document
            Table table = new Table(doc);
            doc.getFirstSection().getBody().appendChild(table);

// Tables contain rows, which contain cells,
// which contain contents such as paragraphs, runs and even other tables
// Calling table.EnsureMinimum will also make sure that a table has at least one row, cell and paragraph
            Row firstRow = new Row(doc);
            table.appendChild(firstRow);

            Cell firstCell = new Cell(doc);
            firstRow.appendChild(firstCell);

            Paragraph paragraph = new Paragraph(doc);
            firstCell.appendChild(paragraph);

            Run run = new Run(doc, "Hello world!");
            paragraph.appendChild(run);

            doc.save(getArtifactsDir() + "Table.CreateTable.docx");
            System.out.println(ResourceUtils.getFile("classpath:word/").getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getArtifactsDir() throws FileNotFoundException {
        return ResourceUtils.getFile("classpath:word/").getPath()+"/";
    }
}
