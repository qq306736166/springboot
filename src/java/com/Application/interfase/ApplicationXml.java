package com.Application.interfase;

import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ApplicationXml {

    List<Map<String, Object>> list = new ArrayList<>();
    Map<String, Object> map = new HashMap<>();
    Logger logger = LoggerFactory.getLogger(ApplicationXml.class);

    static List<Map<String, Object>> listNodes(Element node, String nodeName) {
        map.put("app_name", "");
        map.put("app_version", "");
        map.put("app_author", "");
        map.put("app_introduce", "");
        map.put("app_openid", "");
        if (!list.isEmpty()) {
            list.add(map);
            return list;
        }else{
            logger.error("获取异常");
        }
        return list;
    }
}
