package ru.docophila;
import javax.servlet.MultipartConfigElement;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import static spark.Spark.*;

public class Site {

    public static String PATH = "E:\\docophila\\site\\src\\main\\resources\\public";
    /*
    staticFiles.externalLocation("src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"public"+ File.separator+"dashboard"+ File.separator);
    */
    public static void main(String[] args) {
        port(80);
        //staticFiles.location("/public");
        staticFiles.externalLocation("src"+ File.separator +"main"+ File.separator +"resources"+ File.separator +"public"+ File.separator);
        post("/upload", (req,res)->{
            File uploadDir = new File(PATH);
            Path tempFile = Files.createTempFile(uploadDir.toPath(), "", ".png");

            req.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement("/temp"));

            try (InputStream input = req.raw().getPart("uploaded_file").getInputStream()) { // getPart needs to use same "name" as input field in form
                Files.copy(input, tempFile, StandardCopyOption.REPLACE_EXISTING);
            }
            System.out.println("File has been uploaded: "+tempFile.getFileName());

            return Ok.getPage(tempFile.getFileName().toString());
        });
    }
}
