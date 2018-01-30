package charlie.designpattern.behavior.vistor;

import java.util.List;

/**
 * Created by charlie on 30/01/2018.
 */
public abstract class HtmlTag implements Element{
    public abstract String getTagName();
    public abstract String getStartTag();
    public abstract String getEndTag();
    public abstract void setStartTag(String tag);
    public abstract void setEndTag(String tag);
    public abstract void generateHtml();

    public void setTagBody(String tagBody) {
        throw new UnsupportedOperationException("Not support current operation for this object");
    }

    public void addChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("Not support current operation for this object");
    }

    public void removeChildTag(HtmlTag htmlTag) {
        throw new UnsupportedOperationException("Not support current operation for this object");
    }

    public List<HtmlTag> getChildren() {
        throw new UnsupportedOperationException("Not support current operation for this object");
    }
}
