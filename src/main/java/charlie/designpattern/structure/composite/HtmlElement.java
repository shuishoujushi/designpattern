package charlie.designpattern.structure.composite;

/**
 * Created by charlie on 11/01/2018.
 */
public class HtmlElement extends HtmlTag {
    private String tagName;
    private String startTag;
    private String endTag;
    private String tagBody;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.tagBody = "";
    }

    @Override
    String getTagName() {
        return this.tagName;
    }

    @Override
    void setStartTagName(String tag) {
        this.startTag = tag;
    }

    @Override
    void setEndTagName(String tag) {
        this.endTag = tag;
    }

    @Override
    public void setTagBody(String tagBody) {
        this.tagBody = tagBody;
    }

    @Override
    void generateHtml() {
        System.out.println(startTag + "" + tagBody + "" + endTag);
    }
}
