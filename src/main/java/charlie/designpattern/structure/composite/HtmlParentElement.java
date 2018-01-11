package charlie.designpattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by charlie on 11/01/2018.
 */
public class HtmlParentElement extends HtmlTag {
    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag> childrenTag;

    public HtmlParentElement(String tagName) {
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
    }

    @Override
    String getTagName() {
        return tagName;
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
    public void addChild(HtmlTag htmlTag) {
        this.childrenTag.add(htmlTag);
    }

    @Override
    public void removeChild(HtmlTag htmlTag) {
        this.childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return this.childrenTag;
    }

    @Override
    void generateHtml() {
        System.out.println(startTag);
        for (HtmlTag htmlTag : childrenTag) {
            htmlTag.generateHtml();
        }
        System.out.println(endTag);
    }
}
