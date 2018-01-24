package charlie.designpattern.behavior.cor;

import org.junit.Test;

/**
 * Created by charlie on 24/01/2018.
 */
public class TestCoRPattern {
    @Test
    public void testMethod() {
        MyFile file = null;

        Handler textHandler = new TextFileHandler("Text Handler");
        Handler videoHandler = new VideoFileHandler("Video Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");
        Handler excelHandler = new ExcelFileHandler("Excel Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler audioHandler = new AudioFileHandler("Audio Handler");

        textHandler.setHandler(videoHandler);
        videoHandler.setHandler(imageHandler);
        imageHandler.setHandler(excelHandler);
        excelHandler.setHandler(docHandler);
        docHandler.setHandler(audioHandler);

        file = new MyFile("a.mp3", "audio", "C");
        textHandler.process(file);

        file = new MyFile("b.jpg", "image", "C");
        videoHandler.process(file);
    }
}
