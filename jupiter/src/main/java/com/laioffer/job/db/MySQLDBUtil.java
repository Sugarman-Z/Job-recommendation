package com.laioffer.job.db;

public class MySQLDBUtil {
    private static final String INSTANCE = "jobrecommendation.c318cez1oi3a.us-east-2.rds.amazonaws.com";
    private static final String PORT_NUM = "3306";
    public static final String DB_NAME = "JobRecommendation";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "Zgy01781817";
    public static final String URL = "jdbc:mysql://"
            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&autoReconnect=true&serverTimezone=UTC";
}
