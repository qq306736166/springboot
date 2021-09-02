package com.Application.xml;

import com.Application.interfase.ApplicationXmlInter;
import com.sun.xml.internal.ws.util.xml.XmlUtil;
import org.dom4j.Element;
import javax.xml.bind.annotation.XmlRegistry;


@XmlRegistry

public class ApplicationXml extends XmlUtil implements ApplicationXmlInter {

    private XmlRegistry xmlRegistry;
    private Element element;

    @Override
    public XmlRegistry getXmlRegistry() {
        return xmlRegistry;
    }


    @Override
    public Element getElement() {
        return element;
    }

    @Override
    public void setElement(Element element) {
        this.element = element;
    }

}

