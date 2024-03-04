package org.example.actuatordemo.component;

import java.util.Set;

public class GetOrderTable {
    public static void main(String[] args) throws Exception {
        String tableName=null;
        String policyNo="2402280119362uq6ar03hdbzHFBANK01";
        char[] c = policyNo.substring(policyNo.length()-2).toCharArray();
        if(47<c[0]&&c[0]<58&&47<c[1]&&c[1]<58) {
            tableName= "tb_finance_policyno_index"+"_"+((c[0]*10+c[1])%8+1);
        }else {
            tableName= "tb_finance_policyno_index"+"_1";
        }
        System.out.println(tableName);

//        Set<String> coopProductIds = Sets.newHashSet("ss","aa");
    }
}
