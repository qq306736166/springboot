package com.Application.interfase;

import com.sun.xml.internal.ws.util.xml.XmlUtil;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.xml.bind.annotation.XmlRegistry;
import java.io.StringReader;
import java.util.*;

public interface ApplicationXmlInter extends com.Application.interfase.ApplicationXml {

    Logger LOG = LoggerFactory.getLogger(XmlUtil.class);

    static Logger getLOG() {
        return com.Application.xml.ApplicationXml.LOG;
    }

    static Element readerXml(String xml) {
        Document document = null;
        StringReader sr = new StringReader(xml);
        SAXReader saxReader = new SAXReader();
        try {
            document = saxReader.read(sr);
        } catch (Exception e) {
            com.Application.xml.ApplicationXml.LOG.error("解析错误", e);
        }
        return null == document ? null : document.getRootElement();
    }

    static String getText(Element em, String tag) {
        if (null == em) {
            return null;
        }
        Element e = em.element(tag);
        return null == e ? null : e.getText();
    }
    @SuppressWarnings(value = "unchecked")
    static List<Map<String, Object>> listNodes(Element node, String nodeName) {
        if (null == node) {
            return null;
        }
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        List<Attribute> list = node.attributes();
        Map<String, Object> map = null;
        for (Attribute attribute : list) {
            if (nodeName.equals(node.getName())) {
                if (null == map) {
                    map = new HashMap<String, Object>();
                    listMap.add(map);
                }
                map.put(attribute.getName(), attribute.getValue());
            }

        }
        Iterator<Element> iterator = node.elementIterator();
        while (iterator.hasNext()) {
            Element e = iterator.next();
            listMap.addAll(listNodes(e, nodeName));
        }
        return listMap;
    }

    XmlRegistry getXmlRegistry();

    Element getElement();

    void setElement(Element element);
}
