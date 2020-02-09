package com.service.table;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayData {

    public static Object[] data() {

        ArrayList<Object> list = new ArrayList<>(2);
TradeStructure ts=new TradeStructure();
//      ts.getSeqNo(),ts.getMkt(),ts.getTrdNo(),ts.getTrdTm(),ts.getTkn(),ts.getTrdQty(),ts.getTrdPrc(),
//      ts.getBsFlg(),ts.getOrdNo(),ts.getBrnCd(),ts.getUsrId(),ts.getProCli(),ts.getCliActNo(),
//      ts.getCpCd(),ts.getRemarks(),ts.getActTyp(),ts.getTCd(),ts.getOrdTm(),ts.getMktTyp(), 
//      ts.getAucNo(),ts.getStpTyp(),ts.getOppBrokerCd(),ts.getTrdTrigPrc(),ts.getCtclId(),ts.getOrdInst(),ts.getSecIdentifier()});
        list.add(ts.getSeqNo());
        list.add(ts.getMkt());
        list.add(ts.getTrdNo());
        list.add(ts.getTrdTm());
        list.add(ts.getTkn());
        list.add(ts.getTrdQty());
        list.add(ts.getTrdPrc());
        list.add(ts.getBsFlg());
        list.add(ts.getOrdNo());
        list.add(ts.getBrnCd());
        list.add(ts.getUsrId());
        list.add(ts.getProCli());
        list.add(ts.getCliActNo());
        list.add(ts.getCpCd());
        list.add(ts.getRemarks());
        list.add(ts.getActTyp());
        list.add(ts.getTCd());
        list.add(ts.getOrdTm());
        list.add(ts.getMktTyp());
        list.add(ts.getAucNo());
        list.add(ts.getStpTyp());
        list.add(ts.getOppBrokerCd());
        list.add(ts.getTrdTrigPrc());
        list.add(ts.getCtclId());
        list.add(ts.getOrdInst());
        list.add(ts.getSecIdentifier());
       
        //Convert to object array
        Object[] array = list.toArray();

//        System.out.println(Arrays.toString(array));
//        //Iterate and convert to desired type
//        for (Object o : array) {
//            String s = (String) o;
//            System.out.println(s);
//        }
        return array;
    }
}
