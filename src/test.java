import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringJoiner;

public class test {


    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String sqlSelect = buildSelectSql(table,fields);
        System.out.println(sqlSelect);


    }
    static String buildSelectSql(String table, String[] fields) {
        // TODO:
        StringJoiner stringJoiner = new StringJoiner(",","SELECT "," FROM "+table);
        for (String s:fields
             ) {stringJoiner.add(s);

        }
        return stringJoiner.toString();
    }
}
