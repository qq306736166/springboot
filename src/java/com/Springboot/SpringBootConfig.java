package com.Springboot;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SpringBootConfig extends SpringBootApplication implements com.Application.interfase.SpringBootConfig {

    public Map<String, Object> getOptions() {
        return options;
    }

    public void setOptions(Map<String, Object> options) {
        this.options = options;
    }

    private Map<String,Object> options;


    public SpringBootConfig(Map<String, Object> options){
        this.options = options;
        options.put("options",SpringBootEnum.SPRING_BOOT);
    }

    @Override
    public boolean SpringConfig(Map<String, Object> options) {
        this.options = options;
        options.put("options",SpringBootEnum.SPRING_BOOT);
        boolean is = false;
        if(options.containsValue(SpringBootEnum.SPRING_BOOT)){
            if (options.get("version").equals(SpringBootEnum.SPRING_BOOT.getVersion())){

                SpringBootEnum.SPRING_BOOT.setVersion(options.get("version").toString());
                is = true;
            }else if(options.get("server").equals(SpringBootEnum.SPRING_BOOT.getServer())){

                SpringBootEnum.SPRING_BOOT.setServer(options.get("server").toString());
                is = true;
            }else if(options.get("port").equals(SpringBootEnum.SPRING_BOOT.getPort())){

                SpringBootEnum.SPRING_BOOT.setPort((Integer) options.get("port"));
                is = true;
            }else if(options.get("host").equals(SpringBootEnum.SPRING_BOOT.getHost())){

                SpringBootEnum.SPRING_BOOT.setHost(options.get("host").toString());
                is = true;
            }
            else if(options.get("datasource").equals(SpringBootEnum.SPRING_BOOT.getDatasource())){

                SpringBootEnum.SPRING_BOOT.setDatasource(options.get("datasource").toString());
                is = true;
            }
            else{
                Logger logger = Logger.getLogger("com.Application.Application","");
                logger.log(Level.CONFIG,"异常");
            }
            return is;
        }
        return false;
    }
}

enum SpringBootEnum{

    SPRING_BOOT("","",0,"","");

    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    private String server;
    private Integer port;
    private String host;
    private String datasource;

    SpringBootEnum(String version,String server,Integer port,String host,String datasource){
        this.version = version;
        this.server = server;
        this.port = port;
        this.host = host;
        this.datasource = datasource;
    }
}
