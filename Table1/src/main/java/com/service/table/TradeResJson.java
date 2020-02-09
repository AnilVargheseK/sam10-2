package com.service.table;

import java.awt.Font;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import samptable.Notis2;

public class TradeResJson {

    JTable jTable1;
    public static String[] getTradeRes() throws IOException, SQLException {

        String json = "{\n"
                + "\"status\": \"success\",\n"
                + "\"messages\": {\n"
                + "\"code\": \"01010000\"\n"
                + "},\n"
                + "\"data\": {\n"
                + "\"msgId\": \"00240201310140000001\",\n"
                + "\"tradesInquiry\": \"6,20180420,,,805151,2^795393,N,2017070425016382,77575838105600,24924,25,5275,2,1.100000000128036E15,18,1383,1,GIMP01,06637,,2,6001,1183713348,1,0,N,,0,2.8100610400611E14,4098,N,,,,,,,,,^805151,N,2017070425019234,77575838826496,29135,735,40130,1,1.100000000137094E15,45,29670,1,SK129,06637,,2,6001,1183713360,1,0,N,,0,7.00006732002113E14,4096,N,,,,,,,,,^795393,N,2017070425016382,77575838105600,24924,25,5275,2,1.100000000128036E15,18,1383,1,GIMP01,06637,,2,6001,1183713348,1,0,N,,0,2.8100610400611E14,4098,N,,,,,,,,,^795393,N,2017070425016382,77575838105600,24924,25,5275,2,1.100000000128036E15,18,1383,1,GIMP01,06637,,2,6001,1183713348,1,0,N,,0,2.8100610400611E14,4098,N,,,,,,,,,\"\n"
                + "}\n"
                + "}";

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(json);
        System.out.println(jsonNode.toString());

        JsonNode status = jsonNode.path("status");
        System.out.println(status.getTextValue());
        String status1 = status.asText();
        System.out.println(status1);
//////////

//        List<String> items = Arrays.asList(status1.split("\\s*,\\s*"));
//        System.out.println("items  : " + items.toString());
////////////////////
        System.out.println("-----------------");

        JsonNode drNode = jsonNode.path("data");
//        Iterator<JsonNode> itr = drNode.getElements();
//        System.out.println("\n data :");
        JsonNode get = drNode.get("tradesInquiry");
        String tradesInquiry = get.asText();
        System.out.println("tradesInquiry: " + tradesInquiry);
        String ctrlRec = tradesInquiry.split("\\^")[0];
        System.out.println("Control Rec : " + ctrlRec);
        String dataRec = tradesInquiry.substring(tradesInquiry.indexOf("^") + 1);
        dataRec.trim();
        System.out.println("Data Records : " + dataRec);

        String[] arrData = dataRec.split("\\^");

      ArrayData ar=new ArrayData();
        //////////////////////////////////////////////////////////////////////////////////
        for (String a : arrData) {
            System.out.println("Array Trade : " + a);

            List<String> items = Arrays.asList(a.split("\\s*,\\s*"));
            System.out.println("arrayitems  : " + items.toString());

            String qw = items.get(0);
            System.out.println(qw + "**");
            
            TradeStructure ts = new TradeStructure();
            ts.setSeqNo(items.get(0));
            ts.setMkt(items.get(1));
            ts.setTrdNo(items.get(2));
            ts.setTrdTm(items.get(3));
            ts.setTkn(items.get(4));
            ts.setTrdQty(items.get(5));
            ts.setTrdPrc(items.get(6));
            ts.setBsFlg(items.get(7));
            ts.setOrdNo(items.get(8));
            ts.setBrnCd(items.get(9));
            ts.setUsrId(items.get(10));
            ts.setProCli(items.get(11));
            ts.setCliActNo(items.get(12));
            ts.setCpCd(items.get(13));
            ts.setRemarks(items.get(14));
            ts.setActTyp(items.get(15));
            ts.setTCd(items.get(16));
            ts.setOrdTm(items.get(17));
            ts.setMktTyp(items.get(18));
            ts.setAucNo(items.get(19));
            ts.setStpTyp(items.get(20));
            ts.setOppBrokerCd(items.get(21));
            ts.setTrdTrigPrc(items.get(22));
            ts.setCtclId(items.get(23));
            ts.setOrdInst(items.get(24));
            ts.setSecIdentifier(items.get(25));
            
//            ArrayData ar=new ArrayData();
//            ar.data();
        }
        return ar.data();
    }

    public static void main(String[] args) throws IOException, SQLException {
        
        Notis2 n = new Notis2();
        n.start();

    }
}
