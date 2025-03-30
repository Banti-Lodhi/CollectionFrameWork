package com.SpringSystem.model;
class QueryBuild {
    public String buildQuery(String[] columns, String table) {
        StringBuilder query = new StringBuilder("SELECT ");
        for(int i=0; i<columns.length; i++) {
            query.append(columns[i]);
            if(i<columns.length-1) {
              query.append(", ");
            }
        }
        query.append(" FROM ").append(table);
        return query.toString();
    }
}
public class StringBuilderExp {
    public static void main(String[] args) {
        QueryBuild queryBuild = new QueryBuild();
        String[] columns = {"id", "name", "email"};
        String table = "users";
        String query =queryBuild.buildQuery(columns, table);
        System.out.println(query);
    }
}
