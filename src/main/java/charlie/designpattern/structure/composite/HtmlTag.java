package charlie.designpattern.structure.composite;

import java.util.List;

/**
 * Created by charlie on 11/01/2018.
 */
public abstract class HtmlTag {
    abstract String getTagName();
    abstract void setStartTagName(String tag);
    abstract void setEndTagName(String tag);

    public void setTagBody(String tagBody) {
        throw new UnsupportedOperationException("Current operation is not supported for this object.");
    }

    public void addChild(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("Current operation is not supported for this object.");
    }

    public void removeChild(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("Current operation is not supported for this object.");
    }

    public List<HtmlTag> getChildren() {
        throw new UnsupportedOperationException("Current operation is not supported for this object.");
    }

    abstract void generateHtml();
}
