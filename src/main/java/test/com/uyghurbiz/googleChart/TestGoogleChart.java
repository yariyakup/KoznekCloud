package test.com.uyghurbiz.googleChart;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;
import com.google.visualization.datasource.render.JsonRenderer;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Yari_Dev on 11/24/15.
 */
public class TestGoogleChart {
    @Test
    public void test() {

        System.out.println(show());


    }

    private  String show() {
        JsonNode root = null;
        String json = JsonRenderer.renderDataTable(generateDataTable(), true, true).toString();

        return json.toString();
    }

    private static DataTable generateDataTable() {

        // Create a data table,
        DataTable data = new DataTable();
        ArrayList cd = new ArrayList();
        cd.add(new ColumnDescription("name", ValueType.TEXT, "Animal name"));
        cd.add(new ColumnDescription("link", ValueType.TEXT, "Link to wikipedia"));
        cd.add(new ColumnDescription("population", ValueType.NUMBER, "Population size"));
        cd.add(new ColumnDescription("vegeterian", ValueType.TEXT, "Vegetarian?"));

        data.addColumns(cd);

        // Fill the data table.
        try {
            data.addRowFromValues("Aye-aye", "http://en.wikipedia.org/wiki/Aye-aye", 100, "yes");
        } catch (TypeMismatchException e) {
            System.out.println("Invalid type!");
        }


        return data;
    }
}
