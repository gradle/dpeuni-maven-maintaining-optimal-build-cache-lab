package com.example.application;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class BuildInfo {
    private final Date buildTime;
    private final String version;

    public BuildInfo() throws IOException {
        Properties properties = new Properties();
        properties.load(getClass().getResourceAsStream("/build-info.properties"));
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        try {
            buildTime = sf.parse(properties.getProperty("timestamp"));
        } catch (ParseException e) {
            throw new IOException(e);
        }
        version = properties.getProperty("version");
    }


    public Date getBuildTime() {
        return buildTime;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "buildTime=" + buildTime + ", version=" + version;
    }
}
